public class CPCalculator {

  static int cpPerModule = 6;

  public static int cpBerechnen(int moduleAmount, int currentSem) {
    int remainingSemesters = 10 - currentSem;
    int remainingCP = moduleAmount * cpPerModule;
    return remainingCP / remainingSemesters;
  }

  public static void main(String[] args) {
    int numberOfModules = 15;
    int currentSemester = 5;

    System.out.println(
      "Sie sollten " +
      cpBerechnen(numberOfModules, currentSemester) +
      " CP pro Semseter erzielen."
    );
  }
}
