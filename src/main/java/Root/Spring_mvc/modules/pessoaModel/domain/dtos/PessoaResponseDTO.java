package Root.Spring_mvc.modules.pessoaModel.domain.dtos;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PessoaResponseDTO {
        private UUID id;
        private String name;
        private Integer age;
        private String cpf;
}
