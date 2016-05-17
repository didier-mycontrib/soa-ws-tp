
package tp.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour calculerTva complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="calculerTva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="montantHt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tauxTva" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculerTva", propOrder = {
    "montantHt",
    "tauxTva"
})
public class CalculerTva {

    protected double montantHt;
    protected double tauxTva;

    /**
     * Obtient la valeur de la propriété montantHt.
     * 
     */
    public double getMontantHt() {
        return montantHt;
    }

    /**
     * Définit la valeur de la propriété montantHt.
     * 
     */
    public void setMontantHt(double value) {
        this.montantHt = value;
    }

    /**
     * Obtient la valeur de la propriété tauxTva.
     * 
     */
    public double getTauxTva() {
        return tauxTva;
    }

    /**
     * Définit la valeur de la propriété tauxTva.
     * 
     */
    public void setTauxTva(double value) {
        this.tauxTva = value;
    }

}
