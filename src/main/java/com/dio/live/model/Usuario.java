package com.dio.live.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Usuario {
    private Long id;
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    private Empresa empresa;
    private NivelDeAcesso nivelDeAcesso;
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioDaJornada;
    private LocalDateTime finalDaJornada;
}
