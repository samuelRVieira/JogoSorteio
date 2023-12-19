import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

class Apostadores{
	String nome;
	double conta;
}

class CasaDeApostas{
	String titular;
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
		Apostadores samuel = new Apostadores();
		Apostadores diogo = new Apostadores();
		diogo.nome = "Diogo Cesar Bif";
		diogo.conta = 100;
		samuel.nome = "Samuel Rocha Vieira";
		samuel.conta = 200;
		System.out.println("valor em conta da casa de apostas antes do sorteio: " + sorteio.conta);
		System.out.println("A conta de " + samuel.nome + " antes do sorteio e de:" + samuel.conta);
		sorteio.dado(50, samuel);
		System.out.println("A conta de " + samuel.nome + " depois do sorteio e de:" + samuel.conta);
		System.out.println("casa de apostas depois de samuel: " + sorteio.conta);
		
		System.out.println("A conta de " + diogo.nome + " antes do sorteio e de:" + diogo.conta);
		sorteio.dado(50, diogo);
		System.out.println("A conta de " + diogo.nome + " depois do sorteio e de:" + diogo.conta);
		System.out.println("valor em conta da casa de apostas depois do sorteio: " + sorteio.conta);
		System.out.println("casa de apostas depois de samuel: " + sorteio.conta);


		
		
		
		
	}
}

		
	
	



