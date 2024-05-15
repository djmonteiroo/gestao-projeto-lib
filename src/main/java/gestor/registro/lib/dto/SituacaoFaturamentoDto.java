package gestor.registro.lib.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SituacaoFaturamentoDto {

	private Long idSituacaoFaturamento;
	private String nmSituacaoFaturamento;
	private Integer inAtivo;
	private LocalDateTime dtInclusao;
}
