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
@Table(name = "tb_estoque")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer qtdProduto;

    private Integer qtdMinimo;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private  Produto produto;


    @OneToMany(mappedBy = "estoque", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Compras> compras = new ArrayList<>();

}
