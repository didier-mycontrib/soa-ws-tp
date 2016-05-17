package tp.ws.service;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import tp.data.ResCalculTva;

@WebService
//@SOAPBinding(style=Style.RPC , use=Use.LITERAL)
//@SOAPBinding(style=Style.DOCUMENT , use=Use.LITERAL)
public interface CalculateurFinancier {

	public double mensualiteConstante(@WebParam(name="montant") double montant,
			                         @WebParam(name="nbMois")int nbMois,
			                         @WebParam(name="tauxMensPct") double tauxMensPct);
	public ResCalculTva calculerTva(@WebParam(name="montantHt") double montantHt , 
			               @WebParam(name="tauxTva") double tauxTva /*EnPourcentage*/ );
	
}
