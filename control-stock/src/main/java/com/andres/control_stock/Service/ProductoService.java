package com.andres.control_stock.Service;

import com.andres.control_stock.Dtos.ProductoDto;
import com.andres.control_stock.Entities.Producto;
import com.andres.control_stock.repositories.ProductoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;
    @Autowired
    ObjectMapper mapper;


    public ProductoDto guardar(Producto producto) {
        productoRepository.save(producto);
        return mapper.convertValue(producto, ProductoDto.class);
    }

    public List<ProductoDto> listar() {
        return productoRepository.findAll().stream()
                .map(producto -> mapper.convertValue(producto, ProductoDto.class))
                .toList();
    }
}
