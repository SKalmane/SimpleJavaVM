package edu.harvard.cscie98.sample_code;
/**
 * Created by shashank on 11/30/14.
 */
public class Allocation3 {

    private String str1;

    public Allocation3(final String str) {
        str1 = str;
    }

    public void displayString() {
        System.out.println(str1);
    }

    public static void main(final String[] args) {
        for(int i = 1; i < 550; i++) {
            Allocation3 blah = new Allocation3("Hello");
            blah.displayString();
        }
    }
}
