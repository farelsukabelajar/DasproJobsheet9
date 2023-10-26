import java.util.Scanner;

public class ArrayRataNilai15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);

        int jumlahMhs;
        int mhsLulus = 0;
        int mhsTdkLulus = 0;
        double totalLulus = 0;
        double totalTdkLulus = 0;
        double rata2Lulus, rata2TdkLulus;

        System.out.print("Masukan jumlah mahasiswa: ");
        jumlahMhs = sc15.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukan nilai mhs ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc15.nextInt();
        }

        for (int i = 0; i < jumlahMhs; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                mhsLulus++;
            } else {
                totalTdkLulus += nilaiMhs[i];
                mhsTdkLulus++;
            }
        }

        rata2Lulus = (mhsLulus > 0) ? totalLulus / mhsLulus : 0;
        rata2TdkLulus = (mhsTdkLulus > 0) ? totalTdkLulus / mhsTdkLulus : 0;

        System.out.println("Rata-rata nilai lulus adalah " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus adalah " + rata2TdkLulus);
    }
}
