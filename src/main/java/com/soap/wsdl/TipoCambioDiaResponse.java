//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.02.21 a las 06:23:51 PM CST 
//


package com.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoCambioDiaResult" type="{http://www.banguat.gob.gt/variables/ws/}InfoVariable" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tipoCambioDiaResult"
})
@XmlRootElement(name = "TipoCambioDiaResponse")
public class TipoCambioDiaResponse {

    @XmlElement(name = "TipoCambioDiaResult")
    protected InfoVariable tipoCambioDiaResult;

    /**
     * Obtiene el valor de la propiedad tipoCambioDiaResult.
     * 
     * @return
     *     possible object is
     *     {@link InfoVariable }
     *     
     */
    public InfoVariable getTipoCambioDiaResult() {
        return tipoCambioDiaResult;
    }

    /**
     * Define el valor de la propiedad tipoCambioDiaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoVariable }
     *     
     */
    public void setTipoCambioDiaResult(InfoVariable value) {
        this.tipoCambioDiaResult = value;
    }

}