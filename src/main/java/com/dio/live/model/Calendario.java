package com.dio.live.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendario {
    private long id;
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
