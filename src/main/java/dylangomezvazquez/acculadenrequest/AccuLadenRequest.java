
package dylangomezvazquez.acculadenrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vermogen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Duur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="procent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vermogen",
    "duur",
    "procent"
})
@XmlRootElement(name = "AccuLadenRequest")
public class AccuLadenRequest {

    @XmlElement(name = "Vermogen")
    protected int vermogen;
    @XmlElement(name = "Duur")
    protected int duur;
    protected int procent;
    /**
     * Gets the value of the vermogen property.
     * 
     */
    public int getVermogen() {
        return vermogen;
    }

    /**
     * Sets the value of the vermogen property.
     * 
     */
    public void setVermogen(int value) {
        this.vermogen = value;
    }

    /**
     * Gets the value of the duur property.
     * 
     */
    public int getDuur() {
        return duur;
    }

    /**
     * Sets the value of the duur property.
     * 
     */
    public void setDuur(int value) {
        this.duur = value;
    }

    /**
     * Gets the value of the procent property.
     * 
     */
    public int getProcent() {
        return procent;
    }

    /**
     * Sets the value of the procent property.
     * 
     */
    public void setProcent(int value) {
        this.procent = value;
    }

}
