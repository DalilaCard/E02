package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/clientes/{clienteId}/facturas")
public class FacturaClienteController {

    //Get- obtener todas la facturas de un cliente
    @GetMapping
    public String listarFacturasDeCliente(@PathVariable int clienteId) {
        return  "Muestra todas las facturas del cliente con ID:  " + clienteId;
    }

    //GET - Obtener una factura especifica de un cliente
    @GetMapping("/{facturaId}")
    public String listarFacturasDeCliente(@PathVariable int clienteId, @PathVariable int facturaId) {
        return "Muestra la factura con ID: " + facturaId + " del cliente con ID: " + clienteId;
    }
}
