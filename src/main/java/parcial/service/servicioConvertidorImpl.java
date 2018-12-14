package parcial.service;


import org.springframework.stereotype.Service;
import parcial.model.Grado;

@Service
public class servicioConvertidorImpl implements servicioConvertidor {

    private double conv;

    @Override
    public double temp(String medida, double valor) {
        double resultado = 0;
        Grado convertidor = new Grado();
        conv = convertidor.calcResp(medida,valor);
        return conv;
    }
}
