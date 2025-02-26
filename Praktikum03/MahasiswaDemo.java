public class MahasiswaDemo{
    public static void main(String[] args){
        Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];

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