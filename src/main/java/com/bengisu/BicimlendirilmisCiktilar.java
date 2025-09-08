package com.bengisu;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class BicimlendirilmisCiktilar
{
    public static void main(String[] args)
    {
        //Telefon
        /*
        String numara = "1234567890";
        String formatli = String.format("(%s) %s-%s",
                numara.substring(0, 3),
                numara.substring(3, 6),
                numara.substring(6));

        System.out.println(formatli);
         */
        //Tarih
        /*
        String giris = "2023-10-30";

        LocalDate tarih = LocalDate.parse(giris); // ISO formatını direkt tanıyor
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy", new Locale("tr"));

        String cikti = tarih.format(formatter);
        System.out.println(cikti);
         */
        //Para
        /*
        double sayi = 1234567.89;

        NumberFormat nf = NumberFormat.getNumberInstance(Locale.GERMANY);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        String sonuc = "USD " + nf.format(sayi);
        System.out.println(sonuc);
         */
        //Dize
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String ad = scanner.nextLine();

        System.out.print("Soyadınızı girin: ");
        String soyad = scanner.nextLine();

        String mesaj = String.format("Merhaba, %s %s!", ad, soyad);
        System.out.println(mesaj);

        scanner.close();
         */
    }
}
