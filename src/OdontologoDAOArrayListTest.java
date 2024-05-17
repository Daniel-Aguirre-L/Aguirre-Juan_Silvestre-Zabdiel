import dao.OdontologoDAOArrayList;
import model.Odontologo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.OdontologoService;

import java.util.List;

public class OdontologoDAOArrayListTest {

    @Test
    public void ListarOdontologosArray() {

        OdontologoService odontologoService = new OdontologoService(new OdontologoDAOArrayList());

        Odontologo odontologo1 = new Odontologo(123, "Carlos", "angulo");
        Odontologo odontologo2 = new Odontologo(222, "Maria", "Bernal");


        odontologoService.guardarOdontologo(odontologo1);
        odontologoService.guardarOdontologo(odontologo2);


        List<Odontologo> odontologos = odontologoService.listar();


        Assertions.assertNotNull(odontologos, "La lista de odontólogos no debería ser nula");
        Assertions.assertEquals(2, odontologos.size(), "La lista de odontólogos debería tener dos elementos");
    }
}