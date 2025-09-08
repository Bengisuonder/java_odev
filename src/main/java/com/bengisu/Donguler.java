package com.bengisu;

import java.util.Scanner;

public class Donguler
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String devam;

        do {
            System.out.print("Çarpım tablosu boyutunu giriniz: ");
            int n = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print((i * j) + "\t");
                }
                System.out.println();
            }

            System.out.print("Başka bir çarpım tablosu oluşturmak ister misiniz? (evet/hayır): ");
            devam = scanner.next().toLowerCase();

        } while (devam.equals("evet"));

        System.out.println("Program sonlandırıldı.");
        scanner.close();
    }
}
