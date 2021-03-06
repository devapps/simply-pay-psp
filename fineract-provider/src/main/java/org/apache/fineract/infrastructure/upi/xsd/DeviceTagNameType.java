//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.10 at 11:53:53 AM IST 
//


package org.apache.fineract.infrastructure.upi.xsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deviceTagNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="deviceTagNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="GEOCODE"/>
 *     &lt;enumeration value="LOCATION"/>
 *     &lt;enumeration value="IP"/>
 *     &lt;enumeration value="TYPE"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="OS"/>
 *     &lt;enumeration value="APP"/>
 *     &lt;enumeration value="CAPABILITY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "deviceTagNameType")
@XmlEnum
public enum DeviceTagNameType {

    MOBILE,
    GEOCODE,
    LOCATION,
    IP,
    TYPE,
    ID,
    OS,
    APP,
    CAPABILITY;

    public String value() {
        return name();
    }

    public static DeviceTagNameType fromValue(String v) {
        return valueOf(v);
    }

}
