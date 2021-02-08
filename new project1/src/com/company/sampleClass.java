package com.company;

public class sampleClass {
    static  String  abc="Priya";
    int age=30;
    public static void main(String[] args) {
        System.out.println("hello "+abc);
        sampleClass object1=new sampleClass();
        object1.name();
        object1.age();
        int output=object1.add(6,7);
        System.out.println(output);
    }
    public void name()
    {
        System.out.println("hello "+abc);
    }
    public void age()
    {
        System.out.println("hello "+age);
    }

    public int add(int a,int b)
    {
        return a+b;
    }
}
