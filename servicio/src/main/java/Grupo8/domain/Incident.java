package Grupo8.domain;

import lombok.Getter;

@Getter
public class Incident {
    private String descripcion;

    private Integer tResolucion;

    private Boolean resuelto;

    public boolean isResuelto() {
        return resuelto;
    }
}
