package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/facturas")
public class FacturasController {

    //GET- VER TODAS
    @GetMapping
    public String listarFacturas() {
        return "Muestra todas las facturas con GET";
    }

    //GET con ID - ver con ID
    @GetMapping("/{id}")
    public String listarFactura(@PathVariable int id) {
        return "Muestra una factura por id con GET: ";
    }

    //POST - AGREGAR
    @PostMapping
    public String agregarFactura(@RequestBody String factura){
        return "Agregar factura por POST" + factura;
    }

    //PUT - AGREGAR
    @PutMapping("/{id}")
    public String editarFactura(@PathVariable int id, @RequestBody String factura){
        return "Edita una factura con id con PUT" + factura + "con Id" + id;
    }

    //DELETE
    @DeleteMapping("/{id}")
    public String eliminarFactura(@PathVariable int id){
        return "Eliminar una factura por DELETE" + id;
    }
}
