package br.com.sotolani.vacinasweb.repository;

import br.com.sotolani.vacinasweb.domain.Vacinacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacinacaoRepository extends JpaRepository<Vacinacao, Integer> {
}
