package com.company;

public class HomePhone extends Phone{


    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public String getBrande() {
        return super.getBrande();
    }

    @Override
    public void setBrande(String brande) {
        super.setBrande(brande);
    }

    @Override
    public long getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void getType() {

        System.out.println("Тип Связи удаленный");
    }

    @Override
    public String call() {

        return  ("Звоним");

    }


}
