1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembali
(return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan
minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus. 
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe. 
3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka 
mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode 
promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga. 
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)? 

Jawab : 
1. Fungsi membutuhkan return value ketika fungsi itu menghasilkan sebuah nilai yang akan dipakai kembali oleh program lain (misalnya fungsi main).Return value dibutuhkan jika hasil perhitungan harus disimpan, digunakan ulang, atau
ditampilkan. Contoh :
public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem)
2. Fungsi hitungTotalHargaNoAbsen mengembalikan tipe data int, karena hasil
akhirnya adalah total harga dalam bentuk angka bulat.
Fungsi memiliki dua parameter berikut:
1 int pilihanMenu
Artinya: nomor menu yang dipilih pelanggan (1–6).
Digunakan untuk mengambil harga dari array hargaItems.
2️. int banyakItem
Artinya: jumlah porsi/item yang dipesan pelanggan.
Digunakan untuk menghitung total harga = harga satu item × jumlah item.
3. done
4. done