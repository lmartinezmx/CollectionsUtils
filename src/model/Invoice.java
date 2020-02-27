package model;

public class Invoice {

    private String id;
    private double amount;
    private Month month;

    public Invoice(String id, double amount, Month month) {
        this.id = id;
        this.amount = amount;
        this.month = month;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }
}
