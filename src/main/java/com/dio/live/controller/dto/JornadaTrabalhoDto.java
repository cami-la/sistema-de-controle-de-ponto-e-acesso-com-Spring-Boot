package com.dio.live.controller.dto;

import com.dio.live.model.JornadaTrabalho;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JornadaTrabalhoDto {
    private Long id;
    private String descricao;

    public JornadaTrabalhoDto(JornadaTrabalho jornadaTrabalho) {
        this.id = jornadaTrabalho.getId();
        this.descricao = jornadaTrabalho.getDescricao();
    }



}
