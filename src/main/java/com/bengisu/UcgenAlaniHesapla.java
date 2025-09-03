package com.bengisu;

import java.util.Scanner;

public class UcgenAlaniHesapla
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin tabanını giriniz: ");
        int taban = input.nextInt();
        System.out.println("Üçgenin yüksekliğini giriniz: ");
        int yukseklik = input.nextInt();
        int alan = taban*yukseklik/2;
        System.out.println("Üçgenin alanı: "+ alan);
    }
}
