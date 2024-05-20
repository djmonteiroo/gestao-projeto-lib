package gestor.registro.lib.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParcelaDto {

    private String anoMesReferencia;
    private Integer nrParcela;
    private Double vlParcela;
    private Double percentualParcela;
}
