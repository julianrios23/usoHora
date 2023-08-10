package julian.development.usohora;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Julian Development
 */
public class Persona {

    private String nombre;
    private Reloj reloj;

    public Persona(String nombre, Reloj reloj) {
        this.nombre = nombre;
        this.reloj = reloj;
    }

    public void pedirHora() {
        System.out.println(nombre + " pregunta la hora: " + reloj.getHora());
    }

    public void pedirDia() {
        System.out.println(nombre + " pregunta que fecha es: " + reloj.getDia().getDayOfMonth()
                + " de " + reloj.getDia().getMonth());
    }

    public void setHoraYDia(LocalTime nuevaHora, LocalDate nuevoDia) {
        reloj.setHora(nuevaHora);
        reloj.setDia(nuevoDia);
    }
//Ahora si el persona era el mio
}
