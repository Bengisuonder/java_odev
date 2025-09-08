package com.bengisu;

import java.util.Scanner;

public class StringMethodlari
{
    public static void main(String[] args)
    {
        //Uuzunluk
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir dize girin: ");
        String input = scanner.nextLine();

        System.out.println("Dizenin uzunluğu: " + input.length());

        scanner.close();
         */
        //Büyük/Küçük Harf
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir dize girin: ");
        String input = scanner.nextLine();

        System.out.println("Büyük harf: " + input.toUpperCase());
        System.out.println("Küçük harf: " + input.toLowerCase());

        scanner.close();
         */
        //Alt Dize
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir dize girin: ");
        String input = scanner.nextLine();

        System.out.print("Başlangıç indexini girin: ");
        int start = scanner.nextInt();

        System.out.print("Bitiş indexini girin: ");
        int end = scanner.nextInt();

        if (start >= 0 && end <= input.length() && start < end) {
            System.out.println("Alt dize: " + input.substring(start, end));
        } else {
            System.out.println("Geçersiz index değerleri!");
        }

        scanner.close();
         */
        //Dize Karşılaştırma
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci dizeyi girin: ");
        String dize1 = scanner.nextLine();

        System.out.print("İkinci dizeyi girin: ");
        String dize2 = scanner.nextLine();

        if (dize1.equals(dize2)) {
            System.out.println("Dizeler aynıdır");
        } else {
            System.out.println("Dizeler farklıdır");
        }

        scanner.close();
         */
        //Dize Birleştirme
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci diziyi girin: ");
        String dize1 = scanner.nextLine();

        System.out.print("İkinci diziyi girin: ");
        String dize2 = scanner.nextLine();

        String sonuc = dize1 + dize2;

        System.out.println("Birleşmiş dize: " + sonuc);

        scanner.close();
         */
        //Dize Bölme
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir dize girin: ");
        String input = scanner.nextLine();

        System.out.print("Ayırıcı karakteri girin: ");
        String ayirici = scanner.nextLine();

        String[] parcalar = input.split(ayirici);

        System.out.println("Bölünmüş dizeler:");
        for (String p : parcalar) {
            System.out.println(p);
        }

        scanner.close();
         */
    }
}
