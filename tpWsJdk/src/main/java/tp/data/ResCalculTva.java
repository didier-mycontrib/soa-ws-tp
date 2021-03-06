package tp.data;

import javax.xml.bind.annotation.XmlType;

//Tva = structure de données (valeur de retour de la méthode 
// calculerTva() du web service "calculateurFinancier")

//à faire en TP: ajouter si besoin l'annotation @XmlType(namespace="...")
//de façon à bien contrôler le namespace xml associée à la structure de donnée "Tva" dans la
//description WSDL (ou la sous partie XSD) qui sera générée

@XmlType(namespace="http://data.tp/")
public class ResCalculTva {
	
	
	private double ht;
	private double taux; // en % (ex:  10.0 , 20.0 ,  ...)
	private double tva;
	private double ttc;
	
	
	
	public ResCalculTva() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public ResCalculTva(double ht, double taux) {
		super();
		this.taux = taux;
		this.ht = ht;
		this.tva  = ht * taux /100.0 ;
		this.ttc = ht + tva;
	}


	@Override
	public String toString() {
		return "Tva [taux=" + taux + ", ht=" + ht + ", tva=" + tva + ", ttc="
				+ ttc + "]";
	}
	
	
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public double getHt() {
		return ht;
	}
	public void setHt(double ht) {
		this.ht = ht;
	}
	public double getTva() {
		return tva;
	}
	public void setTva(double tva) {
		this.tva = tva;
	}
	public double getTtc() {
		return ttc;
	}
	public void setTtc(double ttc) {
		this.ttc = ttc;
	}
	
	

}
