package com.example.demo.controller;

import com.example.demo.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produto")

// Classe vai responder pelos requisitos/mensagem
public class ExemploController {
    List<Produto> produtos = new ArrayList<Produto>();

    //verbo get
    @GetMapping
    public List<Produto> consulta(){
        return produtos;
    }

    @GetMapping("/{id}")
    public Produto consultaPersonalizada(@PathVariable int id){
        for (Produto produto : produtos) {
            if (produto.getId() == id){
                return produto;
            }
        }
        // não encontrou
        return null;
    }

    //verbo post
    @PostMapping
    public Produto insere(@RequestBody Produto produto){
        produtos.add(produto);
        return produto;
    }

    // VERBO DELETE
    @DeleteMapping("/{id}")
    public boolean remover (@PathVariable int id){
        for (Produto produto : produtos) {
            if (produto.getId() == id){
                return produtos.remove(produto);
            }
        }
        // não encontrou
        return false;
    }
}
