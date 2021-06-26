package com.dio.live.service;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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


    public ResponseEntity<JornadaTrabalho> getById(Long idJornada) throws Exception {
        Optional<JornadaTrabalho> byId = this.jornadaRepository.findById(idJornada);

        if(byId.isPresent()) {
            return ResponseEntity.ok(byId.get());
        }
        throw new Exception("Jornada não encontrada!");
    }

    }


