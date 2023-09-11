package Grupo8.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Incident implements Serializable {
    private String descripcion;

    private Integer tiempoResolucion;

    private Boolean resuelto;

    public boolean isResuelto() {
        return resuelto;
    }
}
