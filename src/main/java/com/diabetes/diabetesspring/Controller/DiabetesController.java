package com.diabetes.diabetesspring.Controller;

import java.util.List;
import java.util.*;

import com.diabetes.diabetesspring.Model.Dados;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/diabetes")
public class DiabetesController {
    
    @GetMapping
    public String exemplo(){
        return "11";
    }

    @PostMapping
    public void calcular(@RequestBody Dados dados){
        SimuladorDiabetesInterventionGroup program = new SimuladorDiabetesInterventionGroup();
        double indiceG = program.executar(dados);
        System.out.println(indiceG);
    }
}
