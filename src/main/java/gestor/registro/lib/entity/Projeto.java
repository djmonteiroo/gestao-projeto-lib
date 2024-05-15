package gestor.registro.lib.entity;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "projeto")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Projeto {
    @Id
    @Column(name = "id_projeto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProjeto; 

    @Column(name = "id_intranet")
    private String idIntranet;

    @Column(name = "nm_titulo")
    private String titulo;

    @Column(name = "tx_descricao")
    private String descricao;

    @Column(name = "cod_iniciativa")
    private String iniciativa;

    @Column(name = "cod_projeto")
    private String codigoProjeto;

    @Column(name = "cod_plano_custo")
    private String planoDeCusto;

    @Column(name = "nm_gerex")
    private String gerEx;

    @Column(name = "nm_gerencia")
    private String gerencia;
    
    @ManyToOne
    @JoinColumn(name = "id_equipe_projeto")
    @NotNull
    private EquipeProjeto equipeProjeto;

    @ManyToOne
    @JoinColumn(name = "id_responsavel_projeto")
    @NotNull
    private ResponsavelProjeto responsavelProjeto;

    @Column(name = "vl_total")
    private Double valorTotal;

    @Column(name = "vl_total_faturamento")
    private Double valorTotalFaturamento;

    @Column(name = "vl_faturamento")
    private Double valorFaturamento;

    @ManyToOne
    @JoinColumn(name = "id_situacao_projeto")
    @NotNull
    private SituacaoProjeto situacaoProjeto;

    @ManyToOne
    @JoinColumn(name = "id_situacao_faturamento")
    @NotNull
    private SituacaoFaturamentoProjeto situacaoFaturamento;

    @Column(name = "dt_orcamentacao")
    private LocalDate dtOrcamentacao;

    @Column(name = "dt_aprovacao")
    private LocalDate dtAprovacao;

    @Column(name = "dtInicio_dev")
    private String dtInicioDev;

    @Column(name = "dt_fim_dev")
    private String dtFimDEV;

    @Column(name = "dt_inicio_hml")
    private String dtInicioHML;

    @Column(name = "dt_fim_hml")
    private String dtFimHML;

    @Column(name = "dt_previsao")
    private String dtPrevisao;

    @Column(name = "dt_implantacao")
    private String dtImplantacao;

    @Column(name = "tx_observacao")
    private String observacao;
    
    @OneToMany(mappedBy = "projeto")
    private Set<DadoFaturamento> projeto;
}
