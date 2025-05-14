package br.com.unicuritiba.AtividadeDiego.repository;

import br.com.unicuritiba.AtividadeDiego.model.Cliente;
import ch.qos.logback.core.net.server.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
     public Optional<Client> findByNome(String nome);
}
