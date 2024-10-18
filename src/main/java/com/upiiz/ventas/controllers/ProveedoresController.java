package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/proveedores")

public class ProveedoresController {

    //GET ver todas
    @GetMapping
    public String listarProveedores() {
        return "Muestra todos los proveedores con GET";
    }

    //GET con ID
    @GetMapping("/{id}")
    public String listarProveedor(@PathVariable int id) {
        return "Muestra un proveedor por ID con GET";
    }

    //POST - AGREGAR
    @PostMapping
    public String agregarProveedor(@RequestBody String proveedor){
        return "Agregar proveedor por POST" + proveedor;
    }

    //PUT
    @PutMapping("/{id}")
    public String editarProveedor(@PathVariable int id, @RequestBody String proveedor){
        return "Edita un proveedor con Id por PUT" + proveedor + "con Id" + id;
    }

    @DeleteMapping("/{id}")
    public String eliminarProveedor(@PathVariable int id){
        return "Eliminar un proveedor por DELETE" + id;
    }
}
