package com.bengisu;

import java.util.*;

public class AlisverisSepetiGuncelleme {

    private static final int MAX_ITEMS = 10; // sepet kapasitesi
    private static Map<String, Double> urunFiyatlari = new HashMap<>();
    private static Map<String, Integer> urunStoklari = new HashMap<>();
    private static Map<String, Integer> sepet = new HashMap<>();
    private static List<Map<String, Integer>> siparisGecmisi = new ArrayList<>();

    // ürünleri başlat
    private static void urunleriBaslat() {
        urunFiyatlari.put("Apple", 2.5);
        urunFiyatlari.put("Banana", 1.5);
        urunFiyatlari.put("Orange", 3.0);

        urunStoklari.put("Apple", 10);
        urunStoklari.put("Banana", 5);
        urunStoklari.put("Orange", 8);
    }

    // sepete ürün ekle
    private static void urunEkle(String urun, int adet) {
        if (!urunFiyatlari.containsKey(urun)) {
            System.out.println("❌ Böyle bir ürün yok.");
            return;
        }
        if (sepet.size() >= MAX_ITEMS && !sepet.containsKey(urun)) {
            System.out.println("❌ Sepet dolu, yeni ürün eklenemez!");
            return;
        }
        int stok = urunStoklari.get(urun);
        if (stok < adet) {
            System.out.println("❌ Yeterli stok yok. Kalan: " + stok);
            return;
        }
        sepet.put(urun, sepet.getOrDefault(urun, 0) + adet);
        urunStoklari.put(urun, stok - adet);
        System.out.println("✅ " + adet + " adet " + urun + " sepete eklendi.");
    }

    // ürünü sepetten sil
    private static void urunSil(String urun) {
        if (sepet.containsKey(urun)) {
            int adet = sepet.get(urun);
            sepet.remove(urun);
            urunStoklari.put(urun, urunStoklari.get(urun) + adet);
            System.out.println("🗑️ " + urun + " sepetten silindi.");
        } else {
            System.out.println("❌ Ürün sepette yok.");
        }
    }

    // sepeti temizle
    private static void sepetTemizle() {
        for (Map.Entry<String, Integer> entry : sepet.entrySet()) {
            urunStoklari.put(entry.getKey(), urunStoklari.get(entry.getKey()) + entry.getValue());
        }
        sepet.clear();
        System.out.println("🧹 Sepet temizlendi.");
    }

    // toplam fiyat hesapla (indirim parametresi ile)
    private static double toplamHesapla(double indirimYuzdesi) {
        double toplam = 0;
        for (Map.Entry<String, Integer> entry : sepet.entrySet()) {
            toplam += urunFiyatlari.get(entry.getKey()) * entry.getValue();
        }
        if (indirimYuzdesi > 0) {
            toplam -= toplam * indirimYuzdesi / 100;
            System.out.println("💸 %" + indirimYuzdesi + " indirim uygulandı.");
        }
        return toplam;
    }

    // istatistikler
    private static void istatistikler() {
        if (sepet.isEmpty()) {
            System.out.println("📊 Sepet boş.");
            return;
        }
        double toplam = 0;
        int toplamAdet = 0;
        String enUcuz = null, enPahali = null;
        double minFiyat = Double.MAX_VALUE, maxFiyat = 0;

        for (Map.Entry<String, Integer> entry : sepet.entrySet()) {
            String urun = entry.getKey();
            int adet = entry.getValue();
            double fiyat = urunFiyatlari.get(urun);

            toplam += fiyat * adet;
            toplamAdet += adet;

            if (fiyat < minFiyat) {
                minFiyat = fiyat;
                enUcuz = urun;
            }
            if (fiyat > maxFiyat) {
                maxFiyat = fiyat;
                enPahali = urun;
            }
        }

        double ortalama = toplam / toplamAdet;
        System.out.println("📊 İstatistikler:");
        System.out.println("Ortalama fiyat: $" + ortalama);
        System.out.println("En ucuz ürün: " + enUcuz + " $" + minFiyat);
        System.out.println("En pahalı ürün: " + enPahali + " $" + maxFiyat);
    }

    // siparişi onayla
    private static void siparisOnayla() {
        if (sepet.isEmpty()) {
            System.out.println("❌ Sepet boş.");
            return;
        }
        siparisGecmisi.add(new HashMap<>(sepet));
        sepet.clear();
        System.out.println("✅ Sipariş onaylandı.");
    }

    // sipariş geçmişi
    private static void siparisGecmisiGoster() {
        if (siparisGecmisi.isEmpty()) {
            System.out.println("📦 Henüz sipariş yok.");
            return;
        }
        System.out.println("📦 Sipariş geçmişi:");
        int i = 1;
        for (Map<String, Integer> siparis : siparisGecmisi) {
            System.out.println("Sipariş " + (i++) + ": " + siparis);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        urunleriBaslat();

        while (true) {
            System.out.println("\n--- Menü ---");
            System.out.println("1. Ürün ekle");
            System.out.println("2. Ürün sil");
            System.out.println("3. Sepeti temizle");
            System.out.println("4. Toplam hesapla (indirimli)");
            System.out.println("5. İstatistikler");
            System.out.println("6. Siparişi onayla");
            System.out.println("7. Sipariş geçmişi");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = sc.nextInt();
            sc.nextLine();

            switch (secim) {
                case 1:
                    System.out.println("Mevcut ürünler: " + urunFiyatlari.keySet());
                    System.out.print("Ürün adı: ");
                    String urun = sc.nextLine();
                    System.out.print("Adet: ");
                    int adet = sc.nextInt();
                    urunEkle(urun, adet);
                    break;
                case 2:
                    System.out.print("Silinecek ürün adı: ");
                    String silUrun = sc.nextLine();
                    urunSil(silUrun);
                    break;
                case 3:
                    sepetTemizle();
                    break;
                case 4:
                    System.out.print("İndirim yüzdesi: ");
                    double indirim = sc.nextDouble();
                    System.out.println("Toplam: $" + toplamHesapla(indirim));
                    break;
                case 5:
                    istatistikler();
                    break;
                case 6:
                    siparisOnayla();
                    break;
                case 7:
                    siparisGecmisiGoster();
                    break;
                case 0:
                    System.out.println("👋 Çıkış yapılıyor...");
                    return;
                default:
                    System.out.println("❌ Geçersiz seçim.");
            }
        }
    }
}

