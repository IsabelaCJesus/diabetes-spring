package com.diabetes.diabetesspring.Controller;

import com.diabetes.diabetesspring.Model.Dados;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/diabetesIntervention")
public class DiabetesControllerInterventionGroup {
    
   /* @GetMapping
    public String exemplo(){
        return "11";
    }*/

    @PostMapping
    public Double calcularInterventionGroup(@RequestBody Dados dados){
        SimuladorDiabetesInterventionGroup program = new SimuladorDiabetesInterventionGroup();
        double indiceG = program.executar(dados);
       // System.out.println(indiceG);
        return indiceG;
    }
}
