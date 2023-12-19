package br.infnet.com.lojaremedio.repository;

import br.infnet.com.lojaremedio.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long>{

}
