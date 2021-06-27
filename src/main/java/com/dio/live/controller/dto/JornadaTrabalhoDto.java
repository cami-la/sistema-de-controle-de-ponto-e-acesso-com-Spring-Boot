package com.dio.live.controller.dto;

import com.dio.live.model.JornadaTrabalho;
import lombok.Getter;

@Getter
public class JornadaTrabalhoDto {
    private Long id;
    private String descricao;

    public JornadaTrabalhoDto(JornadaTrabalho jornadaTrabalho) {
        this.id = jornadaTrabalho.getId();
        this.descricao = jornadaTrabalho.getDescricao();
    }

    /*public JornadaTrabalho convert(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalh
    }*/
}
