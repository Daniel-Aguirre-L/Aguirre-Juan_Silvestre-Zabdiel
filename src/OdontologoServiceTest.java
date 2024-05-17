import dao.BD;
import model.Odontologo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.OdontologoService;
import service.PacienteService;

import java.util.List;

public class OdontologoServiceTest {

    @Test
    public void listarOdontologos() {
        OdontologoService odontologoService = new OdontologoService();
        List<Odontologo> odontologos = odontologoService.listar();

        Assertions.assertNotNull(odontologos, "La lista de odontólogos no debería ser nula");
        Assertions.assertFalse(odontologos.isEmpty(), "La lista de odontólogos no debería estar vacía");
    }
}

