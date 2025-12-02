import java.util.Scanner;

public class NilaiMahasiswa07 {
  // a. Array 1d
  public static void isianArray(double[] nilai) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
        }
    }

    // b. Fungsi tampilArray (menampilkan seluruh isi array)
    public static void tampilArray(double[] nilai) {
        System.out.println("\n=== Daftar Nilai Mahasiswa ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilai[i]);
        }
    }

    // c. Fungsi hitTot (menghitung total seluruh nilai)
    public static double hitTot(double[] nilai) {
        double total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }
    // d. Fungsi main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // membaca jumlah mahasiswa (N)
        System.out.print("Masukkan jumlah mahasiswa : ");
        int N = input.nextInt();

        // membuat array ukuran N
        double[] nilaiMahasiswa = new double[N];

        // memanggil fungsi-fungsi
        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);

        double totalNilai = hitTot(nilaiMahasiswa);

        // menampilkan total nilai
        System.out.println("\nTotal nilai seluruh mahasiswa = " + totalNilai);
    }
}
