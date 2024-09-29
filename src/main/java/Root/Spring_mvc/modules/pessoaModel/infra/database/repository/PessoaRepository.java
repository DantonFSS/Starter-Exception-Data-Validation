package Root.Spring_mvc.modules.pessoaModel.infra.database.repository;

import Root.Spring_mvc.modules.pessoaModel.infra.database.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PessoaRepository extends JpaRepository<Pessoa, UUID> {

    Pessoa findByCpf(String cpf);
}
