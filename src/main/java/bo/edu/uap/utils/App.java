package bo.edu.uap.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonProcessingException
    {
        System.out.println( "Convirtiendo objeto a JSON..." );
        Persona persona = new Persona();
        persona.setNombre("Pedro Perez");
        persona.setEdad(14);
        ObjectMapper mapper = new ObjectMapper();
        String resultado = mapper.writeValueAsString(persona);
        System.out.println(resultado);
    }
}
