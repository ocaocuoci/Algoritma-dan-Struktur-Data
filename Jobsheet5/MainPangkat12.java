import java.util.Scanner;
public class MainPangkat12{
    public static void main(String [] args){
    Scanner input12 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input12.nextInt();

        Pangkat12[] png =new Pangkat12[elemen];
        for(int i=0; i < elemen; i++){
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1)+ ": ");
            int basis = input12.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1)+ ": ");
            int pangkat = input12.nextInt();
            png[i] = new Pangkat12(basis, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTE FORCE:");
        for(Pangkat12 p : png) {
            System.out.println(p.n + "^" + p.p + ": " + p.pangkatBF()); // ✅ Tanpa parameter
        }
        System.out.println("HASIL PANGKAT DIVIDE & CONQUER:");
        for(Pangkat12 p : png) {
            System.out.println(p.n + "^" + p.p + ": " + p.pangkatDC(p.n, p.p));
        }  

        Pangkat12 p1 = new Pangkat12(2, 5);
        System.out.println("Hasil pangkat BF: " + p1.pangkatBF()); 

    }
}