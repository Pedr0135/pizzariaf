package com.itb.inf2em.pizzariaf.controller;

import com.itb.inf2em.pizzariaf.model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/produto")
public class ProdutoController {

    // Idealmente isso deveria vir de um banco de dados ou service
    private final List<Produto> produtos = new ArrayList<>();

    @GetMapping
    public List<Produto> findAllP() {


            Produto p1 = new Produto();
            p1.setNome("Pizza de Calabresa");
            p1.setDescricao("Calabresa com muita cebola");
            produtos.add(p1);


        return produtos;
    }
}