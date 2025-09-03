package com.bengisu;

import java.util.Scanner;

public class KullaniciGirisi
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz: ");
        String kullanici_adi = input.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        String sifre = input.nextLine();
        if (kullanici_adi.equals("kullanici")&&sifre.equals("sifre"))
        {
            System.out.println("Giriş başarılı.");
        }
        else
        {
            System.out.println("Hatalı kullanıcı adı ya da şifre girdiniz.");
        }
    }
}
