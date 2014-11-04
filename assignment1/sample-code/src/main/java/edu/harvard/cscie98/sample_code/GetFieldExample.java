package edu.harvard.cscie98.sample_code;

public class GetFieldExample {

  int intField = 42;
  int total;

  public static void main(final String[] args) {
    final GetFieldExample f = new SubGetFieldExample();
    f.intField = 10;
    ((SubGetFieldExample) f).intField = 20;
    final int thisfield = f.intField;
    final int subfield = ((SubGetFieldExample) f).intField;
    f.total = thisfield + subfield;
  }
}

class SubGetFieldExample extends GetFieldExample {
  int intField = 43;
  int total;
}
