package Grupo8.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Entity implements Serializable {
    private long id;
    private String nombre;
    private Integer miembrosAfectados;
    private List<Incident> incidentes;
}
