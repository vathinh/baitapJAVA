package com.company;

public class Main {

    public static void main(String[] args) {
    int[] arr={1,23,4,12,5,6,8,1,1,2,5,1,10};
    int size = arr.length;
    int secondLar = size - 2;
    int count=0, n=1,max=arr[0],min=arr[0],sum=10, temp=0;
    //sorted array
    System.out.println("Sorted Array: ");
    for(int i=0; i<arr.length;i++)
    {
        for (int j=i+1; j<arr.length;j++)
        {
            if (arr[j]<arr[i])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        System.out.print(arr[i]+", ");
    }
    //second largest number
    System.out.println("\n Second Largest number is: "+arr[secondLar]);
    //occuerence of a number in array
    for (int k=0;k< arr.length;k++)
    {
        if (arr[k]==n)
        {
            count++;
        }
    }
    System.out.print("The number " +n+ " occurrence: "+count +" times");
    //min max
    for (int p=0; p< arr.length;p++)
    {
        if(arr[p]>max)
        {
            max = arr[p];
        }
    }
        for (int p=0; p< arr.length;p++)
        {
            if(arr[p]<min)
            {
                min = arr[p];
            }
        }
    System.out.print("\n Max: "+max);
    System.out.print("\n Min: "+min);
    //total of 2 number = 10
        for(int i=0; i<arr.length;i++)
        {
            for (int j=i+1; j<arr.length;j++)
            {
                if(arr[i]+arr[j]==10)
                {
                    System.out.println("\n 2 number has sum euqal 10 is:"+" "+arr[i]+" and "+arr[j]);
                }
            }
        }

    }
}
