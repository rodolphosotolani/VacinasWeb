package br.com.sotolani.vacinasweb.repository;

import br.com.sotolani.vacinasweb.domain.EntradaEstoqueVacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntradaEstoqueVacinaRepository extends JpaRepository<EntradaEstoqueVacina, Integer> {
}
