package gestor.registro.lib.records;
import java.time.LocalDate;

public record RegistroProjetoRecord(
    String idIntranet,
    String titulo,
    String descricao,
    String iniciativa,
    Long idResponsavelProjeto,
    Double valorTotal,
    Double valorTotalFaturamento,
    Long idSituacaoProjeto,
    Long idSituacaoFaturamento,
    LocalDate dtOrcamentacao,
    LocalDate dtAprovacao,
    String dtInicioDEV,
    String dtFimDEV,
    String dtInicioHML,
    String dtFimHML,
    String dtPrevisao,
    String dtImplantacao,
    String observacao,
    String planoDeCusto,
    String codigoProjeto,
    String gerencia,
    String gerEx,
    Long idEquipeProjeto,
    Integer qtParcela,
    String anoMesReferenciaFaturamento
) {}
