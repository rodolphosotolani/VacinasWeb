package br.com.sotolani.vacinasweb.repository;

import br.com.sotolani.vacinasweb.domain.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Integer> {
}
