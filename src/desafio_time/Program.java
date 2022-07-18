package desafio_time;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		System.out.println("");
		Time time = new Time("Corinthians",11, 18.000);
		double valueToBuy = 9.000;
		
		
		time.buyPlayer(valueToBuy);
		System.out.printf("Saldo após a compra: %.3f%n" , time.getAccountBalance());
		System.out.println("Número de jogadores: " + time.getPlayersQuantity());
	}

}
