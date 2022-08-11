package crud;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luciano Aldax
 */
public class FunctionsClass {

    private String url;
    private final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void readSQL() {//Function for take the Url SQL from txt

        File f = new File("jdbc properties.txt");

        Scanner scanner;
        try {

            scanner = new Scanner(f);

            url = scanner.nextLine();

            scanner.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema en: readSQL.\n" + e, "Advertencia", JOptionPane.WARNING_MESSAGE);

        }

    }

    public void save(String name, String phone, DefaultTableModel datos) {
        String date = dateFormatter.format(new java.util.Date());
        try {

            Connection c = DriverManager.getConnection(url);
            Statement s = c.createStatement();
            int res = s.executeUpdate("INSERT INTO dbo.TableClients (NAME_CLIENT, PHONE_CLIENT,DISCHARGE_DATE)"
                    + " values ('" + name + "','" + phone + "','" + date + "') ");

            JOptionPane.showMessageDialog(null, "Se guardó correctamente.", "Exito", JOptionPane.WARNING_MESSAGE);

            datos.addRow(new Object[]{name, phone});        //Add cllient to list

        } catch (SQLException e) {

            System.out.println("error en boton guardar " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Ocurrió un problema.\n" + e, "Error!", JOptionPane.WARNING_MESSAGE);

        }

    }

    public void showClients(DefaultTableModel datos) {

        try ( Connection c = DriverManager.getConnection(url);  Statement s = c.createStatement()) {
            ResultSet res = s.executeQuery("select dbo.TableClients.ID_CRUD_DATABASE, dbo.TableClients.NAME_CLIENT, dbo.TableClients.PHONE_CLIENT from dbo.TableClients order by NAME_CLIENT");

            datos.setNumRows(0);
            while (res.next()) {
                int idclient = res.getInt("ID_CRUD_DATABASE");
                String name = res.getString("NAME_CLIENT");
                String phone = res.getString("PHONE_CLIENT");

                datos.addRow(new Object[]{idclient, name, phone});
                datos.fireTableDataChanged();

            }

        } catch (SQLException e) {
            System.out.println("error en showClients" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Ocurrió un problema.\n" + e, "Error!", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void deleteData(int rsel, DefaultTableModel data, String idclient) {

        try {
            Connection c = DriverManager.getConnection(url);
            Statement s = c.createStatement();

            s.executeUpdate("DELETE FROM dbo.TableClients where ID_CRUD_DATABASE=" + idclient);
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente.", "Exito", JOptionPane.WARNING_MESSAGE);

            data.removeRow(rsel);

        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.out.println("error en botonDelete " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Ocurrió un problema\n" + e, "Advertencia", JOptionPane.WARNING_MESSAGE);

        }

    }

}
