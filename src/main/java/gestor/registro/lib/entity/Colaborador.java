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
@Table(name = "colaborador")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Colaborador {

    @Id
    @Column(name = "id_colaborador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idColaborador;

    @Column(name = "nm_colaborador")
    private String nmColaborador;

    @Column(name = "in_ativo")
    private Integer inAtivo;

    @Column(name = "dt_inclusao")
    private LocalDateTime dtInclusao;

    @OneToMany(mappedBy = "colaborador")
    private Set<Projeto> projetos;

    @OneToMany(mappedBy = "responsavelEquipe")
    private Set<EquipeProjeto> equipes;

    @ManyToOne
    @JoinColumn(name = "id_gestor", referencedColumnName = "id_colaborador")
    private Colaborador gestor;

    @Column(name = "id_gestor", insertable=false, updatable=false)
    private Long idGestor;

    @ManyToOne
    @JoinColumn(name = "id_cargo")
    @NotNull
    private Cargo cargoColaborador;
}
