package Root.Spring_mvc.modules.pessoaModel.domain.dtos.mappers;

import Root.Spring_mvc.modules.pessoaModel.domain.dtos.CreatePessoaDTO;
import Root.Spring_mvc.modules.pessoaModel.domain.dtos.PessoaResponseDTO;
import Root.Spring_mvc.modules.pessoaModel.infra.database.entity.Pessoa;
import org.springframework.stereotype.Component;

@Component
public class PessoaMapper {

    public static Pessoa mappingToPessoaEntity(CreatePessoaDTO createPessoaDTO) {
        return new Pessoa(
                createPessoaDTO.getName(),
                createPessoaDTO.getAge(),
                createPessoaDTO.getCpf()
        );
    }

    public static PessoaResponseDTO mappingToPessoaResponse(Pessoa pessoa) {
        return new PessoaResponseDTO(
                pessoa.getId(),
                pessoa.getName(),
                pessoa.getAge(),
                pessoa.getCpf()
                );
    }

}
