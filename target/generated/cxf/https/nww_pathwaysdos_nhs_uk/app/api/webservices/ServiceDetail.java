
package https.nww_pathwaysdos_nhs_uk.app.api.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for ServiceDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="odsCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contactDetails" type="{https://nww.pathwaysdos.nhs.uk/app/api/webservices}ArrayOfContactDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDetail", propOrder = {
    "id",
    "odsCode",
    "contactDetails"
})
public class ServiceDetail {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String odsCode;
    protected ArrayOfContactDetails contactDetails;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the odsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdsCode() {
        return odsCode;
    }

    /**
     * Sets the value of the odsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdsCode(String value) {
        this.odsCode = value;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactDetails }
     *     
     */
    public ArrayOfContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactDetails }
     *     
     */
    public void setContactDetails(ArrayOfContactDetails value) {
        this.contactDetails = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
