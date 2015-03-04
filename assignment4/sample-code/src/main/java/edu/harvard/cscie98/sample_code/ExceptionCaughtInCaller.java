package edu.harvard.cscie98.sample_code;

public class ExceptionCaughtInCaller {

  public static void main(final String[] args) {
    try {
      blah(0, 1, 5);
    } catch (final SomeException e) {
        e.printStackTrace();
        System.out.println("Result: " + e.getVal());
        // System.out.println("Result: blah..");
    }
  }

    public static int blah(final int v1, final int v2, final int iterations) {
        return fib(v1, v2);
    }

  private static int fib(final int v1, final int v2) {
      throw new SomeException(v2);
  }
}

class SomeException extends RuntimeException {

  private static final long serialVersionUID = 1L;
  private final int val;

  public SomeException(final int val) {
    this.val = val;
  }

  int getVal() {
    return val;
  }

}
