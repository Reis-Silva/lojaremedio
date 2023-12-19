package br.infnet.com.lojaremedio.controller;

import br.infnet.com.lojaremedio.exception.VendaNotFoundException;
import br.infnet.com.lojaremedio.model.Vacina;
import br.infnet.com.lojaremedio.payload.ResponsePayLoad;
import br.infnet.com.lojaremedio.service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/vacina")
public class VacinaController {

    @Autowired
    private VacinaService vacinaService;

    @Value("${spring.application.serverNick}")
    private String nickname;

    @GetMapping(value = "/lista")
    public ResponseEntity<?> lista() {

        List<Vacina> vacinas = (List<Vacina>) vacinaService.obterLista();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("server-name", nickname);

        return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(vacinas);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity buscaPorId(@PathVariable Long id) {
        try {
            Vacina vacina = vacinaService.obterPorId(id);

            return ResponseEntity.ok(vacina);

        }catch (VendaNotFoundException ex){

            ResponsePayLoad message = ResponsePayLoad.builder().Message("Not Found").dateTime(LocalDateTime.now()).build();

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    @PostMapping
    public ResponseEntity<?> incluir(@RequestBody Vacina vacina) {

        vacina = vacinaService.incluir(vacina);

        return ResponseEntity.status(HttpStatus.CREATED).body(vacina);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody Vacina vacina) {

        vacina = vacinaService.atualizar(id,vacina);

        return ResponseEntity.status(HttpStatus.CREATED).body(vacina);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> exclusao(@PathVariable Long id) {

        vacinaService.excluir(id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
