import java.util.ArrayList;
public class DemoArrayList{
    public static void main(String[] args){

        ArrayList<Customer> customers = new ArrayList<>(2);
        Customer customer1 = new Customer(1, "Zaskia");
        Customer customer2 = new Customer(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer(4, "Cica"));

        customers.add(new Customer(100, "Rossa"));

        System.out.println(customers.indexOf(customer2));

        Customer customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        for(Customer cust : customers){
            System.out.println(cust.toString());
        }
    }
}