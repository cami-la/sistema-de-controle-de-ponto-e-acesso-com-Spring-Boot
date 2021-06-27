package com.dio.live.service;

import com.dio.live.controller.dto.JornadaTrabalhoDto;
import com.dio.live.controller.form.AtualizacaoJornadaTrabalhoForm;
import com.dio.live.model.JornadaTrabalho;
import com.dio.live.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {
    @Autowired
    private JornadaRepository jornadaRepository;

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
        return this.jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return this.jornadaRepository.findAll();
    }

    public ResponseEntity<JornadaTrabalho> getById(Long idJornada) {
        Optional<JornadaTrabalho> byId = this.jornadaRepository.findById(idJornada);
        return byId.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    public ResponseEntity<JornadaTrabalhoDto> updateJornada( Long idJornada, AtualizacaoJornadaTrabalhoForm form ) {
        Optional<JornadaTrabalho> byId = this.jornadaRepository.findById(idJornada);

        if (byId.isPresent()) {
            JornadaTrabalho jornadaTrabalho = form.update(idJornada, this.jornadaRepository);
            return ResponseEntity.ok(new JornadaTrabalhoDto(jornadaTrabalho));
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    public ResponseEntity<JornadaTrabalho> deleteJornada(Long idJornada) {
        Optional<JornadaTrabalho> byId = this.jornadaRepository.findById(idJornada);

        if (byId.isPresent()) {
            this.jornadaRepository.deleteById(idJornada);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }

}

