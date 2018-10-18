
package https.nww_pathwaysdos_nhs_uk.app.api.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for ServiceCareItemRotaSession complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCareItemRotaSession"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startDayOfWeek" type="{https://nww.pathwaysdos.nhs.uk/app/api/webservices}DayOfWeek"/&gt;
 *         &lt;element name="startTime" type="{https://nww.pathwaysdos.nhs.uk/app/api/webservices}TimeOfDay" minOccurs="0"/&gt;
 *         &lt;element name="endDayOfWeek" type="{https://nww.pathwaysdos.nhs.uk/app/api/webservices}DayOfWeek"/&gt;
 *         &lt;element name="endTime" type="{https://nww.pathwaysdos.nhs.uk/app/api/webservices}TimeOfDay" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCareItemRotaSession", propOrder = {
    "startDayOfWeek",
    "startTime",
    "endDayOfWeek",
    "endTime",
    "status"
})
public class ServiceCareItemRotaSession {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DayOfWeek startDayOfWeek;
    protected TimeOfDay startTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DayOfWeek endDayOfWeek;
    protected TimeOfDay endTime;
    protected String status;

    /**
     * Gets the value of the startDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeek }
     *     
     */
    public DayOfWeek getStartDayOfWeek() {
        return startDayOfWeek;
    }

    /**
     * Sets the value of the startDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeek }
     *     
     */
    public void setStartDayOfWeek(DayOfWeek value) {
        this.startDayOfWeek = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeOfDay }
     *     
     */
    public TimeOfDay getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeOfDay }
     *     
     */
    public void setStartTime(TimeOfDay value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeek }
     *     
     */
    public DayOfWeek getEndDayOfWeek() {
        return endDayOfWeek;
    }

    /**
     * Sets the value of the endDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeek }
     *     
     */
    public void setEndDayOfWeek(DayOfWeek value) {
        this.endDayOfWeek = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeOfDay }
     *     
     */
    public TimeOfDay getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeOfDay }
     *     
     */
    public void setEndTime(TimeOfDay value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
