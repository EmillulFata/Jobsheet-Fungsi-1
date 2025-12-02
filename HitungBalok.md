1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari
program dijalankan hingga menampilkan luas persegi panjang dan volume balok! 
2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna 
memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur 
jalannya program sampai output tersebut muncul. 
3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut! 
public class HitungBalok07 {
public static void TampilHinggaKei(int i) {
for (int j = 1; j <= i; j++) {
System.out.print(j);
 }
}
public static int Jumlah (int bill, int bil2) {
return (bill + bil2);
}
public static void Tampillumlah (int bill, int bil2) {
TampilHinggaKei(Jumlah(bill, bil2));
}
public static void main (String[ ] args) {
int temp = Jumlah(1, 1);
TampilJumlah(temp, 5);
 }
}
4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan! 
5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5. 
6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitungVolume.

Jawab :
1. Alur :
a. Program dimulai (eksekusi dimulai)
b. Membuat objek Scanner
c. Deklarasi variabel
d. Program meminta pengguna memasukkan panjang
e. Program meminta pengguna memasukkan lebar
f. Program meminta pengguna memasukkan tinggi
g. Menghitung luas alas (persegi panjang)
h. Menghitung volume balok
i. Menampilkan hasil

2. Alur :
Program mulai dijalankan dan Scanner dibuat untuk membaca input.
Program menampilkan tulisan "Masukkan panjang" lalu pengguna memberi input 4, disimpan ke variabel p.
Program menampilkan "Masukkan lebar" lalu pengguna memasukkan 3, disimpan ke variabel l.
Program menampilkan "Masukkan tinggi" lalu pengguna memasukkan 5, disimpan ke variabel t.
Program menghitung luas alas:
L = p * l = 4 * 3 = 12
Program menghitung volume balok:
vol = p * l * t = 4 * 3 * 5 = 60
Program menampilkan hasil:
"Luas persegi panjang adalah 12"
"Volume balok adalah 60"

3. Output :
temp = Jumlah(1, 1) → hasil = 2
Lalu dipanggil fungsi Tampillumlah(temp, 5)
Fungsi Tampillumlah akan menghitung: Jumlah(2, 5) = 7
Lalu tampil: TampilHinggaKei(7)
Sehingga mencetak angka 1 sampai 7
Alur :
-. Program mulai dari main()
-. Memanggil Jumlah(1, 1)
-. Menjalankan Tampillumlah(temp, 5)
-. Menjalankan TampilHinggaKei(7)
-. Output muncul di layar

4. Fungsi membutuhkan data dari luar agar dapat bekerja.
Nilai yang digunakan dalam fungsi berubah-ubah.
Perhitungan atau proses tergantung input dari pemanggil fungsi.

-. Fungsi boleh tanpa parameter ketika:
Semua data yang dibutuhkan sudah tersedia di dalam fungsi.
Fungsi hanya menampilkan teks atau melakukan tugas tetap (tidak butuh input).

-. Fungsi harus memiliki nilai kembalian (return value) ketika:
Fungsi menghitung suatu nilai dan hasilnya diperlukan untuk proses selanjutnya.
Hasil fungsi akan dipakai oleh bagian lain, misalnya untuk dicetak, disimpan, atau dihitung lagi.

-. Fungsi boleh tanpa nilai kembalian (void) ketika:
Fungsi hanya melakukan suatu aksi seperti:
mencetak ke layar,
menampilkan menu,
memberi pesan,
tidak menghasilkan nilai matematis.

5. Fungsi hitungLuas(p, l) dan hitungVolume(p, l, t)
Sebaiknya menggunakan parameter, karena:
luas dan volume berubah tergantung nilai panjang, lebar, tinggi
fungsi harus menerima nilai berbeda-beda dari pengguna
perhitungan tidak bisa dilakukan tanpa data dari luar

-. Kapan fungsi boleh tanpa parameter?
Jika fungsinya hanya menampilkan sesuatu, misalnya:

public static void tampilanMenu() {
    System.out.println("=== Program Hitung Balok ===");
}
Fungsi ini tidak butuh input dari luar, jadi tidak perlu parameter.

6. Perlu nilai kembalian (return)
Jika fungsi menghasilkan nilai yang akan dipakai lagi.
Contohnya:
hitungLuas() dan hitungVolume() → menghitung sesuatu, hasilnya harus dikembalikan agar bisa ditampilkan atau diproses lagi.

Tidak perlu nilai kembalian (void)
Jika fungsi hanya melakukan aksi, bukan menghasilkan nilai.
Contoh:
main() → hanya menjalankan program, tidak menghasilkan nilai untuk dikembalikan.