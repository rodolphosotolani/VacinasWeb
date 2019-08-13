package br.com.sotolani.vacinasweb.repository;

import br.com.sotolani.vacinasweb.domain.LoteVacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoteVacinaRepository extends JpaRepository<LoteVacina, Integer> {
}
