package br.com.sotolani.vacinasweb.repository;

import br.com.sotolani.vacinasweb.domain.EstoqueVacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueVacinaRepository extends JpaRepository<EstoqueVacina, Integer> {
}
