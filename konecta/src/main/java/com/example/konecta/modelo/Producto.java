package com.example.konecta.modelo;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "producto")
public class Producto {
    @Id
    private int id;
    @Column
    private String nombreProducto;
    @Column
    private String referencia;
    @Column
    private int precio;
    @Column
    private int peso;
    @Column
    private String categoria;
    @Column
    private int stock;
    @Column
    private LocalDate date;


    public Producto( int id , String nombreProducto, String referencia, int precio, int peso, String categoria, int stock, LocalDate date) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.referencia = referencia;
        this.precio = precio;
        this.peso = peso;
        this.categoria = categoria;
        this.stock = stock;
        this.date = date;
    }

    public Producto(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", referencia='" + referencia + '\'' +
                ", precio=" + precio +
                ", peso=" + peso +
                ", categoria='" + categoria + '\'' +
                ", stock=" + stock +
                ", date=" + date +
                '}';
    }
}
