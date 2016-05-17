package tp.ws.serv.app;

import javax.xml.ws.Endpoint;

import tp.ws.service.CalculateurFinancierImpl;



public class MyWsSimpleServer {

	public static void main(String[] args) {
		// 1. instancier la classe d'implementation du web service soap (via new)
		CalculateurFinancierImpl calculateurFinancierImpl = new CalculateurFinancierImpl();
		// 2 . choisir l'URL qui sera associée au "endpoint" du service web:
		String wsSoapUrl = "http://localhost:8282/calculateurFinancier";
		
		// 3. publier le service web pour qu'il soit accessible au bout de l'URL:
		// en appelant la méthode statique javax.xml.ws.Endpoint.publish(url,impl);
		Endpoint.publish(wsSoapUrl, calculateurFinancierImpl);
		
		System.out.println("MyWsSimpleServer is ready , waiting for soap request at endpoint " + wsSoapUrl);
		// faire une pause de quelques minutes:
		try {
			Thread.sleep( 5 * 60 * 1000); //ms
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// arrêter l'ensemble du serveur:
		System.out.println("MyWsSimpleServer  stop");
		System.exit(0); // sans cet appel , un thread en tâche de fond tourne éternellement
		
	}

}
