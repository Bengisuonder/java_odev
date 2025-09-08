package com.bengisu;

import java.util.Arrays;
import java.util.Scanner;

public class DizilerIki
{
    //Sıralama Algoritmaları
    /*
        // Bubble Sort
        public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

        // Merge Sort
        public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

        private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

        // Quick Sort
        public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

        private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }

        public static void main(String[] args) {
        int[] dizi1 = {64, 25, 12, 22, 11};
        bubbleSort(dizi1);
        System.out.println("Bubble Sort: " + Arrays.toString(dizi1));

        int[] dizi2 = {64, 25, 12, 22, 11};
        mergeSort(dizi2, 0, dizi2.length - 1);
        System.out.println("Merge Sort: " + Arrays.toString(dizi2));

        int[] dizi3 = {64, 25, 12, 22, 11};
        quickSort(dizi3, 0, dizi3.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(dizi3));
    }
     */
    //Faktöriyel Hesaplama
    /*
    // Recursive yöntem
    public static long faktoriyelRecursive(int n) {
        if (n == 0 || n == 1) return 1;
        return n * faktoriyelRecursive(n - 1);
    }

    // Iteratif yöntem
    public static long faktoriyelIteratif(int n) {
        long sonuc = 1;
        for (int i = 1; i <= n; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println("Iteratif Faktöriyel: " + faktoriyelIteratif(sayi));
        System.out.println("Recursive Faktöriyel: " + faktoriyelRecursive(sayi));

        scanner.close();
    }
     */
    //Kesirli Sırt Çantası Problemi
    /*
    public static double getMaxValue(int[] weights, int[] values, int capacity) {
        int n = weights.length;

        // değer/ağırlık oranlarını hesapla
        double[] ratio = new double[n];
        for (int i = 0; i < n; i++) {
            ratio[i] = (double) values[i] / weights[i];
        }

        // sıralama için index dizisi
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) indices[i] = i;

        // oranlara göre sıralama
        java.util.Arrays.sort(indices, (a, b) -> Double.compare(ratio[b], ratio[a]));

        double totalValue = 0.0;
        int currentWeight = 0;

        for (int i : indices) {
            if (currentWeight + weights[i] <= capacity) {
                currentWeight += weights[i];
                totalValue += values[i];
            } else {
                int remaining = capacity - currentWeight;
                totalValue += values[i] * ((double) remaining / weights[i]);
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int capacity = 50;

        System.out.println("Maksimum değer: " + getMaxValue(weights, values, capacity));
    }
     */
    //Matris Çarpımı
    /*
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        int satirA = A.length;
        int sutunA = A[0].length;
        int sutunB = B[0].length;

        int[][] C = new int[satirA][sutunB];

        // Çarpım algoritması
        for (int i = 0; i < satirA; i++) {
            for (int j = 0; j < sutunB; j++) {
                for (int k = 0; k < sutunA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Sonucu yazdır
        System.out.println("Matris Çarpımı:");
        for (int i = 0; i < satirA; i++) {
            for (int j = 0; j < sutunB; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
     */
}
