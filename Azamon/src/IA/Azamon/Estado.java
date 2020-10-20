package IA.Azamon;

import java.util.*;

public class Estado {
	private static Paquetes p; // vector de paquets ( posem static perque tots els estats tindran el mateix vector p)
	private static Transporte t; // vector de ofertes ( posem static perque tots els estats tindran el mateix vector t)
	private double preu; // total del que costara el estat 
	private int felicitat; //felicitat del estat
	
	private ArrayList<Integer> assig; /* relació entre paquets i ofertes -> per assig[i] la i correspon al identificador del p paquet i la assig[i] es la oferta -> si la assig[i] = -1 significa que el paquet no esta assignat a cap oferta
	private ArrayList<Double>*/
	pes_oferta; // pes actual que te la oferta -> la i es la oferta i pes_oferta[i] es el pes d'aquesta oferta
	
	
	

}