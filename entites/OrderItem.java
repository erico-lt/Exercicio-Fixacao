public class OrderItem {
    private Integer quantity;
    private double price;
    private Product product;

    public OrderItem(){        
    }

    public OrderItem(Product product, Integer quantity, double price){
        this.setProduct(product);
        this.setQuantity(quantity); 
        this.setPrice(price);             
    }

    public double subTotal(){
        double total = 0.0;
        total = this.getQuantity() * this.getPrice(); 
        return total;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    @Override
    public String toString(){
        StringBuilder toStrin = new StringBuilder();
        toStrin.append(product.toString());
        toStrin.append("\nQauntity: " + this.getQuantity());
        toStrin.append("\nSubTotal: " + this.subTotal());
        return toStrin.toString();
    }

}
