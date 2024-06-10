package gestor.registro.lib.enumerator;

public enum UsuarioRoleEnum {
    ADMIN("Admin"),
    USER("usuario");

    private String role;

     UsuarioRoleEnum(String role){
        this.role = role;
    }

    public String getRole(){
         return role;
    }
}
