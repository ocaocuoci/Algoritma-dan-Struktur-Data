import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {

       
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");

        Collections.sort(daftarSiswa);
        System.out.println(daftarSiswa); 

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Zaskia"));
        customers.add(new Customer(2, "Budi"));
        customers.add(new Customer(3, "Citra"));

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println(customers);
    }
}