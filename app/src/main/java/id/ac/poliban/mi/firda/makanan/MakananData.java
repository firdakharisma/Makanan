package id.ac.poliban.mi.firda.makanan;

import java.util.ArrayList;
import java.util.List;

public class MakananData {
    static List<Makanan> getAllMakanan(){
        List<Makanan> data = new ArrayList<>();
        {
            data.add(new Makanan("https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Nasi_Rawon_A.JPG/220px-Nasi_Rawon_A.JPG", "Rawon", "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam sebagai campuran bumbu khas yang menggunakan kluwek. Rawon, meskipun dikenal sebagai masakan khas Jawa Timur, dikenal pula oleh masyarakat Jawa Tengah sebelah timur (daerah Surakarta)."));
            data.add(new Makanan("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Soto_Banjar_ketupat.jpg/240px-Soto_Banjar_ketupat.jpg", "Soto Banjar", "Soto Banjar adalah soto khas suku Banjar, Kalimantan Selatan dengan bahan utama ayam serta memiliki aroma harum rempah-rempah seperti kayu manis, biji pala, dan cengkih. Ada kalanya pembuatan kuah soto banjar dapat dicampurkan dengan sedikit susu yang membuat warna kuahnya mejadi tidak bening, tetapi sedikit keruh. Soto ini berisi daging ayam yang sudah disuwir-suwir, dengan tambahan perkedel, kentang rebus, rebusan telur, potongan wortel dan ketupat.[1]"));
            data.add(new Makanan("https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/Pempekraden_kapal_selam_dan_kulit_ikan.jpg/250px-Pempekraden_kapal_selam_dan_kulit_ikan.jpg", "Pempek", "Pempek atau empek-empek adalah makanan khas Palembang yang terbuat dari daging ikan yang digiling lembut dan tepung kanji (secara salah kaprah sering disebut sebagai \"tepung sagu\"), serta beberapa komposisi lain seperti telur, bawang putih yang dihaluskan, penyedap rasa dan garam. Sebenarnya sulit untuk mengatakan bahwa penganan pempek pusatnya adalah di Palembang karena hampir semua daerah di Sumatera Selatan memproduksinya."));
            data.add(new Makanan("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Pecel_Hariadhi.JPG/220px-Pecel_Hariadhi.JPG", "Pecel", "Pecel atau pecal (Hanacaraka: ꦥꦼꦕꦼꦭ꧀) merupakan makanan yang dikombinasikan dengan bumbu sambal kacang sebagai bahan utamanya dan dicampur dengan aneka jenis sayuran. Makanan ini populer terutama di wilayah DI Yogyakarta, Jawa Tengah, dan Jawa Timur."));
            data.add(new Makanan("https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/Rendang_daging_sapi_asli_Padang.JPG/250px-Rendang_daging_sapi_asli_Padang.JPG", "Rendang", "Rendang atau randang (Jawi: رندڠ) adalah masakan daging dengan bumbu rempah-rempah yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulang-ulang menggunakan santan sampai kuahnya kering sama sekali. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat. Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu. Rendang yang dimasak dalam waktu yang lebih singkat dan santannya belum mengering disebut kalio, berwarna cokelat terang keemasan."));

        }

        return data;
    }
}
