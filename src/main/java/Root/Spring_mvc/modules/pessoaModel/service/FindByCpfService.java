package Root.Spring_mvc.modules.pessoaModel.service;

import Root.Spring_mvc.modules.pessoaModel.infra.database.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindByCpfService {

    private final PessoaRepository pRepo;

    public String getUserByCpf(String cpf) {
        pRepo.findByCpf(cpf);
        return cpf;
    }

}
