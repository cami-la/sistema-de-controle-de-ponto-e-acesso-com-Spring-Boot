package com.dio.live.model;

import lombok.*;

import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {
    private Long id;
    @OneToMany //uma localidade tem vários níveis de acesso
    private NivelDeAcesso nivelDeAcesso;
    private String descricao;
}
