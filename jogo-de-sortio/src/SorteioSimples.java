import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

class Apostadores{
	String nome;
	double conta;
}

class CasaDeApostas{
	double conta = 200;
	Random dado = new Random();
	int aposta = Integer.parseInt(JOptionPane.showInputDialog("Jogo de aposta com dados. Coloque aqui sua aposta"));
	
	public boolean dado(double valorApostado, Apostadores contaApostador) {
		int dadoSorteado = dado.nextInt((6)+1);
	if(this.aposta == dadoSorteado){
		this.conta = this.conta - valorApostado;
		contaApostador.conta = contaApostador.conta + valorApostado;
		JOptionPane.showMessageDialog(null,"Voce Ganhou, sua aposta foi "+aposta+", e deu " + dadoSorteado + " no dado.");
		return true;
	}else{
		JOptionPane.showMessageDialog(null,"Voce perdeu, sua aposta foi "+aposta+", e deu " + dadoSorteado + " no dado.");
		this.conta = this.conta + valorApostado;
		contaApostador.conta = contaApostador.conta - valorApostado;
		return false;
		}
	}
	
	
}
public class SorteioSimples {
	public static void main(String[] args) {

		CasaDeApostas sorteio = new CasaDeApostas();
		Apostadores apostador1 = new Apostadores();
		Apostadores apostador2 = new Apostadores();
		apostador2.nome = JOptionPane.showInputDialog("Primeiro Apostador: Coloque aqui o seu nome");
		apostador2.conta = 100;
		apostador1.nome = JOptionPane.showInputDialog("Segundo Apostador: Coloque aqui o seu nome");
		apostador1.conta = 200;
		
		
		
		System.out.println("valor em conta da casa de apostas antes do sorteio: " + sorteio.conta);
		System.out.println("A conta de " + apostador1.nome + " antes do sorteio e de:" + apostador1.conta);
		sorteio.dado(50, apostador1);
		System.out.println("A conta de " + apostador1.nome + " depois do sorteio e de:" + apostador1.conta);
		System.out.println("casa de apostas depois de " + apostador1.nome + " :" + sorteio.conta);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("A conta de " + apostador2.nome + " antes do sorteio e de:" + apostador2.conta);
		sorteio.dado(50, apostador2);
		System.out.println("A conta de " + apostador2.nome + " depois do sorteio e de:" + apostador2.conta);
		System.out.println("valor em conta da casa de apostas depois do sorteio: " + sorteio.conta);
		System.out.println("casa de apostas depois de " + apostador2.nome + " " + sorteio.conta);


		
		
		
		
	}
}

		
	
	



