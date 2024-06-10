package gestor.registro.lib.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ColaboradorDto {

	private String nmColaborador;
	private LocalDateTime dtInclusao;
	private String dtInclusaoSaida;
	private Integer inAtivo;
	private Long idGestor;
	private Long idColaborador;
	private String nmCargo;
}