package com.company;

public  abstract class Phone {
    private String model;
    private  String brande;
    private long phoneNumber;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrande() {
        return brande;
    }

    public void setBrande(String brande) {
        this.brande = brande;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract void getType();

    public abstract String call();

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", brande='" + brande + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
