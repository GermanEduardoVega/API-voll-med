package med.voll.api.medico;

import med.voll.api.direccion.Direccion;

public record DatosRegistroPaciente(
        String nombre,
        String email,
        String telefono,
        String documento_identidad,
        Direccion direccion
        ) {
}
