package com.sau.dti.method;

public class MyClassMet02 {
    public static void showWow() {
        System.out.println("Wow Wow wow");
    }

    public static void sumnumber(int num1 , int num2) {
        System.out.println(num1+num2);
    }

    public static String showSawadasdee() {
        return "Sawasdee Jaaaaaa...";
    }

    public static double calPowNumber(int a,int b) {
        return Math.pow(a,b);
    }

    public static void main(String[] args) {
        showWow();
        showWow();
        showWow();

        sumnumber(10,20);
        sumnumber(100,200);

        System.out.println(showSawadasdee() );
        String data = showSawadasdee();
        System.out.println(data +"NinniN");

        System.out.println(calPowNumber(10,2));
        double result = calPowNumber(5,3);
        System.out.println("5^3="+result);
    }
}
