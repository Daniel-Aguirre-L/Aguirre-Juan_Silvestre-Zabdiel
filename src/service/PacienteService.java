package service;

import dao.OdontologoDAOH2;
import dao.PacienteDAOH2;
import dao.iDao;
import model.Odontologo;
import model.Paciente;

import java.util.List;

public class PacienteService {
private iDao<Paciente> pacienteiDao;
private iDao<Odontologo> odontologoiDao;

    public PacienteService() {
        pacienteiDao= new PacienteDAOH2();
    }
    //metodos manuales
    public Paciente guardarPaciente(Paciente paciente){
        return pacienteiDao.guardar(paciente);
    }
    public Paciente buscarPorID(Integer id){
        return pacienteiDao.buscarPorId(id);
    }


    public void OdontologoService() {
        odontologoiDao = new OdontologoDAOH2();
    }

    public List<Odontologo> listar() {
        return odontologoiDao.buscarTodos();
    }
}
