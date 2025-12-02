public class PengunjungCafe07 {
  static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        int nomor = 1;
        for (String nama : namaPengunjung) {
            System.out.println("- Pengunjung ke-" + nomor + ": " + nama);
            nomor++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
