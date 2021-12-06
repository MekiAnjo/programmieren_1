import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OuterClass {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(
      List.of(23, 56, 1, 7, 1000, 45, 30, 135, 88, 567, 1_631_594)
    );

    ArrayList<String> strings = new ArrayList<>();

    strings.add("Hallo");
    strings.add("Felix");
    strings.add("Welt");

    Comparator<String> comp = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    };

    strings.sort(comp);
    System.out.println(Arrays.toString(strings.toArray()));

    numbers.sort(
      new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
          return o1 > o2 ? 1 : (o1 == o2 ? 0 : -1);
        }
      }
    );

    System.out.println(Arrays.toString(numbers.toArray()));
  }
}
