
package es.gijon.docs.sw.busgijon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EstadoParadaSalidaBus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EstadoParadaSalidaBus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salida" type="{http://docs.gijon.es/sw/busgijon.asmx}AutobusSalidaBus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstadoParadaSalidaBus", propOrder = {
    "salida"
})
public class EstadoParadaSalidaBus {

    protected List<AutobusSalidaBus> salida;

    /**
     * Gets the value of the salida property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salida property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalida().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutobusSalidaBus }
     * 
     * 
     */
    public List<AutobusSalidaBus> getSalida() {
        if (salida == null) {
            salida = new ArrayList<AutobusSalidaBus>();
        }
        return this.salida;
    }

}
