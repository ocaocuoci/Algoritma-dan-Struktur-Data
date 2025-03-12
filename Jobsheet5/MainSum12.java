import java.util.Scanner;
public class MainSum12{
    public static void main(String[] args){

        Scanner input12 = new Scanner(System.in);
        System.out.print("masukkan jumlah elemen: ");
        int elemen = input12.nextInt();

        Sum12 sm = new Sum12(elemen);
        for(int i=0; i<elemen; i++){
            System.out.print("Masukkan keuntungan ke-" + (i+1) + ": ");
            sm.keuntungan[i] = input12.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Brute Force: "+ sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide Conquer: "+ sm.totalDC(sm.keuntungan, l;0, elemen-1));
    }
}