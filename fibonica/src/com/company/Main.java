package com.company;

public class Main {

    public static void main(String[] args) {
    int firstNum=0, secondNum=1, n=10;
    int thirdNum;
    System.out.print("Fibonica number: ");
    for (int i=0; i<n; i++)
    {
        System.out.print(firstNum+", ");
        thirdNum= firstNum+secondNum;
        firstNum=secondNum;
        secondNum=thirdNum;
    }
    }
}
