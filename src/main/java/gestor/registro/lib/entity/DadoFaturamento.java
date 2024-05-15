package gestor.registro.lib.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "dado_faturamento")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DadoFaturamento {

    @Id
    @Column(name = "id_dado_faturamento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDadoFaturamento;
        
    @Column(name = "qt_parcela")
	private Integer qtParcela;
    
    @Column(name = "ano_mes_referencia_faturamento")
	private String anoMesReferenciaFaturamento;
    
    @Column(name = "in_ativo")
	private Integer inAtivo;
	
    @Column(name = "dt_inclusao")
	private LocalDateTime dtInclusao;
    
    @ManyToOne
    @JoinColumn(name = "id_projeto")
    @NotNull
    private Projeto projeto;
    
    @Column(name = "vl_total_faturamento")
    private Double valorTotalFaturamento;
}