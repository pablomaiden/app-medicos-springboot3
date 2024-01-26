package med.voll.api.medicos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(

        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,
        @NotBlank(message = "O CRM não pode ser vazio")
        @Pattern(regexp = "\\d{4,6}", message = "O CRM precisar ter entre 4 e 6 números")
        String crm,
        Especialidade especialidade,

        DadosEndereco endereco) {




}
