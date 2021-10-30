package de.hft_stuttgart.huto1bif.zeichenketten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextAnalyseLambda {

  public static void main(String[] args) throws IOException {
    System.out.print("Geben Sie einen Satz ein: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String satz;

    satz = br.readLine();
    satz = satz.toLowerCase();
    // Die Würde des Menschen ist unantastbar.

    Map<String, Long> charCount = Stream
      .of(satz.split(""))
      // .map(x -> x = x.substring(0, 0))
      // .filter(x -> x.charAt(0) > 'a' || x.charAt(0) < 'z')
      .collect(
        Collectors.groupingBy(Function.identity(), Collectors.counting())
      );
    charCount.remove(" ");
    charCount.remove(".");

    charCount
      .entrySet()
      .forEach(entry ->
        System.out.println(entry.getKey() + ": \t" + entry.getValue())
      );
    Long sum = charCount.values().stream().reduce(0L, (x, y) -> x + y);
    charCount.values().stream().forEach(System.out::println);
    System.out.println("Summe: \t" + sum);
  }
}
