package med.voll.api.medico;

import med.voll.api.direccion.Direccion;

public record DatosRegistroMedico(
        String nombre,
        String email,
        String telefono,
        String documento,
        Especialidad especialidad,
        Direccion direccion


) { //record ya incluye los get & sets y constructores
}
