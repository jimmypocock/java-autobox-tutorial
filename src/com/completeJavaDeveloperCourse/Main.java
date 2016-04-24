/*
 * Autoboxing = wrapping a primitive date type in a class.
 * Unboxing = turning a wrapper class back into primitive data type.
 */

package com.completeJavaDeveloperCourse;

import java.util.ArrayList;

class IntClass {
    private int myInt;

    public IntClass(int myInt) {
        this.myInt = myInt;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Jimmy");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // At compile time turns into Integer.valueOf(56);
        int intValue = myIntValue.intValue();


    }
}
