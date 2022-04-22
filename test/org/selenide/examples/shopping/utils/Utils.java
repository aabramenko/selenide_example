package org.selenide.examples.shopping.utils;

public class Utils {

    private static String line =       "-------------------------------------------------------------";

    private static String doubleLine = "=============================================================";

    public static void log(String s) {
        System.out.println("[INFO] " + s);
    }

    public static void testHeader(String s) {
        System.out.println(doubleLine);
        System.out.println("Test Case :: " + s);
        System.out.println(doubleLine);
    }

}
