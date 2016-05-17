package tp.client.app;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import tp.client.util.MyPropertiesUtil;
import tp.data.ResCalculTva;
import tp.ws.service.CalculateurFinancier;

public class MyClientApp {
	
public static CalculateurFinancier initWsProxy(String soapUrl){
		
		//NB: les informations SERVICE_NAME et PORT_NAME se trouvent dans le fichier WSDL qui décrit le service web
		//et elles sont sencées être stables
		QName SERVICE_NAME = new QName("http://service.ws.tp/", "CalculateurFinancierImplService");
		QName PORT_NAME = new QName("http://service.ws.tp/", "CalculateurFinancierImplPort");
		Service service = Service.create(SERVICE_NAME);		//javax.xml.ws.Service
		
		// Add a port to the Service , javax.xml.ws.soap.SOAPBinding
		service.addPort(PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING,soapUrl);

		//NB: l'interface java "Calculateur" doit absolument comporter les annotations @WebService (et @WebParam)
		// celle ci peut être récupérer par copie de code (depuis le projet serveur s'il est en java)
		// ou bien peut être initialement générée via wsimport et le fichier WSDL
		CalculateurFinancier calcProxy = (CalculateurFinancier) service.getPort(PORT_NAME, CalculateurFinancier.class);
		return calcProxy;
}

	public static void main(String[] args) {
		//récupérer l'URL SOAP paramétrable dans le fichier wsUrl.properties:
		try {
			java.util.Properties props = MyPropertiesUtil.loadProperties("wsUrl.properties");
			//String wsdlUrlAsString = props.getProperty("wsdl.url");
			String soapUrlAsString = props.getProperty("soap.url");
			
        //initialiser le proxy WS de manière dynamique en ne s'appuyant que sur l'interface java
		//du service SOAP à appeler.
		CalculateurFinancier calculateurFinancier = 	initWsProxy(soapUrlAsString);
			
		//appeler les méthodes du services et afficher les résultats sur la console (sortie standard):
		
		ResCalculTva resCalculTva = calculateurFinancier.calculerTva(200.0, 20.0);
		System.out.println("Pour ht=" + resCalculTva.getHt() + " et un taux=" + resCalculTva.getTaux());
		System.out.println("tva=" + resCalculTva.getTva() + " ttc=" + resCalculTva.getTtc());
		
		double mensualite = calculateurFinancier.mensualiteConstante(1000.0, 24, 5.0 / 12);
		System.out.println("Pour rembourser un montant emprunte de 1000 euros sur 24 mois ");
		System.out.println("à un taux d'interet de 5% par an , les mensualites sont de " + mensualite );
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
