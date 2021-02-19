package me.fabio.lutadores;

public class Esteriotipos {

	public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        		   
        l[0] = new Lutador("Baguete", "França", 89, 2.5f, 89.0f, 11, 11, 11);
        l[1] = new Lutador("Kangaro", "Austrália", 35, 1.2f, 59.8f, 45, 2, 0);
        l[2] = new Lutador("Crime", "Brasil", 25, 1.8f, 75.1f, 1, 25, 11);
        l[3] = new Lutador("Alá", "Sergipe", 26, 1.9f, 64.0f, 0, 0, 0);
        l[4] = new Lutador("MCDonald's", "Estados Unidos", 18, 2.3f, 158.5f, 15, 1, 1);
        l[5] = new Lutador("Yeti", "Himalaia", 26, 2.9f, 89.0f, 11, 17, 25);
           	
        Luta luta = new Luta();
        luta.marcarLuta(l[5], l[3]);
        luta.lutar();
        
	}
}
