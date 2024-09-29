package Root.Spring_mvc.modules.pessoaModel.domain.dtos;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CreatePessoaDTO {

     /* ABOUT @PATTERN COMMENTED LINE
    This pattern will fit as "default message" if led on first access...
    By commenting the @Pattern, the message to be displayed will be the one as in the UserErrorConstants class who fits the constant...
    */

    @Id
    @NotBlank(message = "kkkk cpf vazio, feião")
    //@Pattern(regexp = "^([0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2})$", message = "CPF inválido. O formato esperado é XXX.XXX.XXX-XX.")
    private String cpf;

    /* ABOUT @NOT BLANK & @SIZE COMMENTED LINES

    Notice that the same fits here in the @NotBlank and @Size annotation
    - The jakarta @Valid itself will treat the error by displaying "size must be between 'min' and 'max'."
    So its for you to kinda decide if you fit the message here or using the constants ones...
    If you prefer to not use @NotBlank ones, you'll have to treat the nullable factor on the service layer
    making reference to a new constant in "Spring-mvc/src/main/java/Root/Spring_mvc/shared/common/utils/consts/UserErrorConsts.java"
    */

    @NotBlank(message = "Name cannot be empty")
    @Size(min = 5, max = 200)
    private String name;


    private Integer age;

}