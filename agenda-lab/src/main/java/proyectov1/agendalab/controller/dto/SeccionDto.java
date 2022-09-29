package proyectov1.agendalab.controller.dto;

public class SeccionDto {
    private String nombre;
    private Long id;
    
    public SeccionDto() {
    }
    
    public SeccionDto(String nombre, Long id) {
        this.nombre = nombre;
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
}
