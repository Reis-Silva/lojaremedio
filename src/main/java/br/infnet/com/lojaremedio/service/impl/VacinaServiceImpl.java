package br.infnet.com.venda.service.impl;

import br.infnet.com.venda.model.Vacina;
import br.infnet.com.venda.repository.VacinaRepository;
import br.infnet.com.venda.service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.infnet.com.venda.exception.VacinaNotFoundException;

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
        return vacinaRepository.findById(id).orElseThrow(VacinaNotFoundException::new);
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
