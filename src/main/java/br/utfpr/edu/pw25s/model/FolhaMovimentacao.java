package br.utfpr.edu.pw25s.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FolhaMovimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_movimentacao")
    private Movimentacao movimentacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_folha_salarial")
    private FolhaSalarial folhaSalarial;
}
