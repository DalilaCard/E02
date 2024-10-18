package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categorias")
public class CategoriasController {

    //GET ver todas
    @GetMapping
    public String listarCategorias() {
        return "Listado de Categorias con el metodo GET";
    }

    //GET con ID- ver con ID
    @GetMapping("/{id}")
    public String listarCategoria(@PathVariable int id) {
        return "Obtener una categoria por id con GET";
    }

    //POST - AGREGAR
    @PostMapping
    public String agregarCategoria(@RequestBody String categoria) {
        return "Agregar una categoria por POST" + categoria;
    }

    //PUT EDITAR
    @PutMapping("/{id}")
    public String editarCategoria(@PathVariable int id, @RequestBody String categoria) {
        return "Editar una categoria por id con PUT" + categoria + "con id" + id;
    }

    //DELETE - ELIMINAR
    @DeleteMapping("/{id}")
    public String eliminarCategoria(@PathVariable int id) {
        return "Eliminar una categoria por DELETE" + id;
    }
}
