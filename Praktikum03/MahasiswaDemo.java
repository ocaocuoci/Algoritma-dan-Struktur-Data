import java.util.Scanner;
public class MahasiswaDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];

        String dummy;

        for(int i = 0; i < 3; i++){
            arrayOfMahasiswa[i] = new Mahasiswa();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM       : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama      : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas     : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK       : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------");
        }

        for(int i=0; i<3; i++){
            System.out.println("Data Mahasiswa Ke-" + (i+1));
            System.out.println("NIM     :" + arrayOfMahasiswa[i].nim);
            System.out.println("Nama    :" + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas   :" + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK     :" + arrayOfMahasiswa[i].ipk);
        }
        System.out.println();
        System.out.println("----------------------------");

        arrayOfMahasiswa[0] = new Mahasiswa();
        arrayOfMahasiswa[0].nim = "244107060075";
        arrayOfMahasiswa[0].nama = "HERNANDA RIZKA UTAMI";
        arrayOfMahasiswa[0].kelas = "SIB-1B";
        arrayOfMahasiswa[0].ipk = (float) 3.58;

        arrayOfMahasiswa[1] = new Mahasiswa();
        arrayOfMahasiswa[1].nim = "244107060125";
        arrayOfMahasiswa[1].nama = "AZRIEL RIZKY NADAR";
        arrayOfMahasiswa[1].kelas = "TI-1F";
        arrayOfMahasiswa[1].ipk = (float) 3.55;

        arrayOfMahasiswa[2] = new Mahasiswa();
        arrayOfMahasiswa[2].nim = "244107060065";
        arrayOfMahasiswa[2].nama = "AMALIA PUTERI TANJUNG";
        arrayOfMahasiswa[2].kelas = "SIB-1C";
        arrayOfMahasiswa[2].ipk = (float) 3.70;    

        System.out.println("NIM     : " + arrayOfMahasiswa[0].nim);    
        System.out.println("Nama    : " + arrayOfMahasiswa[0].nama);    
        System.out.println("Kelas   : " + arrayOfMahasiswa[0].kelas);    
        System.out.println("IPK     : " + arrayOfMahasiswa[0].ipk);    
        System.out.println("------------------------------------");    
        System.out.println("NIM     : " + arrayOfMahasiswa[1].nim);    
        System.out.println("Nama    : " + arrayOfMahasiswa[1].nama);    
        System.out.println("Kelas   : " + arrayOfMahasiswa[1].kelas);    
        System.out.println("IPK     : " + arrayOfMahasiswa[1].ipk);    
        System.out.println("------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa[2].nim);    
        System.out.println("Nama    : " + arrayOfMahasiswa[2].nama);    
        System.out.println("Kelas   : " + arrayOfMahasiswa[2].kelas);    
        System.out.println("IPK     : " + arrayOfMahasiswa[2].ipk);  
        System.out.println("------------------------------------");  
    }
}