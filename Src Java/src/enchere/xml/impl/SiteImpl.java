//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.16 at 02:26:29 PM CET 
//


package enchere.xml.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import enchere.xml.EnchereType;
import enchere.xml.Site;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "enchere"
})
@XmlRootElement(name = "Site")
public class SiteImpl
    implements Site
{

    @XmlElement(name = "Enchere", required = true, type = EnchereTypeImpl.class)
    protected List<EnchereType> enchere;

    public List<EnchereType> getEnchere() {
        if (enchere == null) {
            enchere = new ArrayList<EnchereType>();
        }
        return this.enchere;
    }

}
