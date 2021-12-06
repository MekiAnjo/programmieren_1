public class NumberTuple {

  private int x;
  private int y;
  private int z;

  NumberTuple(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  private class Pair {

    private boolean useZ;
    private int a = NumberTuple.this.x;
    private int b;

    Pair(boolean useZ) {
      this.useZ = useZ;
      b = useZ == true ? NumberTuple.this.y : NumberTuple.this.z;
    }

    public Pair sortPair() {
      int temp = 0;
      if (this.b < this.a) {
        temp = this.a;
        this.a = this.b;
        this.b = temp;
      }
      return this;
    }

    @Override
    public String toString() {
      return "a = " + this.a + ", b = " + this.b;
    }
  }

  public static void main(String[] args) {
    NumberTuple tuple = new NumberTuple(1, 2, -4);

    Pair pairxy = tuple.new Pair(false);
    Pair pairxz = tuple.new Pair(true);

    System.out.println(pairxy);
    System.out.println(pairxz);

    System.out.println(pairxy.sortPair());
    System.out.println(pairxz.sortPair());
  }
}
