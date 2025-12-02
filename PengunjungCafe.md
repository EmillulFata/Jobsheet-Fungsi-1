1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... 
namaPengunjung! 
2. Modifikasi method daftarPengunjung menggunakan for-each loop. 
3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya! 
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa
argumen. 
Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?

Jawab :
1. String... namaPengunjung adalah fitur Java yang memungkinkan sebuah fungsi menerima jumlah argumen yang tidak terbatas dengan tipe data yang sama.
2. done
3. Bisa, tetapi hanya satu yang boleh menjadi varArgs, dan harus berada di posisi paling akhir. Artinya: Tidak boleh ada dua parameter varArgs dalam satu metode.
Contoh :
public void kirimPesan(String tipePesan, int prioritas, String... daftarPenerima) {
    System.out.println("Tipe Pesan: " + tipePesan);
    System.out.println("Prioritas: " + prioritas);

    System.out.println("Dikirim ke:");
    for (String penerima : daftarPenerima) {
        System.out.println("- " + penerima);
    }
}
4. Program tidak error baik saat kompilasi maupun saat dijalankan.
Karena:
String... berarti parameter boleh menerima 0, 1, atau banyak argumen.
Ketika tidak ada argumen, Java otomatis membuat array kosong untuk parameter tersebut. saat dijalankan Method akan tetap berjalan normal.
Nilai namaPengunjung menjadi array kosong (String[0]).
Sehingga bagian for-each tidak akan menampilkan nama apa pun.