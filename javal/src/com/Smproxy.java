package com;
public class Smproxy implements ServiceIml{
    private final ServiceIml serviceIml;
    public Smproxy(ServiceIml serviceIml) {
        this.serviceIml=serviceIml;
    }
    @Override
    public void send(String meeage) {
        System.out.println("Before");
        serviceIml.send(meeage);
        System.out.println("Afrer");
        
    }
}
