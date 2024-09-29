package ReservasiHotel;

import PersetujuanReservasi.KesepakatanReservasi;
import PersetujuanReservasi.ManajerPersetujuan;
import java.util.Scanner;

public class Reservasi {
    public String kodeReservasi;
    public String namaPelanggan;
    public Hotel hotel;

    // Constructor
    public Reservasi(String kodeReservasi, String namaPelanggan, Hotel hotel) {
        this.kodeReservasi = kodeReservasi;
        this.namaPelanggan = namaPelanggan;
        this.hotel = hotel;
    }

    // Method untuk membuat reservasi dan menambah persetujuan
    public void buatReservasi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Apakah Anda ingin menyetujui reservasi ini? (y/n)");
        String input = scanner.nextLine();
        boolean disetujui = input.equalsIgnoreCase("y");

        // Buat objek KesepakatanReservasi dengan nama yang berbeda
        KesepakatanReservasi kesepakatan = new KesepakatanReservasi(kodeReservasi, namaPelanggan, disetujui);
        ManajerPersetujuan.tambahPersetujuan(kesepakatan);

        if (disetujui) {
            System.out.println("Reservasi disetujui untuk " + namaPelanggan + " di " + hotel.getNamaHotel());
        } else {
            System.out.println("Reservasi ditolak.");
        }

        scanner.close();  // Penting untuk menutup scanner
    }

    @Override
    public String toString() {
        return "Reservasi{" +
                "Kode Reservasi='" + kodeReservasi + '\'' +
                ", Nama Pelanggan='" + namaPelanggan + '\'' +
                ", Hotel=" + hotel +
                '}';
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek hotel
        Hotel hotel = new Hotel("Grand Indonesia", "Jakarta", 200);

        // Membuat objek reservasi
        Reservasi reservasi = new Reservasi("RES123", "Budi", hotel);

        // Memproses reservasi
        reservasi.buatReservasi();
    }
}
