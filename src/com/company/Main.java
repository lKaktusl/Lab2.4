package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the height");
        Scanner in = new Scanner(System.in);
        double h = in.nextInt();
        double t = 0;
        t = (2*h)/9.8;
        System.out.println("Time: " + t);
    }
}
