package Root.Spring_mvc.modules.pessoaModel.infra.http.controller;

import Root.Spring_mvc.modules.pessoaModel.domain.dtos.CreatePessoaDTO;
import Root.Spring_mvc.modules.pessoaModel.domain.dtos.PessoaResponseDTO;
import Root.Spring_mvc.modules.pessoaModel.domain.dtos.mappers.PessoaMapper;
import Root.Spring_mvc.modules.pessoaModel.service.CreatePessoaService;
import Root.Spring_mvc.modules.pessoaModel.infra.database.entity.Pessoa;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/users")
public class CreatePessoaController {

    private final CreatePessoaService pServ;

    @PostMapping("/create")
    public ResponseEntity<PessoaResponseDTO> createPessoa(@Valid @RequestBody CreatePessoaDTO createPessoaDto){
        Pessoa pessoa = pServ.createPessoa(PessoaMapper.mappingToPessoaEntity(createPessoaDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(PessoaMapper.mappingToPessoaResponse(pessoa));
    }

}
