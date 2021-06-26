package com.dio.live.model;

import lombok.*;

import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {
    private Long id;
    @ManyToOne //várias localidades tem um nível de acesso
    private NivelDeAcesso nivelDeAcesso;
    private String descricao;
}
