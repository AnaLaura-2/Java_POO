package exe1;

public class CarItem {
    private float quantify;
    // associar com o product
    private Product product;

    public CarItem(){
    }

    public CarItem(float quantify, Product product) {
        this.quantify = quantify;
        this.product = product;
    }

    public float getQuantify() {
        return quantify;
    }

    public void setQuantify(float quantify) {
        this.quantify = quantify;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "\nCarItem{" +
                "quantify=" + quantify +
                ", product=" + product +
                '}';
    }
}