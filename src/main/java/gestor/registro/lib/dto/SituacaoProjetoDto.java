package gestor.registro.lib.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SituacaoProjetoDto {

	private Long idSituacaoProjeto;
	private String nmSituacaoProjeto;
	private Integer inAtivo;
	private LocalDateTime dtInclusao;
	private String dtInclusaoSaida;
}
