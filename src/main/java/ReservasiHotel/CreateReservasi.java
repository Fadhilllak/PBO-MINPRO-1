package ReservasiHotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateReservasi {
    public String namaPengunjung;
    public String alamat;
    public String noTelp;

    // Constructor
    public CreateReservasi(String namaPengunjung, String alamat, String noTelp) {
        this.namaPengunjung = namaPengunjung;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    // Getter methods
    public String getNamaPengunjung() {
        return namaPengunjung;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    // Method untuk meminta input dari pengguna
    public static CreateReservasi inputReservasi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Pengunjung: ");
        String namaPengunjung = scanner.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();
        System.out.print("Masukkan No. Telepon: ");
        String noTelp = scanner.nextLine();
        return new CreateReservasi(namaPengunjung, alamat, noTelp);
    }

    // Method untuk menyimpan daftar reservasi
    public static List<CreateReservasi> daftarReservasi = new ArrayList<>();
    
    // Method untuk menambah reservasi ke daftar
    public static void tambahReservasi(CreateReservasi reservasi) {
        daftarReservasi.add(reservasi);
    }
}

