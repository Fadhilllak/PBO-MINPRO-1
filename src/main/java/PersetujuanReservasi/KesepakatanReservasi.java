package PersetujuanReservasi;

import java.util.Scanner;

public class KesepakatanReservasi {
    public String kodePersetujuan;
    public String namaPelanggan;
    public boolean disetujui;

    // Constructor
    public KesepakatanReservasi(String kodePersetujuan, String namaPelanggan, boolean disetujui) {
        this.kodePersetujuan = kodePersetujuan;
        this.namaPelanggan = namaPelanggan;
        this.disetujui = disetujui;
    }

    // Getter
    public String getKodePersetujuan() {
        return kodePersetujuan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public boolean isDisetujui() {
        return disetujui;
    }

    @Override
    public String toString() {
        return "Persetujuan{" +
                "Kode Persetujuan='" + kodePersetujuan + '\'' +
                ", Nama Pelanggan='" + namaPelanggan + '\'' +
                ", Disetujui=" + disetujui +
                '}';
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan Kode Persetujuan: ");
        String kodePersetujuan = scanner.nextLine();

        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Apakah reservasi disetujui? (iya/tidak): ");
        boolean disetujui = scanner.nextBoolean();

        // Membuat objek KesepakatanReservasi dengan input pengguna
        KesepakatanReservasi kesepakatan = new KesepakatanReservasi(kodePersetujuan, namaPelanggan, disetujui);

        // Menampilkan hasil dari kesepakatan
        System.out.println("\nData Kesepakatan Reservasi:");
        System.out.println(kesepakatan);
    }
}
