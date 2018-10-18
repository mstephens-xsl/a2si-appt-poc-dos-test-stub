
package https.nww_pathwaysdos_nhs_uk.app.api.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for TimeOfDay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeOfDay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hours" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="minutes" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeOfDay", propOrder = {
    "hours",
    "minutes"
})
public class TimeOfDay {

    protected short hours;
    protected short minutes;

    /**
     * Gets the value of the hours property.
     * 
     */
    public short getHours() {
        return hours;
    }

    /**
     * Sets the value of the hours property.
     * 
     */
    public void setHours(short value) {
        this.hours = value;
    }

    /**
     * Gets the value of the minutes property.
     * 
     */
    public short getMinutes() {
        return minutes;
    }

    /**
     * Sets the value of the minutes property.
     * 
     */
    public void setMinutes(short value) {
        this.minutes = value;
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
