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
public class ResposavelProjetoDto {

	private String nmResponsavelProjeto;
	private LocalDateTime dtInclusao;
	private Integer inAtivo;
}
