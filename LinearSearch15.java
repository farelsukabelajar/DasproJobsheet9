import java.util.Scanner;

public class LinearSearch15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);

        System.out.print("Masukan banyaknya elemen array: ");
        int n = sc15.nextInt();

        int[] arrayInt = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            arrayInt[i] = sc15.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc15.nextInt();

        int hasil = -1;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Key " + key + " ada dalam array di indeks ke-" + hasil);
        } else {
            System.out.println("Key " + key + " tidak ditemukan dalam array.");
        }
    }
}
