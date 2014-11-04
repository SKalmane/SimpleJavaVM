package edu.harvard.cscie98.sample_code;

public class Scratch2 {
    
  public static void main(final String[] args) {
      final InliningBase d = new InliningD();
      d.arithmetic(10, 1);
      System.out.println("Value: " + d.arithmetic(10, 1));
  }
}

class InliningBase {
  public int arithmetic(final int a, final int b) {
    return a + b;
  }
}

class InliningD extends InliningBase {
  @Override
  public int arithmetic(final int a, final int b) {
    return super.arithmetic(a, b) - b;
  }

}
