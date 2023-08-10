package julian.development.usohora;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Julian Development
 */
public class UsoHora {

    public static void main(String[] args) {

        Reloj Citizen = new Reloj("Eco Drive Titanium", "BM856088L");
        Persona persona = new Persona("Juan", Citizen);

        persona.pedirHora();
        System.out.println("********************");
        persona.pedirDia();
        
        persona.setHoraYDia(LocalTime.of(15, 30), LocalDate.of(2023, 7, 15));
        
//        Citizen.setHora(LocalTime.of(16, 15));
//        Citizen.setDia(LocalDate.of(2023, 7, 11));
        System.out.println("********************");
        persona.pedirHora();
        System.out.println("********************");
        persona.pedirDia();
        
        
    }

}
