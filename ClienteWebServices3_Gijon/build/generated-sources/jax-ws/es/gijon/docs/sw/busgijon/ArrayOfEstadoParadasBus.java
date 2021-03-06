
package es.gijon.docs.sw.busgijon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfEstadoParadasBus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEstadoParadasBus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parada" type="{http://docs.gijon.es/sw/busgijon.asmx}EstadoParadasBus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEstadoParadasBus", propOrder = {
    "parada"
})
public class ArrayOfEstadoParadasBus {

    @XmlElement(nillable = true)
    protected List<EstadoParadasBus> parada;

    /**
     * Gets the value of the parada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParada().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstadoParadasBus }
     * 
     * 
     */
    public List<EstadoParadasBus> getParada() {
        if (parada == null) {
            parada = new ArrayList<EstadoParadasBus>();
        }
        return this.parada;
    }

}
