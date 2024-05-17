package service;

import dao.OdontologoDAOH2;
import dao.iDao;
import model.Odontologo;
import model.Paciente;

import java.util.List;

public class OdontologoService {
    private iDao<Odontologo> odontologoiDao;

    public OdontologoService() {
        odontologoiDao = new OdontologoDAOH2();
    }
    public OdontologoService(iDao<Odontologo> odontologoiDao) {
        this.odontologoiDao = odontologoiDao;
    }

    public Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologoiDao.guardar(odontologo);
    }

    public List<Odontologo> listar() {
        return odontologoiDao.buscarTodos();
    }
}