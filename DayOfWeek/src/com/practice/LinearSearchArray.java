package com.practice;

import java.util.Scanner;

public class LinearSearchArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scan.nextInt();
        String[] arr = new String[length]; 
        System.out.println("Enter the elements of the array:");
        scan.nextLine();
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scan.nextLine(); 
        }
        System.out.print("Enter the value to search for: ");
        String searchValue = scan.nextLine(); 
        boolean found = false;
        for (int i = 0; i < length; i++) {
            if (arr[i].equals(searchValue)) { 
                found = true;
                System.out.println("Value " + searchValue + " found at index " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Value " + searchValue + " not found in the array.");
        }
        scan.close();
    }
}
