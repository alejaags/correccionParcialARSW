package parcial.model;

import org.springframework.stereotype.Service;


public class Grado implements GradoInterface {
    private String medida;
    private double valor;
    private double resp;


    @Override
    public double calcResp(String medida, double valor) {
        this.medida=medida;
        this.valor=valor;
        resp = 0;
        if(medida.equals("celsius")){
            resp=Math.ceil(((0.55555555)*(valor-32)));
        }else if(medida.equals("fahrenheit")){
            resp=((valor*(1.8))+32);
        }else{
            resp=valor;
        }
        return resp;

    }
}
