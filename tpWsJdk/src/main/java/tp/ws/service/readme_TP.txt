placer dans le package "tp.ws.service" une interface de web service "soap"
et une classe d'implémentation (avec les annotations adéquates @WebService , @WebParam , ...)
===
nom du service : "CalculateurFinancier"
====
méthodes que le web service doit idéalement offrir:

public double mensualiteConstante(double montant,int nbMois,double tauxMensPct);
public Tva calculerTva(double montantHt , double tauxTva /*EnPourcentage*/ );

code d'implémentation des méthodes:

return new Tva(montantHt , tauxTva); // sachant que ce constructeur calcule "tva" et "ttc"

et

public double mensualiteConstante(double montant, int nbMois,double tauxMensPct) {
		double mensualite = 0;
		double tauxMens = tauxMensPct / 100; 
		
		//formule mathematique:
		mensualite = montant * tauxMens / (1 - Math.pow(1.0 + tauxMens,-nbMois));
	
		return mensualite;
	}