package br.com.sotolani.vacinasweb.repository;

import br.com.sotolani.vacinasweb.domain.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Integer> {
}
