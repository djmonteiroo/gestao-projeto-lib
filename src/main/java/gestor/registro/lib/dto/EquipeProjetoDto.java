package gestor.registro.lib.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipeProjetoDto {

	private Long idResponsavelProjeto;
	private String nmEquipe;
	private Integer inAtivo;
	private LocalDateTime dtInclusao;
}
