package uaslp.objetos.parcial1.examen.pos;

public class CartItem {
    private int quantity;
    private Product product;
    private float amount;
    private String name;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float getAmount(){
        amount = product.getAmount();

        return amount;
    }

    public String getProductName(){
        name = product.getName();

        return name;
    }
}
