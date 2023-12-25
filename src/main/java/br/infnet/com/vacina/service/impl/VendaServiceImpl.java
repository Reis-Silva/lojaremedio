package br.infnet.com.vacina.service.impl;

import br.infnet.com.vacina.exception.VendaNotFoundException;
import br.infnet.com.vacina.model.Venda;
import br.infnet.com.vacina.repository.VendaRepository;
import br.infnet.com.vacina.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaServiceImpl implements VendaService {

    @Autowired
    private VendaRepository vendaRepository;
    @Override
    public Venda obterPorId(Long id) {
        return vendaRepository.findById(id).orElseThrow(VendaNotFoundException::new);
    }
}
