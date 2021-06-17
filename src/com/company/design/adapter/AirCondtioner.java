package com.company.design.adapter;

public class AirCondtioner implements Electronic220V{
    @Override
    public void connect() {
        System.out.println("에어컨 220V on");
    }
}
