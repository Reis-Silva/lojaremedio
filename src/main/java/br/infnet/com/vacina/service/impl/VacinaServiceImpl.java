package br.infnet.com.vacina.service.impl;

import br.infnet.com.vacina.model.Vacina;
import br.infnet.com.vacina.repository.VacinaRepository;
import br.infnet.com.vacina.service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.infnet.com.vacina.exception.VendaNotFoundException;

import java.util.Collection;

@Service
public class VacinaServiceImpl implements VacinaService {

    @Autowired
    private VacinaRepository vacinaRepository;

    @Override
    public Collection<Vacina> obterLista(){

        return vacinaRepository.findAll();
    }
    @Override
    public Vacina obterPorId(Long id){
        return vacinaRepository.findById(id).orElseThrow(VendaNotFoundException::new);
    }

    @Override
    public Vacina incluir(Vacina vacina) {

        return vacinaRepository.save(vacina);
    }

    @Override
    public Vacina atualizar(Long id, Vacina vacina) {

        vacina.setId(id);

        return vacinaRepository.save(vacina);
    }

    @Override
    public void excluir(Long id) {
        vacinaRepository.deleteById(id);
    }
}
