package me.fabio.lutadores;

import java.util.Random;

public class Luta {

	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
			this.setAprovado(true);
			desafiado = l1;
			desafiante = l2;
		} else {
			this.setAprovado(false);
			desafiado = null;
			desafiante = null;
		}
	}
	
	public void lutar() {
		if (this.aprovada) {
		System.out.println("#-#-# Desafiado #-#-#");
		this.desafiado.apresentar();
		System.out.println("#-#-# Desafiante #-#-#");
		this.desafiante.apresentar();
		
		Random r = new Random();
				
		int vencedor = r.nextInt(3);
		
			switch (vencedor) {
			case 0:
				System.out.println("Empate!");
				desafiado.empatarLuta();
				desafiante.empatarLuta();
				break;
			case 1:
				System.out.println("Desafiante Ganhou!");
				desafiado.perderLuta();
				desafiante.ganharLuta();
				break;
			case 2:
		    	System.out.println("Desafiado Ganhou!");
			    desafiado.ganharLuta();
			    desafiante.perderLuta();
			    break;
			}
	    } else {
			System.out.println("A luta não pode acontecer.");
	    }
	}
	
	/*
	 * Getters e Setters
	 */
	
	public void setDesafiado(Lutador dd) {
		this.desafiado = dd;
	}
	
	public Lutador getDesafiado() {
		return this.desafiado;
	}
	
	public void setDesafiante(Lutador df) {
	    this.desafiante = df;
	}
     
	public Lutador getDesafiante() {
		return this.desafiante;
	}
	
	public void setRounds(int r) {
		this.rounds = r;
	}
	
	public int getRounds() {
		return this.rounds;
	}
	
	public void setAprovado(boolean ap) {
		this.aprovada = ap;
	}
	
	public boolean isAprovado() {
		return this.aprovada;
	}
}
