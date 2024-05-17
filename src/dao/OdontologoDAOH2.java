package dao;

import model.Domicilio;
import model.Odontologo;
import model.Paciente;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOH2 implements iDao<Odontologo> {

    private static final Logger logger = Logger.getLogger(OdontologoDAOH2.class);
    private static final String SQL_SELECT_MANY = "SELECT * FROM ODONTOLOGOS";

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        return null;
    }

    @Override
    public Odontologo buscarPorId(Integer id) {
        return null;
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public void actualizar(Odontologo odontologo) {

    }

    @Override
    public List<Odontologo> buscarTodos() {
        logger.info("iniciando la operacion de listado de odontologos ");
        Connection connection = null;
        ArrayList<Odontologo> odontologos = new ArrayList();
        try {
            connection = BD.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SQL_SELECT_MANY);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int matricula = rs.getInt("matricula");

                Odontologo odontologo = new Odontologo(matricula, nombre, apellido);
                odontologos.add(odontologo);
            }

            rs.close();
            statement.close();
        } catch (Exception e) {
            logger.error("Error al listar odontólogos: " + e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                    logger.error("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }

        return odontologos;
    }
}