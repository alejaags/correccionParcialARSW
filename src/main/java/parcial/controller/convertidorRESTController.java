package parcial.controller;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import parcial.model.Grado;
import parcial.service.servicioConvertidor;

import javax.ws.rs.Path;


@CrossOrigin("*")
@RestController()
@RequestMapping(value="/Temp")
public class convertidorRESTController {

    @Autowired
    servicioConvertidor cc;

    @GetMapping("/{medida}/{valor}")
    public double getConversion(@PathVariable ("medida") String medida, @PathVariable("valor") double valor){
        return cc.temp(medida,valor);

    }

}
