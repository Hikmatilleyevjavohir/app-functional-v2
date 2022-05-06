package extraTask.onlineMarket.model;

public class ShoppingCart {
    private Long id;
    private Product product;
    private Integer quatity;

    public ShoppingCart(Long id, Product product, Integer quatity) {
        this.id = id;
        this.product = product;
        this.quatity = quatity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuatity() {
        return quatity;
    }

    public void setQuatity(Integer quatity) {
        this.quatity = quatity;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", product=" + product +
                ", quatity=" + quatity +
                '}';
    }
}
