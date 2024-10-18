package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClientesController {

    //GET VER TODAS
    @GetMapping
    public String listarClientes() {
        return "Muestra todos los clientes con GET";
    }

    //GET con ID
    @GetMapping("/{id}")
    public String listarCliente(@PathVariable int id) {
        return "Muestra un cliente por ID con GET";
    }

    //POST - AGREGAR
    @PostMapping
    public String agregarCliente(@RequestBody String cliente){
        return "Agrega un cliente con POST" + cliente;
    }

    //PUT- EDITAR
    @PutMapping("/{id}")
    public String editarCliente(@PathVariable int id, @RequestBody String cliente){
        return "Edita un cliente por ID con PUT" + cliente + "con id" + id;
    }

    //DELETE
    @DeleteMapping("/{id}")
    public String eliminarCliente(@PathVariable int id){
        return "Elimina un cliente  con DELETE" +id;
    }
}
