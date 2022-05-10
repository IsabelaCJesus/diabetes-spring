package com.diabetes.diabetesspring.Model;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Dados {
    
    private String idade;
    private String altura;
    private String peso;
    private String triglicerideos;
    private String tempoEvolutivo;
    private String circunferenciaAbdominal;
    private String renda;
    private String escolaridade;
}
