import java.util.Scanner;

public class RekapPenjualanCafeNoAbsen {
    int[][] penjualan;
    String[] menu;
    int jumlahMenu;
    int jumlahHari;

    public void inputData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        jumlahMenu = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan jumlah hari penjualan: ");
        jumlahHari = input.nextInt();
        input.nextLine();

        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = input.nextLine();
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Penjualan " + menu[i] + " hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
            input.nextLine();
        }
    }
    public void TampilkanData() {
        System.out.printf("%-10s", "Menu");
    for (int j = 0; j < jumlahHari; j++) {
        System.out.printf("%-10s", "Hari " + (j + 1));
    }
    System.out.println();

    for (int i = 0; i < jumlahMenu; i++) {
        System.out.printf("%-10s", menu[i]);
        for (int j = 0; j < jumlahHari; j++) {
            System.out.printf("%-10d", penjualan[i][j]);
        }
        System.out.println();
    }
    }
    public void MenuTerlaris() {
        int maxTotal = 0;
        int indexMax = 0;

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            indexMax = (total > maxTotal) ? i : indexMax;
            maxTotal = (total > maxTotal) ? total : maxTotal;
        }
        System.out.println("Menu terlaris: " + menu[indexMax] + " dengan total " + maxTotal + " penjualan.");
    }
    public void RerataPenjualan() {
        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += penjualan[i][j];
            }
            double rata = total / (double) jumlahHari;
            String kategori = (rata >= 30) ? "Laris" : (rata >= 15) ? "Sedang" : "Kurang Laris";
            System.out.println(menu[i] + " - Rata-rata: " + rata + " (" + kategori + ")");
        }
    }
    public static void main(String[] args) {
        RekapPenjualanCafeNoAbsen cafe = new RekapPenjualanCafeNoAbsen();
        cafe.inputData();
        cafe.TampilkanData();
        cafe.MenuTerlaris();
        cafe.RerataPenjualan();
    }
}

