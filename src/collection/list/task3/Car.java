package collection.list.task3;

import java.util.Objects;

public class Car {
    private String color;
    private String model;
    private String stateNumber;

    public Car(String color, String model, String stateNumber) {
        this.color = color;
        this.model = model;
        this.stateNumber = stateNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", stateNumber='" + stateNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) && Objects.equals(model, car.model) && Objects.equals(stateNumber, car.stateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, model, stateNumber);
    }
}
