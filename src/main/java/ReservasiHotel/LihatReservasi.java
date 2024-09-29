package ReservasiHotel;

public class LihatReservasi {

    // Method untuk menampilkan semua reservasi
    public static void tampilkanSemuaReservasi() {
        if (CreateReservasi.daftarReservasi.isEmpty()) {
            System.out.println("Tidak ada reservasi yang tersedia.");
            return;
        }
        
        System.out.println("===== Data Reservasi =====");
        for (CreateReservasi reservasi : CreateReservasi.daftarReservasi) {
            System.out.println("Nama Pengunjung: " + reservasi.getNamaPengunjung());
            System.out.println("Alamat: " + reservasi.getAlamat());
            System.out.println("No. Telepon: " + reservasi.getNoTelp());
            System.out.println("==========================");
        }
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Menambahkan beberapa reservasi
        CreateReservasi.tambahReservasi(CreateReservasi.inputReservasi());
        CreateReservasi.tambahReservasi(CreateReservasi.inputReservasi());

        // Menampilkan semua reservasi
        tampilkanSemuaReservasi();
    }
}
