package calcDev;
import java.util.Scanner;

public class Calculadora {
	Scanner scan = new Scanner(System.in);
	 public void init() {    
		 System.out.println("Informe o cálculo que desejas utilizar");

			String txt = scan.nextLine(); // Aqui utilizado o espaço como atributo
			String operacao[] = new String[3];

			operacao = txt.split(" ");
			float valor1 = Float.parseFloat(operacao[0]);
			float valor2 = Float.parseFloat(operacao[2]);

			switch (operacao[1]) {
			case "+":
				System.out.println(txt + " = " + this.adicao(valor1, valor2)); // This é usado, pois está na mesma
																				// classe que estou trabalhando.
				break;

			case "-":
				System.out.println(txt + " = " + this.subtracao(valor1, valor2));

				break;
			case "*":
				System.out.println(txt + " = " + this.multiplicao(valor1, valor2));

				break;

			case "/":
				System.out.println(txt + " = " + this.divisao(valor1, valor2));

				break;
			default:
				System.out.println("Operadr não encontrado!");
				break;

			}

		}

		public float adicao(float v1, float v2) {
			return v1 + v2;

		}

		public float subtracao(float v1, float v2) {
			return v1 - v2;

		}

		public float multiplicao(float v1, float v2) {
			return v1 * v2;

		}

		public float divisao(float v1, float v2) {
			return v1 / v2;

		}
	}
