package br.utfpr.edu.pw25s.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class AtividadeUm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
