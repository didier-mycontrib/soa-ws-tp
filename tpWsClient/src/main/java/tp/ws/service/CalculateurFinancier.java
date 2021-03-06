
package tp.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import tp.data.ResCalculTva;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculateurFinancier", targetNamespace = "http://service.ws.tp/")
@XmlSeeAlso({
    tp.data.ObjectFactory.class,
    tp.ws.service.ObjectFactory.class
})
public interface CalculateurFinancier {


    /**
     * 
     * @param tauxMensPct
     * @param montant
     * @param nbMois
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mensualiteConstante", targetNamespace = "http://service.ws.tp/", className = "tp.ws.service.MensualiteConstante")
    @ResponseWrapper(localName = "mensualiteConstanteResponse", targetNamespace = "http://service.ws.tp/", className = "tp.ws.service.MensualiteConstanteResponse")
    @Action(input = "http://service.ws.tp/CalculateurFinancier/mensualiteConstanteRequest", output = "http://service.ws.tp/CalculateurFinancier/mensualiteConstanteResponse")
    public double mensualiteConstante(
        @WebParam(name = "montant", targetNamespace = "")
        double montant,
        @WebParam(name = "nbMois", targetNamespace = "")
        int nbMois,
        @WebParam(name = "tauxMensPct", targetNamespace = "")
        double tauxMensPct);

    /**
     * 
     * @param montantHt
     * @param tauxTva
     * @return
     *     returns tp.data.ResCalculTva
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calculerTva", targetNamespace = "http://service.ws.tp/", className = "tp.ws.service.CalculerTva")
    @ResponseWrapper(localName = "calculerTvaResponse", targetNamespace = "http://service.ws.tp/", className = "tp.ws.service.CalculerTvaResponse")
    @Action(input = "http://service.ws.tp/CalculateurFinancier/calculerTvaRequest", output = "http://service.ws.tp/CalculateurFinancier/calculerTvaResponse")
    public ResCalculTva calculerTva(
        @WebParam(name = "montantHt", targetNamespace = "")
        double montantHt,
        @WebParam(name = "tauxTva", targetNamespace = "")
        double tauxTva);

}
