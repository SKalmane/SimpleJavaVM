package edu.harvard.cscie98.sample_code;

public class NullPointerSetField {
  public static void main(final String[] args) {
    SomeClass t = null;
    t.setBlah(10);
      System.out.println("Value is: " + t.blah1);
  }
}
