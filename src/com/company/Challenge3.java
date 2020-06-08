package com.company;

public class Challenge3 {
    public static void main(String[] args)
    {


        line();
        top();
        bottom();
        line();
        bottom();
        top();
        line();

    }
public static void line(){ System.out.println("+---------+"); }
public static void top(){
    System.out.println("|    *    |");
    System.out.println("|   /*\\   |");
    System.out.println("|  //*\\\\  |");
    System.out.println("| ///*\\\\\\ |");
}
public static void bottom(){
        System.out.println("| \\\\\\*/// |");
        System.out.println("|  \\\\*//  |");
        System.out.println("|   \\*//  |");
        System.out.println("|    *    |");

    }

}


