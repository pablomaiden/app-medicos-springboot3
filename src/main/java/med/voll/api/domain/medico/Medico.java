package med.voll.api.domain.medico;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.domain.endereco.Endereco;
import med.voll.api.medicos.DadosAtualizacaoMedico;
import med.voll.api.medicos.DadosCadastroMedico;
import med.voll.api.medicos.Especialidade;

@Entity(name="medicos")
@Table(name = "Medicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    private Boolean ativo;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados){
        this.ativo = true;
        this.nome= dados.nome();
        this.email= dados.email();
        this.crm= dados.crm();
        this.endereco= new Endereco(dados.endereco());
        this.especialidade=dados.especialidade();
        this.telefone=dados.telefone();
    }


    public void atualizarInformacoes(DadosAtualizacaoMedico dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if (dados.endereco() != null) {
            this.endereco.atualizarInformacoes(dados.endereco());
        }
    }

    public void excluir() {
        this.ativo=false;
    }
}