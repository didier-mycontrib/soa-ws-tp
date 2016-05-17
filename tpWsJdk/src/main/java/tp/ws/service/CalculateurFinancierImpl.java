package tp.ws.service;

import javax.jws.WebService;

import tp.data.ResCalculTva;

@WebService(endpointInterface="tp.ws.service.CalculateurFinancier")
public class CalculateurFinancierImpl implements CalculateurFinancier {

	@Override
	public double mensualiteConstante(double montant, int nbMois,double tauxMensPct) {
			double mensualite = 0;
	double tauxMens = tauxMensPct / 100; 
	
	//formule mathematique:
	mensualite = montant * tauxMens / (1 - Math.pow(1.0 + tauxMens,-nbMois));

	return mensualite;
	}

	@Override
	public ResCalculTva calculerTva(double montantHt, double tauxTva) {
		return new ResCalculTva(montantHt , tauxTva);
	}

}
