package me.fabio.lutadores;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private String categoria;
	private float altura;
	private float peso;
	private int idade;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}
	
	public void apresentar() {
		System.out.println("--------------------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Nacionalidade: " + this.getNacionalidade());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Altura: " + this.getAltura() + "m");
		System.out.println("Peso: " + this.getPeso() + "Kg");
		System.out.println("Com " + this.getVitorias() + " vitórias, " + this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates.");
	}
	
	public void status() {
          System.out.println("--------------------------");
		  System.out.println(this.getNome() + " é um peso " + this.getCategoria());
          System.out.println("Ganhou " + this.getVitorias() + " vezes");
          System.out.println("Perdeu " + this.getDerrotas() + " vezes");
          System.out.println("Empatou " + this.getEmpates() + " vezes");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	public void setNome(String no) {
		this.nome = no;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNacionalidade(String na) {
		this.nacionalidade = na;
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public void setAltura(float al) {
		this.altura = al;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	public void setPeso(float pe) {
		this.peso = pe;
		this.setCategoria();
	}
	
	public float getPeso() {
		return this.peso;
	}
	
	public void setCategoria() {
		if (this.peso<52.2) {
			this.categoria = "Inválido";
		} else if (this.peso<=70.3) {
			this.categoria = "Leve";
		} else if (this.peso<=83.9) {
			this.categoria = "Médio";
		} else if (this.peso<=120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Gordo bagarai";
		}
	}	
	public void setIdade(int id) {
		this.idade = id;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setVitorias(int vi) {
		this.vitorias = vi;
	}
	
	public int getVitorias() {
		return this.vitorias;
	}
	
	public void setDerrotas(int de) {
		this.derrotas = de;
	}
	
	public int getDerrotas() {
		return this.derrotas;
	}
	
	public void setEmpates(int em) {
		this.empates = em;
	}
	
	public int getEmpates() {
		return this.empates;
	}
}
