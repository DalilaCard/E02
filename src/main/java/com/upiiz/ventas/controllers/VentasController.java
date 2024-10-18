package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/v1/ventas")

public class VentasController {

    // GET ver todas las ventas
    @GetMapping
    public String listarVentas() {
        return "Muestra todas las ventas con GET";
    }

    // GET con ID
    @GetMapping("/{id}")
    public String listarVenta(@PathVariable int id) {
        return "Muestra una venta por ID con GET: ";
    }

    // POST - AGREGAR
    @PostMapping
    public String agregarVenta(@RequestBody String venta) {
        return "Agregar venta por POST: " + venta;
    }

    // PUT - EDITAR
    @PutMapping("/{id}")
    public String editarVenta(@PathVariable int id, @RequestBody String venta) {
        return "Edita una venta con ID por PUT: " + venta + " con ID: " + id;
    }

    // DELETE - ELIMINAR
    @DeleteMapping("/{id}")
    public String eliminarVenta(@PathVariable int id) {
        return "Eliminar una venta por DELETE: " + id;
    }
}