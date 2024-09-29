package Root.Spring_mvc.modules.pessoaModel.service;

import Root.Spring_mvc.modules.pessoaModel.infra.database.entity.Pessoa;
import Root.Spring_mvc.modules.pessoaModel.infra.database.repository.PessoaRepository;
import Root.Spring_mvc.exception.HttpBadRequestException;
import Root.Spring_mvc.exception.HttpNotFoundException;
import Root.Spring_mvc.shared.common.utils.consts.UserErrorConsts;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreatePessoaService {

    private final PessoaRepository pRepo;

    public Pessoa createPessoa(Pessoa pessoa) {
        if (!pessoa.getCpf().matches("^([0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2})$")) {
            throw new HttpBadRequestException(UserErrorConsts.CPF_DOES_NOT_MATCH);
        }
        if (pRepo.findByCpf(pessoa.getCpf()) != null) {
            throw new HttpNotFoundException(UserErrorConsts.CPF_CANNOT_BE_NULL);
        }
        return pRepo.save(pessoa);
    }

}
