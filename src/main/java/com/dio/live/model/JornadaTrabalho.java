package com.dio.live.model;

import lombok.*;
import org.hibernate.annotations.ValueGenerationType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class JornadaTrabalho {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;

    public JornadaTrabalho(String descricao) {
        this.descricao = descricao;
    }

}

