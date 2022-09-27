
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        System.out.println("Enter Cliente dice");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        Cliente cliente = new Cliente(name, email, birthDate);

        System.out.print("How many items to this order? ");
        int quantityItems = sc.nextInt();
        for(int cont = 0; cont < quantityItems; cont ++){
            System.out.println("Enter #" + (cont + 1) + " item dice");
            sc.nextLine();
            
            System.out.print("Product name: ");
            String nameProduct = sc.nextLine();

            System.out.print("Product price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity items " + nameProduct + ": ");
            int quantityProducts = sc.nextInt();

            Product product = new Product(nameProduct, price);
            OrderItem item = new OrderItem(product, quantityProducts, price);

            order = new Order("PROCESSING", cliente);
            order.addItem(item);
        }

        System.out.println(order.toString());
        sc.close();

    }
}
