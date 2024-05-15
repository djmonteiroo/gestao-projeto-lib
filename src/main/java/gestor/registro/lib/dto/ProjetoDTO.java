package gestor.registro.lib.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjetoDTO {
	private String idIntranet;
	private String titulo;
	private String descricao;
	private String iniciativa;
	private Long idResponsavelProjeto;
	private Double valorTotal;
	private Double valorTotalFaturamento;
	private Long idSituacaoProjeto;
	private Long idSituacaoFaturamento;
	private LocalDate dtOrcamentacao;
	private LocalDate dtAprovacao;
	private String dtInicioDEV;
	private String dtFimDEV;
	private String dtInicioHML;
	private String dtFimHML;
	private String dtPrevisao;
	private String dtImplantacao;
	private String observacao;
	private String planoDeCusto;
	private String codigoProjeto;
	private String gerEx;
	private String gerencia;
	private String equipe;
	private Long idEquipeProjeto;
	private Integer qtParcela;
	private String anoMesReferenciaFaturamento;
}
