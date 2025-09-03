package com.bengisu;

import java.util.Scanner;

public class MantıksalIfadeler
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi < 0)
        {
            System.out.println("Negatif sayı");
        }
        else if (sayi > 0)
        {
            System.out.println("Pozitif sayı");
        }
        else
        {
            System.out.println("Sayı sıfırdır.");
        }
    }
}
