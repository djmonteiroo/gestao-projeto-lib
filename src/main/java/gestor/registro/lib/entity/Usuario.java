package gestor.registro.lib.entity;

import gestor.registro.lib.enumerator.UsuarioRoleEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario implements UserDetails {

    @Id
    @Column(name = "id_situacao_projeto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @NotEmpty
    @Column(name = "nm_usuario", unique = true)
    private String nmUsuario;

    @NotEmpty
    @Column(name = "nm_senha")
    private String nmSenha;

    @Column(name = "nm_role")
    private UsuarioRoleEnum nmRole;

    public Usuario(String login, String criptografarSenha, UsuarioRoleEnum role) {
        this.nmUsuario = login;
        this.nmSenha = criptografarSenha;
        this.nmRole = role;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(this.nmRole == UsuarioRoleEnum.ADMIN)
            return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"));
        else return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return nmUsuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}