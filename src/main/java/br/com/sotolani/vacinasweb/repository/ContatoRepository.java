package br.com.sotolani.vacinasweb.repository;

import br.com.sotolani.vacinasweb.domain.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
