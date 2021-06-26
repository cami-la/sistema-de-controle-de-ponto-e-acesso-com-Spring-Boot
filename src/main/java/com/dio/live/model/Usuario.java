package com.dio.live.model;

import lombok.*;

import javax.persistence.ManyToOne;
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
    @ManyToOne //vários usuários para 1 categoria
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne //vários usuários em 1 empresa
    private Empresa empresa;
    @ManyToOne //vários usuários em 1 nível de acesso
    private NivelDeAcesso nivelDeAcesso;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioDaJornada;
    private LocalDateTime finalDaJornada;
}
