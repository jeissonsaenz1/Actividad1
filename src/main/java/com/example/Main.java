package com.example;

public class Main {

    public static void main(String[] args) {

        // Crear el primer objeto
        Product producto1 = new Product();

        /*producto1.setId("CS272");
        producto1.setName("Buzo");
        producto1.setPrice(66600.0);
        producto1.setStock(10);*/

        // Modificar un atributo
        producto1.setPrice(2300.0);

        // Crear el segundo objeto
        Product producto2 = new Product();

        /*producto2.setId("D0091");
        producto2.setName("Licra");
        producto2.setPrice(60000.0);
        producto2.setStock(5);*/

        // Modificar un atributo
        producto2.setStock(30);

        // Imprimir usando los getters
        System.out.println("Producto 1:");
        System.out.println("ID: " + producto1.getId());
        System.out.println("Nombre: " + producto1.getName());
        System.out.println("Precio: " + producto1.getPrice());
        System.out.println("Stock: " + producto1.getStock());

        System.out.println();

        System.out.println("Producto 2:");
        System.out.println("ID: " + producto2.getId());
        System.out.println("Nombre: " + producto2.getName());
        System.out.println("Precio: " + producto2.getPrice());
        System.out.println("Stock: " + producto2.getStock());

        System.out.println();

    }
}