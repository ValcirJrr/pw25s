package br.utfpr.edu.pw25s.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private String telefone;

    @Column(unique = true)
    private String cpf;

    @Column(nullable = false)
    private Boolean ativo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nivel_salarial")
    private NivelSalarial nivelSalarial;

    @OneToMany(mappedBy = "pessoa")
    private List<Movimentacao> movimentacoes;

    @OneToMany(mappedBy = "pessoa")
    private List<FolhaSalarial> folhasSalariais;
}
