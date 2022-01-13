package bo.edu.uap.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Convirtiendo objeto a JSON..." );
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("src/main/resources/vars.properties")));
        Persona persona = new Persona();
        persona.setNombre("Pedro Perez");
        persona.setEdad(14);
        persona.setPropiedad(properties.getProperty("PROPIEDAD_1"));
        ObjectMapper mapper = new ObjectMapper();
        String resultado = mapper.writeValueAsString(persona);
        System.out.println(resultado);
    }
}
