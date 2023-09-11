package Grupo8.domain;

import lombok.Getter;

import java.util.List;
@Getter
public class Entity {
    private long id;
    private String nombre;
    private Integer miembrosAfectados;
    private List<Incident> incidentes;
}
