package com.dio.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Ocorrencia {
    @Id
    private long id;
    private String nome;
    private String descricao;

}
