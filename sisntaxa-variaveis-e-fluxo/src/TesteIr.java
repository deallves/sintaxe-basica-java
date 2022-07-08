
public class TesteIr {
	public static void main(String[] args) {

		double irSerPago = 0.0;
		double irSerPagoFinal = 0.0;

		double salario = 3300.0;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("pode deduzir na declaração o valor de R$ 142");
			System.out.println(" o IR é de 7.5%");
			double porcentagem = 7.5 / 100;
			double deducao = 142;
			irSerPago = salario * porcentagem;
			irSerPagoFinal = irSerPago - deducao;

		} else if (salario >= 2800.1 && salario <= 3751.0) {
			System.out.println("pode deduzir na declaração o valor de R$ 350");
			System.out.println(" o IR é de 15%");
			double porcentagem = 15.0 / 100;
			double deducao = 350;
			irSerPago = salario * porcentagem;
			irSerPagoFinal = irSerPago - deducao;

		} else if (salario >= 3751.1 && salario <= 4664.0) {
			System.out.println("pode deduzir na declaração o valor de R$ 636");
			System.out.println(" o IR é de 22.5%");
			double porcentagem = 22.5 / 100;
			double deducao = 636;
			irSerPago = salario * porcentagem;
			irSerPagoFinal = irSerPago - deducao;	
		}
		
		System.out.println("Salario: " + salario);
		System.out.println("IR a ser pago: " + irSerPago);
		System.out.println("IR final a se pago: " + irSerPagoFinal);
	}
	
	
	
}
