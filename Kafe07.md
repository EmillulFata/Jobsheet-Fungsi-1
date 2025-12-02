1. Apakah kegunaan parameter di dalam fungsi?  
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter 
   namaPelanggan dan isMember? 
3. Apakah parameter sama dengan variabel?
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa
   perbedaan output ketika isMember bernilai true dan ketika false? 
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan
   parameter namaPelanggan dan isMember? 
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo
   (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid. 
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi"
   pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar. 
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember
   pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan 
   dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.

Jawab : 
1. Parameter digunakan untuk mengirim data dari luar fungsi ke dalam fungsi.
Dengan parameter, sebuah fungsi dapat menerima nilai yang berbeda-beda setiap kali dipanggil, sehingga tidak perlu menulis ulang kode yang sama.
2. Karena: "namaPelanggan" digunakan agar fungsi dapat menampilkan sapaan
sesuai nama orang yang berbeda-beda. sedangkan "isMember" digunakan untuk menentukan apakah pelanggan adalah member sehingga berhak mendapat diskon.
Dengan begitu, fungsi menjadi lebih fleksibel, bisa digunakan untuk pelanggan mana pun dan status apa pun.
3. Mirip, tetapi tidak sama.
Parameter adalah variabel khusus yang hanya ada di dalam definisi fungsi dan berfungsi menerima data dari luar.
4. Cara kerjanya adalah Jika "isMember" bernilai true, maka pesan diskon akan ditampilkan. Jika "isMember" bernilai false, bagian dalam if tidak dieksekusi, sehingga tidak ada pesan diskon.
5. akan error saat meng-compile karena fungsi menu () wajib menerima 2
parameter Jika tidak diberi nilai, Java tidak tahu apa yang harus dimasukkan ke variabel namaPelanggan dan isMember.
6. 