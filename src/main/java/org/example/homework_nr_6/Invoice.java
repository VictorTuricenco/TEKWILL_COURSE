package org.example.homework_nr_6;

public class Invoice {

    private String model;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String model, String description, int quantity, double price) {
        this.model = model;
        this.description = description;
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0;
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return getQuantity() * getPrice();
    }
}
