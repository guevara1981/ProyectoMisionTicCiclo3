/*
*Quotes
 */
package test;

import beans.Examenes;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {

    public static void main(String[] args) {
        actualizarExamen(3,25000);
        listarExamen();
        

    }

    public static void actualizarExamen(int id, double valor) {
        DBConnection con = new DBConnection();
        String sql = "UPDATE examenes SET valor ='" + valor + "'WHERE id=" + id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();

        }
    }

    public static void listarExamen() {
        DBConnection con = new DBConnection();
        String sql = "SELECT*FROM examenes";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String cups = rs.getString("cups");
                String examen = rs.getString("examen");
                Double valor = rs.getDouble("valor");

                Examenes pruebas = new Examenes(id, cups, examen, valor);
                System.out.println(pruebas.toString());

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();

        }

    }
}