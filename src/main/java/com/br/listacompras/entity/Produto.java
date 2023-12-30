package com.br.listacompras.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;


import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "tb_produtos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;



    @OneToMany(mappedBy = "produto", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Estoque> estoque = new ArrayList<>();

}
