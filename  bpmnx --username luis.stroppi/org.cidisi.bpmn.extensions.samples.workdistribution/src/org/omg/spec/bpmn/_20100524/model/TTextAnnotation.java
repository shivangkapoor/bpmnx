//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.01 at 09:36:15 AM ART 
//


package org.omg.spec.bpmn._20100524.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tTextAnnotation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tTextAnnotation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tArtifact">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}text" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="textFormat" type="{http://www.w3.org/2001/XMLSchema}string" default="text/plain" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTextAnnotation", propOrder = {
    "text"
})
public class TTextAnnotation
    extends TArtifact
{

    protected TText text;
    @XmlAttribute
    protected String textFormat;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link TText }
     *     
     */
    public TText getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link TText }
     *     
     */
    public void setText(TText value) {
        this.text = value;
    }

    /**
     * Gets the value of the textFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextFormat() {
        if (textFormat == null) {
            return "text/plain";
        } else {
            return textFormat;
        }
    }

    /**
     * Sets the value of the textFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextFormat(String value) {
        this.textFormat = value;
    }

}
