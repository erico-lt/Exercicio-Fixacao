import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private List <OrderItem> item = new ArrayList<>();
    private Cliente cliente;

    public Order(){        
    }

    public Order(String orderStatus, Cliente cliente){
        this.setMoment(new Date());
        this.setStatus(OrderStatus.valueOf(orderStatus));
        this.setCliente(cliente);
    }

    public void addItem(OrderItem newItem){
        this.item.add(newItem);
    }

    public void removeItem(OrderItem itemRemo){
        this.item.remove(itemRemo);
    }

    public double total(){
        double total = 0;
       for(OrderItem c: item){
            total += c.subTotal();
       }     
        return total;
    }
    
    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus orderStatus) {
        this.status = orderStatus;
    }

    public List <OrderItem> getItem() {
        return item;
    }      

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString(){
        StringBuilder toStrin = new StringBuilder();
        toStrin.append("\n\nORDER SUMMARY:");
        toStrin.append("\nOrder moment: " + sdf.format(this.getMoment()));
        toStrin.append("\nOrder status: " + this.getStatus());
        toStrin.append(cliente.toString());

        toStrin.append("\n\nOrder items: \n");
        for(OrderItem c: item){
            toStrin.append(c.toString());
        }
        toStrin.append("\nTotal price Order: " + this.total());
        
        return toStrin.toString();
    }

}
