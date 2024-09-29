package ReservasiHotel;

class Hotel {
    public String namaHotel;
    public String lokasi;
    public int jumlahKamar;  // Pastikan ini public jika ingin mengakses di luar

    // Constructor
    public Hotel(String namaHotel, String lokasi, int jumlahKamar) {
        this.namaHotel = namaHotel;
        this.lokasi = lokasi;
        this.jumlahKamar = jumlahKamar;
    }

    // Getter
    public String getNamaHotel() {
        return namaHotel;
    }

    public String getLokasi() {
        return lokasi;
    }

    public int getJumlahKamar() {
        return jumlahKamar;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "Nama Hotel='" + namaHotel + '\'' +
                ", Lokasi='" + lokasi + '\'' +
                ", Jumlah Kamar=" + jumlahKamar +
                '}';
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Hotel
        Hotel hotel1 = new Hotel("Grand Indonesia", "Jakarta", 200);
        Hotel hotel2 = new Hotel("Bali Paradise", "Bali", 150);

        // Menampilkan informasi hotel
        System.out.println(hotel1);
        System.out.println(hotel2);

        // Menggunakan getter
        System.out.println("\nInformasi Hotel 1:");
        System.out.println("Nama Hotel: " + hotel1.getNamaHotel());
        System.out.println("Lokasi: " + hotel1.getLokasi());
        System.out.println("Jumlah Kamar: " + hotel1.getJumlahKamar());
    }
}
