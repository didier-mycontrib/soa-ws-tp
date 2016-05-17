Le code suivant ne fonctionne correctement qu'avec certaines librairies (.jar) de CXF:

public static CalculateurFinancier initWsProxy(String soapUrl){
		
		//NB: les informations SERVICE_NAME et PORT_NAME se trouvent dans le fichier WSDL qui décrit le service web
		//et elles sont sencées être stables
		QName SERVICE_NAME = new QName("http://...../", ".......Service");
		QName PORT_NAME = new QName("http://...../", ".....Port");
		Service service = Service.create(SERVICE_NAME);		//javax.xml.ws.Service
		
		// Add a port to the Service , javax.xml.ws.soap.SOAPBinding
		service.addPort(PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING,soapUrl);

		//NB: l'interface java "Calculateur" doit absolument comporter les annotations @WebService (et @WebParam)
		// celle ci peut être récupérer par copie de code (depuis le projet serveur s'il est en java)
		// ou bien peut être initialement générée via wsimport et le fichier WSDL
		CalculateurFinancier calcProxy = (CalculateurFinancier) service.getPort(PORT_NAME, CalculateurFinancier.class);
		return calcProxy;
}