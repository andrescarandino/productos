package com.andres.control_stock.Controllers;

import com.andres.control_stock.Dtos.ProductoDto;
import com.andres.control_stock.Entities.Producto;
import com.andres.control_stock.Service.ProductoService;
import com.andres.control_stock.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @PostMapping("/guardar")
    public ResponseEntity<ProductoDto> guardar(@RequestBody Producto producto){
        return ResponseEntity.status(HttpStatus.CREATED).body(productoService.guardar(producto));
    }

    @GetMapping
    public  ResponseEntity<List<ProductoDto>> listar(){
        return ResponseEntity.status(HttpStatus.OK).body(productoService.listar());
    }
}
