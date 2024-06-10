package gestor.registro.lib.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "cargo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cargo {

    @Id
    @Column(name = "id_cargo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCargo;

    @Column(name = "nm_cargo")
    private String nmCargo;

    @Column(name = "dt_inclusao")
    private LocalDateTime dtInclusao;

    @Column(name = "in_ativo")
    private Integer inAtivo;

    @OneToMany(mappedBy = "cargoColaborador")
    private Set<Colaborador> cargoColaborador;
}
