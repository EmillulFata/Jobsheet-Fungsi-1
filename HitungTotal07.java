import java.util.Scanner;

public class HitungTotal07 {
    public static void Menu() {
        System.out.println("=== MENU KAFE ===");
        System.out.println("1. Kopi Hitam        - Rp15000");
        System.out.println("2. Cappuccino        - Rp20000");
        System.out.println("3. Caffè Latte       - Rp22000");
        System.out.println("4. Teh Tarik         - Rp12000");
        System.out.println("5. Es Teh Manis      - Rp10000");
        System.out.println("6. Jus Jeruk         - Rp18000");
    }
    public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Menu();
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = input.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = input.nextInt();

        int totalHarga = hitungTotalHargaNoAbsen(pilihanMenu, banyakItem);
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
}
