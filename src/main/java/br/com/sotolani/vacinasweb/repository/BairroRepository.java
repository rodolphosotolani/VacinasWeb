package br.com.sotolani.vacinasweb.repository;

import br.com.sotolani.vacinasweb.domain.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BairroRepository extends JpaRepository<Bairro, Integer> {
}
