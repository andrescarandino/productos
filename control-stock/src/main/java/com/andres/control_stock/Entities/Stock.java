package com.andres.control_stock.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "stocks")
@Getter @Setter
@RequiredArgsConstructor

public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Lote;
    private LocalDate vencimiento;
    private Double cantidad;
    private String presentacion;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;
}
