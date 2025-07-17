package med.voll.api.direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter //metodos getter se generan en tiempo de compilacion
@NoArgsConstructor  //constructor sin argumentos
@AllArgsConstructor //constructor con todos los argumentos
@Embeddable
public class Direccion {
    private String calle;
    private String numero;
    private String complemento;
    private String barrio;
    private String ciudad;
    private String codigo_postal;
    private String estado;
}


