package br.infnet.com.lojaremedio.service.impl;

import br.infnet.com.lojaremedio.exception.VendaNotFoundException;
import br.infnet.com.lojaremedio.model.Venda;
import br.infnet.com.lojaremedio.repository.VendaRepository;
import br.infnet.com.lojaremedio.service.VendaService;
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
