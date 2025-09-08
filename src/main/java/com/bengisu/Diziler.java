package com.bengisu;

import java.util.*;

public class Diziler
{
    public static void main(String[] args)
    {
        //Dizi Başlatma
        /*
        int[] sayilar = {2, 4, 6, 8, 10};

        System.out.println("Dizi içeriği:");
        for (int s : sayilar) {
            System.out.print(s + " ");
        }
         */
        //Dizi Toplamı
        /*
        int[] sayilar = {2, 4, 6, 8, 10};
        int toplam = 0;

        for (int s : sayilar) {
            toplam += s;
        }

        System.out.println("Dizinin toplamı: " + toplam);
         */
        //Büyük/Küçük Bulma
        /*
        int[] sayilar = {12, 4, 56, 8, 23, 5};

        int min = sayilar[0];
        int max = sayilar[0];

        for (int s : sayilar) {
            if (s < min) min = s;
            if (s > max) max = s;
        }

        System.out.println("En küçük: " + min);
        System.out.println("En büyük: " + max);
         */
        //Dizi Sıralama
        /*
        int[] sayilar = {12, 4, 56, 8, 23, 5};

        Arrays.sort(sayilar);

        System.out.println("Sıralanmış dizi: " + Arrays.toString(sayilar));
         */
        //Dizide Arama
        /*
        int[] sayilar = {12, 4, 56, 8, 23, 5};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aranacak sayıyı girin: ");
        int aranan = scanner.nextInt();

        boolean bulundu = false;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == aranan) {
                System.out.println("Sayı bulundu! İndeks: " + i);
                bulundu = true;
                break;
            }
        }

        if (!bulundu) {
            System.out.println("Sayı bulunamadı.");
        }

        scanner.close();
         */
        //Diziyi Ters Çevirme
        /*
        int[] sayilar = {1, 2, 3, 4, 5};
        int n = sayilar.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = sayilar[i];
            sayilar[i] = sayilar[n - 1 - i];
            sayilar[n - 1 - i] = temp;
        }

        System.out.println("Ters çevrilmiş dizi: " + Arrays.toString(sayilar));
         */
        //Dizi Çoğaltma
        /*
        int[] sayilar = {1, 2, 3, 2, 4, 1, 5};

        Set<Integer> set = new LinkedHashSet<>();
        for (int s : sayilar) {
            set.add(s);
        }

        System.out.println("Tekrarsız dizi: " + set);
         */
        //İki Boyutlu Dizi
        /*
        int[][] tablo = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("2D Dizi:");
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j] + "\t");
            }
            System.out.println();
        }
         */
        //Dizi İşleme
        /*
        int[] sayilar = {10, 20, 30, 40, 50};
        int silinecekIndex = 2; // 30 silinsin
        int yeniEleman = 99;

        sayilar[silinecekIndex] = yeniEleman;

        System.out.println("Yeni dizi: " + Arrays.toString(sayilar));
         */
        //Dizi İstatistikleri
        /*
        int[] sayilar = {1, 2, 2, 3, 4, 4, 4, 5};

        // Ortalama
        double toplam = 0;
        for (int s : sayilar) toplam += s;
        double ortalama = toplam / sayilar.length;

        // Medyan
        Arrays.sort(sayilar);
        double medyan;
        if (sayilar.length % 2 == 0) {
            medyan = (sayilar[sayilar.length/2 - 1] + sayilar[sayilar.length/2]) / 2.0;
        } else {
            medyan = sayilar[sayilar.length/2];
        }

        // Mod
        Map<Integer, Integer> frekans = new HashMap<>();
        for (int s : sayilar) {
            frekans.put(s, frekans.getOrDefault(s, 0) + 1);
        }
        int mod = sayilar[0];
        int maxFrekans = 0;
        for (Map.Entry<Integer, Integer> entry : frekans.entrySet()) {
            if (entry.getValue() > maxFrekans) {
                maxFrekans = entry.getValue();
                mod = entry.getKey();
            }
        }

        System.out.println("Ortalama: " + ortalama);
        System.out.println("Medyan: " + medyan);
        System.out.println("Mod: " + mod);
         */
    }
}
