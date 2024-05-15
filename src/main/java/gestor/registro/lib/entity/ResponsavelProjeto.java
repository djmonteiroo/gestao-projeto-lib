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
@Table(name = "responsavel_projeto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponsavelProjeto {

    @Id
    @Column(name = "id_responsavel_projeto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idResponsavelProjeto;
    
    @Column(name = "nm_responsavel_projeto")
	private String nmResponsavelProjeto;
	
    @Column(name = "in_ativo")
	private Integer inAtivo;
	
    @Column(name = "dt_inclusao")
	private LocalDateTime dtInclusao;
    
    @OneToMany(mappedBy = "responsavelProjeto")
    private Set<Projeto> projetos;
    
    @OneToMany(mappedBy = "responsavelEquipe")
    private Set<EquipeProjeto> equipes;
}
