package med.voll.api.medicos;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.endereco.Endereco;

@Entity(name="medicos")
@Table(name = "Medico", schema = "gouser")
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
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;


}
