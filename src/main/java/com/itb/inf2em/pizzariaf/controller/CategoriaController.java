package com.itb.inf2em.pizzariaf.controller;

import com.itb.inf2em.pizzariaf.model.entity.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaController {

    // Idealmente isso deveria vir de um banco de dados ou service
    private final List<Categoria> categoria = new ArrayList<>();

    @GetMapping
    public List<Categoria> findAllCategoria() {


        Categoria p1 = new Categoria();
        p1.setNome("Tipos de sabores");
        p1.setDescricao("Escolha aqui um sabor de pizza salgada ou doce.");
        categoria.add(p1);


        return categoria;
    }
}