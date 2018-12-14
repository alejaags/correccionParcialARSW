import org.junit.Test;
import parcial.model.Grado;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class convertidorTest {

    @Test
    public void convertirCelsiusAFahrenheit(){
        Grado grado = new Grado();
        double result = grado.calcResp("fahrenheit",22);
        assertEquals(result,71.6);
    }

    @Test
    public void convertirFahrenheitACelsius(){
        Grado grado = new Grado();
        double result = grado.calcResp("celsius",71.6);
        assertEquals(result,22);
    }

}
