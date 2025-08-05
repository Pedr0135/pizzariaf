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
    public List<Produto> findAllProdutos() {


            Produto p1 = new Produto();
            p1.setNome("Pizza de Calabresa");
            p1.setDescricao("Calabresa com muita cebola");
            produtos.add(p1);

            Produto p2 = new Produto();
            p2.setNome("Pizza de Chees");
            p2.setDescricao("Cheeses com muita cebola");
            p2.setPreco(59.99);
            produtos.add(p2);

            Produto p3 = new Produto();
            p3.setNome("Pizza de Fries");
            p3.setDescricao("Fries");
            p3.setPreco(59.99);
            produtos.add(p3);

            Produto p4 = new Produto();
            p4.setNome("Pizza de Juice");
            p4.setDescricao("Juices");
            p4.setPreco(59.99);
            produtos.add(p4);

            Produto p5 = new Produto();
            p5.setNome("Pizza de Milk");
            p5.setDescricao("Milk");
            p5.setPreco(59.99);
            produtos.add(p5);


        return produtos;
    }
}