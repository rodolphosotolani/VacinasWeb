package br.com.sotolani.vacinasweb.repository;

import br.com.sotolani.vacinasweb.domain.TipoFuncionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoFuncionarioRepository extends JpaRepository<TipoFuncionario, Integer> {
}
