package com.dio.live.controller.form;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.repository.JornadaRepository;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AtualizacaoJornadaTrabalhoForm {
    @NotNull @NotEmpty
    public String descricao;

    public JornadaTrabalho update(Long idJornada, JornadaRepository jornadaRepository) {
        JornadaTrabalho jornadaTrabalho = jornadaRepository.getOne(idJornada);
        jornadaTrabalho.setDescricao(this.descricao);
        return jornadaTrabalho;
    }

}
