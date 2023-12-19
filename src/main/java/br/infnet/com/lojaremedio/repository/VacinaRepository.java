package br.infnet.com.lojaremedio.repository;

import br.infnet.com.lojaremedio.model.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Long> {

}
