package com.example;

public class Main {
    public static void main(String[] args) {
   
        Product comida1 = new Product("001", "Hamburguesa", 15000.0, 10);

        Product comida2 = new Product();


        comida2.setId("002");
        comida2.setName("Pizza");
        comida2.setPrice(18000.0);
        comida2.setStock(15);

        System.out.println("--- verificacion de atributs ---");
        System.out.println("Producto 1 - Nombre: " + comida1.getName());
        System.out.println("Producto 1 - Stock: " + comida1.getStock());
        
        System.out.println("Producto 2 - ID: " + comida2.getId());
        System.out.println("Producto 2 - Precio: " + comida2.getPrice());

        System.out.println("--------------------------------");

   
        System.out.println("vista completa");
        System.out.println(comida1.toString());
        System.out.println(comida2.toString());
    }
}