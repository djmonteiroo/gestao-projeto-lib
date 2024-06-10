package gestor.registro.lib.records;

import gestor.registro.lib.enumerator.UsuarioRoleEnum;

public record RegistrarUsuarioRecord(String login, String senha, UsuarioRoleEnum role) {
}
