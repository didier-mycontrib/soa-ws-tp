
package tp.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour mensualiteConstante complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="mensualiteConstante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nbMois" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tauxMensPct" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mensualiteConstante", propOrder = {
    "montant",
    "nbMois",
    "tauxMensPct"
})
public class MensualiteConstante {

    protected double montant;
    protected int nbMois;
    protected double tauxMensPct;

    /**
     * Obtient la valeur de la propri�t� montant.
     * 
     */
    public double getMontant() {
        return montant;
    }

    /**
     * D�finit la valeur de la propri�t� montant.
     * 
     */
    public void setMontant(double value) {
        this.montant = value;
    }

    /**
     * Obtient la valeur de la propri�t� nbMois.
     * 
     */
    public int getNbMois() {
        return nbMois;
    }

    /**
     * D�finit la valeur de la propri�t� nbMois.
     * 
     */
    public void setNbMois(int value) {
        this.nbMois = value;
    }

    /**
     * Obtient la valeur de la propri�t� tauxMensPct.
     * 
     */
    public double getTauxMensPct() {
        return tauxMensPct;
    }

    /**
     * D�finit la valeur de la propri�t� tauxMensPct.
     * 
     */
    public void setTauxMensPct(double value) {
        this.tauxMensPct = value;
    }

}
