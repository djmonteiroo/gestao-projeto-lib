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
@Table(name = "situacao_projeto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SituacaoProjeto {

    @Id
    @Column(name = "id_situacao_projeto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSituacaoProjeto;
    
    @Column(name = "nm_situacao_projeto")
	private String nmSituacaoProjeto;
	
    @Column(name = "in_ativo")
	private Integer inAtivo;
	
    @Column(name = "dt_inclusao")
	private LocalDateTime dtInclusao;
    
    @OneToMany(mappedBy = "situacaoProjeto")
    private Set<Projeto> situacaoProjetos;
}