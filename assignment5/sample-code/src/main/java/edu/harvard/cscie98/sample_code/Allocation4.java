package edu.harvard.cscie98.sample_code;

/**
 * Created by shashank on 12/04/14.
 */
public class Allocation4 {

    private String str1;
    private Integer i1, i2;
    private SomeClass someObj;

    public Allocation4() {
        str1 = " ";
        i1 = 0;
        i2 = 0;
        someObj = new SomeClass(0,0);
    }

    public Allocation4(final String str, final Integer intVal1,
                       final Integer intVal2, final Integer intVal3) {
        str1 = str;
        i1 = intVal1;
        i2 = 0;
        someObj = new SomeClass(intVal2, intVal3);
    }

    public void displayString() {
        System.out.println(str1);
    }

    public static void main(final String[] args) {
        Allocation4[] temp;
        temp = new Allocation4[1500];
        for(int i = 1; i < 1500; i++) {
            temp[i] = (new Allocation4("Hello", 1, 2, 3));
            Integer i1 = temp[i].getIntValue1();
            Integer i2 = temp[i].getIntValue2();
            temp[i].setIntValues(i1 + i, i2 - i);
            SomeClass someObj = temp[i].getSomeObj();
            Integer i3 = temp[i].getIntValue1();
            Integer i4 = temp[i].getIntValue2();
            someObj.setIntValues(i3, i4);
        }
    }

    private void setIntValues(Integer val1, Integer val2) {
        i1 = val1;
        i2 = val2;
    }

    private Integer getIntValue1() {
        return i1;
    }

    private Integer getIntValue2() {
        return i2;
    }

    private SomeClass getSomeObj() {
        return someObj;
    }
}

class SomeClass {
    private Integer i1, i2;

    public SomeClass(final Integer i1, final Integer i2) {
        this.i1 = i1;
        this.i2 = i2;
    }

    public void setIntValues(final Integer i1, final Integer i2) {
        this.i1 = i1;
        this.i2 = i2;
    }

    public Integer getIntValue1() {
        return i1;
    }

    public Integer getIntValue2() {
        return i2;
    }
}
