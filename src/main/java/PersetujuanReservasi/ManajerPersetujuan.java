package PersetujuanReservasi;

import java.util.ArrayList;
import java.util.Scanner;

public class ManajerPersetujuan {
    public static ArrayList<KesepakatanReservasi> daftarPersetujuan = new ArrayList<>();

    // Method untuk menambah persetujuan
    public static void tambahPersetujuan(KesepakatanReservasi persetujuan) {
        daftarPersetujuan.add(persetujuan);
    }

    // Method untuk menampilkan semua persetujuan
    public static void tampilkanSemuaPersetujuan() {
        for (KesepakatanReservasi persetujuan : daftarPersetujuan) {
            System.out.println(persetujuan);
        }
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk menambah beberapa kesepakatan
        for (int i = 0; i < 2; i++) {  // Misalkan kita akan menambah 2 kesepakatan
            System.out.print("Masukkan Kode Persetujuan: ");
            String kodePersetujuan = scanner.nextLine();

            System.out.print("Masukkan Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();

            System.out.print("Apakah reservasi disetujui? (iya/tidak): ");
            String persetujuanInput = scanner.nextLine();
            boolean disetujui = persetujuanInput.equalsIgnoreCase("iya");

            // Membuat objek KesepakatanReservasi baru
            KesepakatanReservasi persetujuan = new KesepakatanReservasi(kodePersetujuan, namaPelanggan, disetujui);

            // Menambah persetujuan ke daftar
            tambahPersetujuan(persetujuan);
        }

        // Menampilkan semua persetujuan
        System.out.println("\nDaftar Semua Persetujuan:");
        tampilkanSemuaPersetujuan();
    }
}
