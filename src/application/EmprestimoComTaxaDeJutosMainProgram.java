package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.BrasilTaxaDeJurosService;
import model.services.TaxaDeJuros;
import model.services.UsaTaxaDeJurosService;

/**
 * Exemplo didático que explora o uso de métodos default implementado em interfaces, recurso provido a partir do java 8.
 * @author julian
 *
 */
public class EmprestimoComTaxaDeJutosMainProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados do Empréstimo: ");
		System.out.print("Entre com a quantia:");
		double pQuantia = sc.nextDouble();
		System.out.print("Entre com a quantidade de meses:");
		int pQuantidadeMes = sc.nextInt();
		
		TaxaDeJuros txBr = new BrasilTaxaDeJurosService(2.0);
		double pagamentoBr = txBr.pagamento(pQuantia, pQuantidadeMes);
		System.out.println("Pagamento após " + pQuantidadeMes + " meses (BR):");
		System.out.println(String.format("%.2f",pagamentoBr));
		
		System.out.println("----------------------------------");
		TaxaDeJuros txUs = new UsaTaxaDeJurosService(1.0);
		double pagamentoUs = txUs.pagamento(pQuantia, pQuantidadeMes);
		System.out.println("Pagamento após " + pQuantidadeMes + " meses (USA):");
		System.out.println(String.format("%.2f",pagamentoUs));
		
		sc.close();

	}

}
