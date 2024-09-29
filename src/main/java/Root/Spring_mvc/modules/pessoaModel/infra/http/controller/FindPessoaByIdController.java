package Root.Spring_mvc.modules.pessoaModel.infra.http.controller;

import Root.Spring_mvc.modules.pessoaModel.service.FindByIdService;
import Root.Spring_mvc.modules.pessoaModel.infra.database.entity.Pessoa;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/users")
public class FindPessoaByIdController {

    private final FindByIdService findId;

    @GetMapping("/find/{id}")
    public ResponseEntity<Pessoa> findUserById(@Valid @PathVariable UUID id) {
        Pessoa pessoa = findId.callById(id);
        return ResponseEntity.ok().body(pessoa);
    }

}
