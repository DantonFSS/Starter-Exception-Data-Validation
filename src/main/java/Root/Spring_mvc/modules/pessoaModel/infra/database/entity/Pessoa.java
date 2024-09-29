package Root.Spring_mvc.modules.pessoaModel.infra.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nome_pessoa", length = 253)
    private String name;

    @Column(name = "idade_pessoa")
    private Integer age;


    @Column(name = "cpf_pessoa", unique = true)
    private String cpf;

    public Pessoa(String name, Integer age, String cpf) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }

    public Pessoa() {
    }

}
