import java.util.Scanner;

public class MainFaktorial12{
    public static void main(String[] args){

        Scanner input12 = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input12.nextInt();

        Faktorial12 fk = new Faktorial12();
        System.out.println("Nilai faktorial " + nilai + " menggunakan Brute Force: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan Devide conquer: " + fk.faktorialDC(nilai));
    }
}