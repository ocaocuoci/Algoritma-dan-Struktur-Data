public class DosenMain12{

    public static void main(String[] args){

        Dosen12 dsn1 = new Dosen12();
        dsn1.idDosen = "STE 1K";
        dsn1.nama = "Rokhimatul Wakhidah";
        dsn1.bidangKeahlian = "Algoritma dan Struktur Data";
        dsn1.statusAktif = (true);
        dsn1.tahunBergabung = 2015;

        dsn1.tampilkanInformasi();
        System.out.println();

        System.out.println("\nMengubah status dosen...");
        dsn1.setStatusAktif(false);
        int masaKerja = dsn1.hitungMasaKerja(2025);
        dsn1.tampilkanInformasi();

        System.out.println();


        Dosen12 dsn2 = new Dosen12("FTMD3", "Budi Harijanto", "Teknik Mesin dan Manufaktur", (false), 2012);
        dsn2.tampilkanInformasi();
        System.out.println();

        masaKerja = dsn2.hitungMasaKerja(2024);
        dsn2.ubahKeahlian("Manajemen Sumber Daya Manusia");
        dsn2.tampilkanInformasi();
    }
}