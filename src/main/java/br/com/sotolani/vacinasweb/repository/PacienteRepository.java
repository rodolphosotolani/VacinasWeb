package br.com.sotolani.vacinasweb.repository;

import br.com.sotolani.vacinasweb.domain.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
}
