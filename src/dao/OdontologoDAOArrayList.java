package dao;


import model.Odontologo;

import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOArrayList implements iDao<Odontologo> {
    private List<Odontologo> odontologos;

    public OdontologoDAOArrayList() {
        this.odontologos = new ArrayList<>();
    }

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        odontologos.add(odontologo);
        return odontologo;
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
        return new ArrayList<>(odontologos);
    }
}