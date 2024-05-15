package gestor.registro.lib.entity;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "situacao_faturamento")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SituacaoFaturamentoProjeto {

    @Id
    @Column(name = "id_situacao_faturamento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSituacaoFaturamento;
    
    @Column(name = "nm_situacao_faturamento")
	private String nmSituacaoFaturamento;
	
    @Column(name = "in_ativo")
	private Integer inAtivo;
	
    @Column(name = "dt_inclusao")
	private LocalDateTime dtInclusao;
    
    @OneToMany(mappedBy = "situacaoFaturamento")
    private Set<Projeto> situacaoFaturamento;
}