package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductosController {

    //GET
    @GetMapping
    public String listaProductos() {
        return "Muestra todos los productos con GET";
    }

    //GET con ID
    @GetMapping("/{id}")
    public String listaProducto(@PathVariable int id) {
        return "Muestra un producto por ID con GET";
    }

    //POST
    @PostMapping
    public String agregarProducto(@RequestBody String producto){
        return "Agregar producto por POST" + producto;
    }

    //PUT
    @PutMapping("/{id}")
    public String editarProducto(@PathVariable int id, @RequestBody String producto){
        return "Editar producto por POST" + producto + "con Id" + id;
    }

    //DELETE
    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable int id){
        return "Eliminar producto por DELETE" + id;
    }
}
