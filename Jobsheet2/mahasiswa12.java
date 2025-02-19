import java.util.Scanner;
public class mahasiswa12{
    static String nim, nama, kelas;
    static double ipk;
    static Scanner sc =new Scanner(System.in);

    public static void main(String[] args){

        tampilkanInformasi();
        
    }
    public static void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);

        System.out.print("input ipk anda: ");
        double inputIPK = sc.nextDouble();
        updateIPK(inputIPK);
    }
    public static void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }
    public static void updateIPK(double ipkBaru){
        if(ipkBaru >= 0.0 && ipkBaru <= 4.0){
            ipk = ipkBaru;
            System.out.println("IPK berhasil diperbarui");
        } else{
            System.out.println("IPK tidak valid. Harus antara 0.0 sampai 4.0");
        }
        
    } 
    public static String nilaiKinerja(){   
    
        if (ipk >= 3.5){
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0){
            return "Kinerja Baik";
        } else if(ipk >= 2.0){
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }
}