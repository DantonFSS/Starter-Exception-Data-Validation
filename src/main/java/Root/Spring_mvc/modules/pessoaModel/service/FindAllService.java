package Root.Spring_mvc.modules.pessoaModel.service;

import Root.Spring_mvc.modules.pessoaModel.infra.database.entity.Pessoa;
import Root.Spring_mvc.modules.pessoaModel.infra.database.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindAllService {

    private final PessoaRepository pRepo;

    public List<Pessoa> getAllPessoas() {
        return pRepo.findAll();
    }

}
