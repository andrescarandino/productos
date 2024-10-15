package com.andres.control_stock.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "productos")
@Getter @Setter
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    @OneToMany (mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Stock> stocks;

    public Producto() {
        this.stocks = new HashSet<>();
    }
}
