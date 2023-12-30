package com.br.listacompras.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "tb_compras")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer qtdComprado;

    private Integer valorProduto;

    private Integer valorTotal;

    @ManyToOne
    @JoinColumn(name = "estoque_id")
    private  Estoque estoque;







}
