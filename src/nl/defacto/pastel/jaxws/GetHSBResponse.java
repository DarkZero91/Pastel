
package nl.defacto.pastel.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getHSBResponse", namespace = "http://pastel.defacto.nl/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHSBResponse", namespace = "http://pastel.defacto.nl/")
public class GetHSBResponse {

    @XmlElement(name = "return", namespace = "", nillable = true)
    private float[] _return;

    /**
     * 
     * @return
     *     returns float[]
     */
    public float[] getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(float[] _return) {
        this._return = _return;
    }

}
