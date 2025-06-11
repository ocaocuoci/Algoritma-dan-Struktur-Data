import java.util.ArrayList;
public class DemoArrayList{
    public static void main(String[] args){

        ArrayList<Customer> customer = new ArrayList<>(2);
        Customer customer1 = new Customer(1, "Zaskia");
        Customer customer2 = new Customer(5, "Budi");

        customer.add(customer1);
        customer.add(customer2);

        customer.add(new Customer(4, "Cica"));

        customer.add(2, new Customer(100, "Rossa"));

        for(Customer cust : customer){
            System.out.println(cust.toString());
        }
    }
}