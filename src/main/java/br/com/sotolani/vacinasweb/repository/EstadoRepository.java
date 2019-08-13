package br.com.sotolani.vacinasweb.repository;

import br.com.sotolani.vacinasweb.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
