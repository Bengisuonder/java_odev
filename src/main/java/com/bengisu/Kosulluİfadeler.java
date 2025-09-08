package com.bengisu;

import java.util.Scanner;

public class Kosulluİfadeler
{
    public static void main(String[] args)
    {
        //Sınav Notu Değerlendirme
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sınav notunu giriniz (0-100): ");
        int not = scanner.nextInt();

        if (not >= 50) {
            System.out.println("Başarılı ✅");
        } else {
            System.out.println("Başarısız ❌");
        }

        scanner.close();
         */
        //Dört İşlem
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        System.out.print("İşlem seçin (+, -, *, /): ");
        char islem = scanner.next().charAt(0);

        double sonuc;

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Sonuç: " + sonuc);
                } else {
                    System.out.println("Hata: Sıfıra bölme yapılamaz!");
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçtiniz!");
        }

        scanner.close();
         */
        //Haftanın Günleri
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 ile 7 arasında bir sayı giriniz: ");
        int gun = scanner.nextInt();

        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçersiz giriş! 1-7 arasında sayı giriniz.");
        }

        scanner.close();
         */
        //İndirim Hesaplama
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ürün fiyatını giriniz: ");
        double fiyat = scanner.nextDouble();

        System.out.print("İndirim yüzdesini giriniz (0-100): ");
        double indirim = scanner.nextDouble();

        if (indirim >= 0 && indirim <= 100) {
            double indirimliFiyat = fiyat - (fiyat * indirim / 100);
            System.out.println("İndirimli fiyat: " + indirimliFiyat + " TL");
        } else {
            System.out.println("Geçersiz indirim yüzdesi!");
        }

        scanner.close();
         */
    }
}
