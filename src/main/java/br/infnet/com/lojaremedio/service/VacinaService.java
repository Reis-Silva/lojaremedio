package br.infnet.com.venda.service;

import br.infnet.com.venda.model.Vacina;

import java.util.Collection;

public interface VacinaService {

    Collection<Vacina> obterLista();

    Vacina obterPorId(Long id);

    Vacina incluir(Vacina vacina);

    Vacina atualizar(Long id, Vacina vacina);

    void excluir(Long id);
}
