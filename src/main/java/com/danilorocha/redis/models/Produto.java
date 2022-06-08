package com.danilorocha.redis.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@AllArgsConstructor
@RedisHash("Produto")
public class Produto implements Serializable {
    @Id
    private Long id;
    private String nome;
    private int qtd;
    private double preco;


}
