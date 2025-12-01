1. Apakah fungsi tanpa parameter selalu harus bertipe void?
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan
   fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua
   perintah penampilan menu langsung di dalam fungsi main.
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).

Jawab :

1. Fungsi tanpa parameter tidak harus bertipe void.
2. Daftar menu pada program kafe dapat berjalan tanpa harus menggunakan fungsi.
3. Function berguna agar code bisa menjadi lebih rapi dan terstruktur
   memudahkan pemanggilan berulang, serta mudah diperbaiki dan diperbarui.
4. Alur :
   1. Program dijalankan
      JVM (Java Virtual Machine) mulai mengeksekusi kode mulai dari fungsi main().
   2. Masuk ke fungsi main()
      Eksekusi berpindah ke baris pertama dalam main().
   3. Perintah pemanggilan Menu() dibaca
      Ketika interpreter mencapai baris Menu();, Java tahu bahwa harus menjalankan fungsi tersebut.
   4. Eksekusi berpindah ke fungsi Menu()
      Program "melompat" ke definisi fungsi Menu() dan mulai menjalankan isi di dalamnya.
   5. Baris-baris perintah dalam Menu() dijalankan
      Semua perintah System.out.println(...) di dalam Menu() dieksekusi satu per satu.
      Setiap baris menu dicetak ke layar.
   6. Daftar menu tampil di layar
      Output dari fungsi Menu() muncul di konsol sesuai urutan perintah.
   7. Fungsi Menu() selesai
      Setelah semua perintah di dalam fungsi selesai, Java kembali ke tempat semula di dalam main().
   8. Eksekusi kembali ke main()
   Program melanjutkan baris berikutnya setelah pemanggilan Menu().
