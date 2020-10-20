package IA.Azamon;

import java.util.*;

public class Estado {
	static Paquetes p; // vector de paquets ( posem static perque tots els estats tindran el mateix vector p)
	static Transporte t; // vector de ofertes ( posem static perque tots els estats tindran el mateix vector t)
	private double preu_envio;// total del que costaran els envios
	private double preu_emmagatzemar; // total que costara el emmagatzematge
	private int felicitat; //felicitat del estat
	
	private ArrayList<Integer> assig; // relaci� entre paquets i ofertes -> per assig[i] la i correspon al identificador del p
									  //paquet i la assig[i] es la oferta -> si la assig[i] = -1 significa que el paquet no esta assignat a cap oferta
	private ArrayList<Double> pes_oferta;  // pes actual que te la oferta -> la i es la oferta i pes_oferta[i] es el pes d'aquesta oferta

	public void Estado() {
		
	}
	
	

	public Estado(int npaq,int seed, double proporcio ) { //Constructora
		p = new Paquetes(npaq,seed);
		t = new Transporte(p, proporcio, seed);
		felicitat = 0;
		preu_envio = 0;
		preu_emmagatzemar = 0;
		assig = new ArrayList<Integer>(npaq);
		for(int i = 0; i < npaq; ++i) {
			assig.add(-1);
		}
		pes_oferta = new ArrayList<Double>(t.size());
		for(int i = 0; i < t.size(); ++i) {
			pes_oferta.add(0.0);
		}
	} 
	
	
	public void Estado(Estado est) { //Clonadora
		p = est.p;
		t = est.t;
		preu_envio = est.getPreuEnvio();
		preu_emmagatzemar = est.getPreuMagatzem();
		felicitat = est.getFelicitat();
		
		 assig = new ArrayList<Integer>(est.assig);
		 pes_oferta= new ArrayList<Double>(est.pes_oferta);
		
	} 
	
	public int getFelicitat() {
		return felicitat;
	}
	
	public double getPreuEnvio() {
		return preu_envio;
	}
	public double getPreuMagatzem() {
		return preu_emmagatzemar;
	}
	public double getPreuTotal() {
		return (preu_envio + preu_emmagatzemar);
	}
	
	public int getOfertaPaq(int x) {
		return assig.get(x);
	}
	
	public double getPes(int paq) {
		return p.get(paq).getPeso();
	}
	
	public double getPesOferta(int x) {
		return pes_oferta.get(x);
	}
	
}
	
		
