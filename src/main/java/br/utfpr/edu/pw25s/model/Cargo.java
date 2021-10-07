package br.utfpr.edu.pw25s.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Cargo {

    //GenerationType.AUTO, pega o padrao da persistencia
    //GenerationType.IDENTITY, usa o autoincrement do banco
    //GenerationType.SEQUENCE, usa um sequence do banco, deve-se usar o generator
    //GenerationType.TABLE, usa uma tabela do banco, deve-se usar o generator
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String descricao;

    @Column(scale = 2)
    private BigDecimal salarioMimimo;

    @Column(scale = 2)
    private BigDecimal salarioMaximo;

    @OneToMany(mappedBy = "cargo")
    List<NivelSalarial> niveisSalariais;
}
