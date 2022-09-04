package beans;

public class Examenes {

    private int id;
    private String cups;
    private String examen;
    private double valor;

    public Examenes(int id, String cups, String examen, double valor) {
        this.id = id;
        this.cups = cups;
        this.examen = examen;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCups() {
        return cups;
    }

    public void setCups(String cups) {
        this.cups = cups;
    }

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Examenes{" + "id=" + id + ", cups=" + cups + ", examen=" + examen + ", valor=" + valor + '}';
    }
    
    

}
