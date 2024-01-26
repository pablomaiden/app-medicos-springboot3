package med.voll.api.medicos;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.endereco.Endereco;

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

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados){
        this.nome= dados.nome();
        this.email= dados.email();
        this.crm= dados.crm();
        this.endereco= new Endereco(dados.endereco());
        this.especialidade=dados.especialidade();
        this.telefone=dados.telefone();
    }


}
