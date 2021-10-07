package br.utfpr.edu.pw25s.model;

import br.utfpr.edu.pw25s.model.enums.TipoMovimentacao;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(scale = 2, nullable = false)
    private BigDecimal valor;

    private String descricao;

    @Column(nullable = false)
    private TipoMovimentacao tipo;

    @Column(nullable = false)
    private Date data;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pessoa_id", nullable = false)
    private Pessoa pessoa;

}
