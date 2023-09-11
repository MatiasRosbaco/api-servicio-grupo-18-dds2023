package Grupo8.controllers;

import Grupo8.domain.Entity;
import Grupo8.domain.Incident;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util .*;

    @RestController
    @RequestMapping(value = "/api")
    public class EntityController {
        @PostMapping("/entidades")
        public ResponseEntity<List<Map<String, Object>>> recibirEntidades(@RequestBody List<Entity> entidades) {
            List<Map<String, Object>> result = new ArrayList<>();
            double coeficiente = 1.5; // Valor hardcodeado

            for (Entity entity : entidades) {
                int tResolucionSum = 0;
                int incidentesNoResueltos = 0;
                int miembrosAfectados = entity.getMiembrosAfectados();

                for (Incident incident : entity.getIncidentes()) {
                    if (incident.isResuelto()) {
                        tResolucionSum += incident.getTiempoResolucion();
                    } else {
                        incidentesNoResueltos++;
                    }
                }

                double nuevoValor = (tResolucionSum + (incidentesNoResueltos * coeficiente)) * miembrosAfectados;

                // Crear una nueva estructura de datos
                Map<String, Object> nuevoJson = new HashMap<>();
                nuevoJson.put("id", entity.getId());
                nuevoJson.put("nombre", entity.getNombre());
                nuevoJson.put("nuevoValor", nuevoValor);

                result.add(nuevoJson);
            }

            // Ordenar la lista de resultado por nuevoValor en orden ascendente
            result.sort(Comparator.comparingDouble(o -> (Double) o.get("nuevoValor")));

            return new ResponseEntity<>(result, HttpStatus.OK);
        }
    }

