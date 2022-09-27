public class Product{
    private String name;
    private double price;

    public Product(){
    }

    public Product(String name, double price){
        this.setName(name);
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        StringBuilder toStrin = new StringBuilder();
        toStrin.append("Name: " + this.getName());
        toStrin.append("\nPrice: " + this.getPrice());
        return toStrin.toString();                
    }

}