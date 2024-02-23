package med.voll.api.domain.consulta;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.time.LocalDateTime;

public record DadosDetalhamentoConsulta(
        //@JsonAlias({"produto_id", "id_produto"}) Long idProduto,
        Long id,
        Long idMedico,
        Long idPaciente,
        LocalDateTime data) {

}
