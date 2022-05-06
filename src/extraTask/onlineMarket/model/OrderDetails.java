package extraTask.onlineMarket.model;

public class OrderDetails {
    private Long id;
    private Order order;
    private Product product;
    private Integer productQuantity;
    private Double price;

    public OrderDetails(Long id, Order order, Product product, Integer productQuantity, Double price) {
        this.id = id;
        this.order = order;
        this.product = product;
        this.productQuantity = productQuantity;
        this.price = price;
    }

    public OrderDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
