package br.com.sotolani.vacinasweb.repository;

import br.com.sotolani.vacinasweb.domain.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissaoRepository extends JpaRepository<Permissao, Integer> {
}
