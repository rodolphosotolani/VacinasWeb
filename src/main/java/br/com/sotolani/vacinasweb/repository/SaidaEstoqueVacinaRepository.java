package br.com.sotolani.vacinasweb.repository;

import br.com.sotolani.vacinasweb.domain.SaidaEstoqueVacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaidaEstoqueVacinaRepository extends JpaRepository<SaidaEstoqueVacina, Integer> {
}
