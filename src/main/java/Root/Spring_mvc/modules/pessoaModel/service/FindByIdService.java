package Root.Spring_mvc.modules.pessoaModel.service;

import Root.Spring_mvc.modules.pessoaModel.infra.database.entity.Pessoa;
import Root.Spring_mvc.modules.pessoaModel.infra.database.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FindByIdService {

    private final PessoaRepository pRepo;

    public Pessoa callById(UUID id){
        Optional<Pessoa> pessoa = pRepo.findById(id);
        return pessoa.orElse(null);
    }
}
