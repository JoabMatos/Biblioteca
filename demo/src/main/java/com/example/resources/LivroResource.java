package com.example.resources;

import com.example.demo.dtos.LivroDTO;
import com.example.services.LivroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/livro")
public class LivroResource {

    private final LivroService livroService;

    public LivroResource(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public ResponseEntity<List<LivroDTO>> findAll(){
        return ResponseEntity.ok().body(livroService.findAll());
    }
}
