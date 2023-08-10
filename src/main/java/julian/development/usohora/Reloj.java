package julian.development.usohora;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Julian Development
 */
public class Reloj {

    protected LocalTime hora;
    protected LocalDate dia;
    protected String modelo;
    protected String numeroDeSerie;

    public Reloj(String modelo, String numeroDeSerie) {
        this.hora = LocalTime.now();
        this.dia = LocalDate.now();
        this.modelo = modelo;
        this.numeroDeSerie = numeroDeSerie;
    }

    public LocalTime getHora() {
        return hora;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }
    
    

}
