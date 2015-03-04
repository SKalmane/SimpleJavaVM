package edu.harvard.cscie98.sample_code;

import java.lang.Integer; 

public class Allocation2 {
    private Integer num1, num2, num3;
    private String str1;

    public Allocation2(final int arg1, final int arg2, final int arg3, final String str) {
      num1 = arg1;
      num2 = arg2;
      num3 = arg3;
      str1 = str;
      //System.out.println("This is the " + num1 + " object");
  }

    public Integer addOff() {
        Integer int1 = new Integer(num1);
        Integer int2 = new Integer(num2);
        //System.out.println("Hello");
        return int1 + int2;
    }

    public static void main(final String[] args) {
        for(int i = 1; i < 1500; i++) {
            Allocation2 blah = new Allocation2(i, 0, 3, "Hello");
            Integer t = blah.addOff();
            Allocation2 temp = new Allocation2(i, i+1, 2, " World!");
        }
    }
}
