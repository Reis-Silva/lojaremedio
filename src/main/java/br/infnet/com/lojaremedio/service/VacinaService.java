package br.infnet.com.lojaremedio.service;

import br.infnet.com.lojaremedio.model.Vacina;

import java.util.Collection;

public interface VacinaService {

    Collection<Vacina> obterLista();

    Vacina obterPorId(Long id);

    Vacina incluir(Vacina vacina);

    Vacina atualizar(Long id, Vacina vacina);

    void excluir(Long id);
}
