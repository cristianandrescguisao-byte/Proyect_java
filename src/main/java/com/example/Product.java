package com.example;

public class Product {
    // Atributos privados (Punto 1)
    private String id;
    private String name;
    private double price;
    private int stock;

    // Constructor por defecto (Punto 2)
    public Product() {
        this.id = "null";
        this.name = "Unknown";
        this.price = 0.0;
        this.stock = 0;
    }

    // Constructor parametrizado (Punto 2)
    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Métodos Getter (Punto 3)
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    // Métodos Setter con validación opcional (Punto 4)
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    // Método toString (Punto 5) - Sin la etiqueta override
    public String toString() {
        return "Producto [ID: " + id + ", Nombre: " + name + ", Precio: " + price + ", Stock: " + stock + "]";
    }
}