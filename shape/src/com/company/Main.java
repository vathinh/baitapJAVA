package com.company;

public class Main {

    public static void main(String[] args) {

    int n= 5;
    //square
	for(int i=0; i<n;i++)
    {
        System.out.print("\n * ");
        for(int j=n-1;j>0;j--)
        {
            System.out.print(" * ");
        }
    }
    System.out.print("\n");
    //rectangle
    for(int i=0; i<n;i++)
    {
        System.out.print("\n * ");
        for(int j=n*2-1;j>0;j--)
        {
            System.out.print(" * ");
        }
    }
        System.out.print("\n");

    //triangle
        for(int i=1;i<=n;i++)
    {
        System.out.print("\n");
        for(int j=1;j<=2*n-1;j++)
        {
            if(j>=n-(i-1) && j<=n+(i-1))
            {
                System.out.print(" * ");
            }
            else
            {
                System.out.print("   ");
            }
        }
    }
    }
}
