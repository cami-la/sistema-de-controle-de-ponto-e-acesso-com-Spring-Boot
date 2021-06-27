package com.dio.live.controller;

import com.dio.live.controller.dto.JornadaTrabalhoDto;
import com.dio.live.controller.form.AtualizacaoJornadaTrabalhoForm;
import com.dio.live.controller.form.JornadaTrabalhoForm;
import com.dio.live.model.JornadaTrabalho;
import com.dio.live.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/jornada")
public class JornadaTrabalhoController {

    @Autowired
    private JornadaService jornadaService;

    @PostMapping
    @Transactional
    public ResponseEntity<JornadaTrabalhoDto> createJornada(@RequestBody @Valid JornadaTrabalhoForm jornadaTrabalhoForm) {
        return this.jornadaService.saveJornada(jornadaTrabalhoForm);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList() {
        return this.jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalhoDto> jornadaFindById(@PathVariable("idJornada") Long idJornada) {
        return this.jornadaService.getById(idJornada);
    }

    @DeleteMapping("/{idJornada}")
    @Transactional
    public ResponseEntity<JornadaTrabalhoDto> deleteJornadaFindById(@PathVariable("idJornada") Long idJornada) {
        return this.jornadaService.deleteJornada(idJornada);
    }

    @PutMapping("/{idJornada}")
    @Transactional
    public ResponseEntity<JornadaTrabalhoDto> updateJornadaFindById(@PathVariable("idJornada") Long idJornada,
                                                                    @RequestBody @Valid AtualizacaoJornadaTrabalhoForm atualizacaoJornadaTrabalhoForm) {
        return this.jornadaService.updateJornada(idJornada, atualizacaoJornadaTrabalhoForm);
    }

}
