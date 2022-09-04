package beans;

import java.sql.Date;
public class Citas {
    
    private int id;
    private String username;
    private Date Fecha;

    public Citas(int id, String username, Date Fecha) {
        this.id = id;
        this.username = username;
        this.Fecha = Fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    @Override
    public String toString() {
        return "Citas{" + "id=" + id + ", username=" + username + ", Fecha=" + Fecha + '}';
    }
    
    
    
}
