package beans;

public class Pacientes {

    private String username;
    private String contrasena;
    private String nombres;
    private String apellidos;
    private String email;
    private String direccion;
    private String telfijo;
    private String telmovil;

    public Pacientes(String username, String contrasena, String nombres, String apellidos, String email, String direccion, String telfijo, String telmovil) {
        this.username = username;
        this.contrasena = contrasena;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.direccion = direccion;
        this.telfijo = telfijo;
        this.telmovil = telmovil;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelfijo() {
        return telfijo;
    }

    public void setTelfijo(String telfijo) {
        this.telfijo = telfijo;
    }

    public String getTelmovil() {
        return telmovil;
    }

    public void setTelmovil(String telmovil) {
        this.telmovil = telmovil;
    }

    @Override
    public String toString() {
        return "Pacientes{" + "username=" + username + ", contrasena=" + contrasena + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email + ", direccion=" + direccion + ", telfijo=" + telfijo + ", telmovil=" + telmovil + '}';
    }
    
    

}
