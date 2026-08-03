package com.example;

public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;

    //Metodos getter
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
    }

    // Métodos Setter
    public void setId(String newId) {
        this.id = newId;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPrice(double newPrice) {
        if (newPrice >= 0) {
            this.price = newPrice;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    public void setStock(int newStock) {
        if (newStock >= 0) {
            this.stock = newStock;
        } else {
            System.out.println("El stock no puede ser negativo.");
        }
    }
    
    // Método toString()
    @Override
    public String toString() {
        return "Producto [ID: " + id +
               ", Nombre: " + name +
               ", Precio: " + price +
               ", Stock: " + stock + "]";
    }
}



