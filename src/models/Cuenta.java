package models;

import java.util.UUID;

public class Cuenta {
    private String id;
    private String name;
    private double balance;


    public Cuenta(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public Cuenta name (String name){
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public Cuenta balance(double balance){
        this.balance = balance;
        return this;
    }

    public double balance(){
        return balance;
    }

    public double credito(double deposito){
        this.balance = this.balance+deposito;
        return this.balance;
    }

    public double debito(double sustraccion){
        if(this.balance > sustraccion){
            this.balance = this.balance-sustraccion;
        } else {
            System.out.println("ERROR: Fondos insuficientes");
        }

        return this.balance;
    }

    public void imprimir(){
        System.out.println("ID..........:"+id);
        System.out.println("NAME........:"+name);
        System.out.println("BALANCE.....:"+balance);
    }





}
