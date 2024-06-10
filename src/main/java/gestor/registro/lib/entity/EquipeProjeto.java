package gestor.registro.lib.entity;

import java.time.LocalDateTime;
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
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "equipe")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipeProjeto {

    @Id
    @Column(name = "id_equipe_projeto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipe;

    @ManyToOne
    @JoinColumn(name = "id_colaborador")
    @NotNull
    private Colaborador responsavelEquipe;

    @Column(name = "nm_equipe")
    private String nmEquipe;

    @Column(name = "in_ativo")
    private Integer inAtivo;

    @Column(name = "dt_inclusao")
    private LocalDateTime dtInclusao;

    @OneToMany(mappedBy = "equipeProjeto")
    private Set<Projeto> equipeProjeto;

}
