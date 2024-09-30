package Root.Spring_mvc.modules.pessoaModel.infra.http.controller;

import Root.Spring_mvc.modules.pessoaModel.service.FindAllService;
import Root.Spring_mvc.modules.pessoaModel.infra.database.entity.Pessoa;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/users")
public class FindAllPessoasController {

    private final FindAllService fAll;

    @GetMapping("/all")
    public ResponseEntity<List<Pessoa>> returnAllPessoas() {
        return ResponseEntity.ok().body(fAll.getAllPessoas());
    }

}
