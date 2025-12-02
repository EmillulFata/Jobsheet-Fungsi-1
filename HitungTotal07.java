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

        int totalKeseluruhan = 0;
        int pilihanMenu;
        int banyakItem;

while (true) {
    Menu();
    System.out.print("\nMasukkan nomor menu (0 untuk selesai): ");
    pilihanMenu = input.nextInt();

    if (pilihanMenu == 0) {
        break;
        }
        if (pilihanMenu < 1 || pilihanMenu > 6) {
            System.out.println("Menu tidak valid! Silakan pilih lagi.");
            continue;
            }
            System.out.print("Masukkan jumlah item untuk menu tersebut: ");
            banyakItem = input.nextInt();

            int totalHarga = hitungTotalHargaNoAbsen(pilihanMenu, banyakItem);
            totalKeseluruhan += totalHarga;

            System.out.println("Subtotal pesanan menu ini: Rp" + totalHarga);
            System.out.println("-----------------------------------");
        }
        System.out.println("\nTotal keseluruhan pesanan Anda: Rp" + totalKeseluruhan);
        System.out.println("Terima kasih telah memesan!");
    }
}
