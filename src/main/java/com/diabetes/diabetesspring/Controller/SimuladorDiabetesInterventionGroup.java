import net.sourceforge.jFuzzyLogic.*;
import com.diabetes.diabetesspring.Model.Dados;
import java.lang.Math;

public class SimuladorDiabetesInterventionGroup {

	public double executar(Dados dados) {
		String nomeArq = "fcl/diabetesFuzzy.fcl";
		FIS fis = FIS.load(nomeArq, true);
		
		if (fis == null) {
			System.err.println("Nao foi possivel abrir o arquivo '" + nomeArq + "'");
			System.exit(1);
		}

		// Obter o bloco padrão de função
		FunctionBlock fb = fis.getFunctionBlock(null);

        Double imc = Double.parseDouble(dados.getPeso()) / Math.pow(Double.parseDouble(dados.getAltura()),2);

		fb.setVariable("idade", Double.parseDouble(dados.getIdade()));
		fb.setVariable("triglicerideos", Double.parseDouble(dados.getTriglicerideos()));
		fb.setVariable("tempoEvolutivo", Double.parseDouble(dados.getTempoEvolutivo()));
		fb.setVariable("IMC", imc);
		fb.setVariable("circunferenciaAbdominal", Double.parseDouble(dados.getCircunferenciaAbdominal()));
		fb.setVariable("renda", Double.parseDouble(dados.getRenda()));
		fb.setVariable("escolaridade", Double.parseDouble(dados.getEscolaridade()));

		// Evaluate
		fb.evaluate();

		// Mostrar o gráfico da variável de saída
		fb.getVariable("diabetes").defuzzify();

		// Impre o conjunto de regras
		//System.out.println(fb);
		//System.out.println("Diabetes: " + fb.getVariable("diabetes").getValue());

        return fb.getVariable("diabetes").getValue();
	}
}