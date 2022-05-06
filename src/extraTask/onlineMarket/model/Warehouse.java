package extraTask.onlineMarket.model;

import java.util.Map;

public class Warehouse {
    private Long id;
    private String name;
    private Integer number;
    private Map<Product, Integer> products;
}
