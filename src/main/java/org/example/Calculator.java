package org.example;


public class Calculator {

<<<<<<< HEAD
    public int subtract(Integer a, Integer b) {
        return a - b;
=======
    public int subtract(String a, String b) {
        return Integer.valueOf(a) - Integer.valueOf(b);
>>>>>>> tkaczmarzyk/master
    }
}
