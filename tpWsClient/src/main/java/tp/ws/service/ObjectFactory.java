
package tp.ws.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tp.ws.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalculerTvaResponse_QNAME = new QName("http://service.ws.tp/", "calculerTvaResponse");
    private final static QName _CalculerTva_QNAME = new QName("http://service.ws.tp/", "calculerTva");
    private final static QName _MensualiteConstante_QNAME = new QName("http://service.ws.tp/", "mensualiteConstante");
    private final static QName _MensualiteConstanteResponse_QNAME = new QName("http://service.ws.tp/", "mensualiteConstanteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tp.ws.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculerTvaResponse }
     * 
     */
    public CalculerTvaResponse createCalculerTvaResponse() {
        return new CalculerTvaResponse();
    }

    /**
     * Create an instance of {@link CalculerTva }
     * 
     */
    public CalculerTva createCalculerTva() {
        return new CalculerTva();
    }

    /**
     * Create an instance of {@link MensualiteConstante }
     * 
     */
    public MensualiteConstante createMensualiteConstante() {
        return new MensualiteConstante();
    }

    /**
     * Create an instance of {@link MensualiteConstanteResponse }
     * 
     */
    public MensualiteConstanteResponse createMensualiteConstanteResponse() {
        return new MensualiteConstanteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculerTvaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.tp/", name = "calculerTvaResponse")
    public JAXBElement<CalculerTvaResponse> createCalculerTvaResponse(CalculerTvaResponse value) {
        return new JAXBElement<CalculerTvaResponse>(_CalculerTvaResponse_QNAME, CalculerTvaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculerTva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.tp/", name = "calculerTva")
    public JAXBElement<CalculerTva> createCalculerTva(CalculerTva value) {
        return new JAXBElement<CalculerTva>(_CalculerTva_QNAME, CalculerTva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensualiteConstante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.tp/", name = "mensualiteConstante")
    public JAXBElement<MensualiteConstante> createMensualiteConstante(MensualiteConstante value) {
        return new JAXBElement<MensualiteConstante>(_MensualiteConstante_QNAME, MensualiteConstante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensualiteConstanteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.tp/", name = "mensualiteConstanteResponse")
    public JAXBElement<MensualiteConstanteResponse> createMensualiteConstanteResponse(MensualiteConstanteResponse value) {
        return new JAXBElement<MensualiteConstanteResponse>(_MensualiteConstanteResponse_QNAME, MensualiteConstanteResponse.class, null, value);
    }

}
