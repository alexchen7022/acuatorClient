//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2021.03.19 於 01:14:33 AM CST 
//


package com.acuator.test.client.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>response complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vmnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vendorCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isSpecialLabel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="labelCategoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="labelCategoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response", propOrder = {
    "vmn",
    "vmnId",
    "vendorCd",
    "isSpecialLabel",
    "labelCategoryId",
    "labelCategoryDescription"
})
public class Response {

    protected String vmn;
    protected String vmnId;
    protected String vendorCd;
    protected boolean isSpecialLabel;
    protected String labelCategoryId;
    protected String labelCategoryDescription;

    /**
     * 取得 vmn 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmn() {
        return vmn;
    }

    /**
     * 設定 vmn 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmn(String value) {
        this.vmn = value;
    }

    /**
     * 取得 vmnId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmnId() {
        return vmnId;
    }

    /**
     * 設定 vmnId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmnId(String value) {
        this.vmnId = value;
    }

    /**
     * 取得 vendorCd 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCd() {
        return vendorCd;
    }

    /**
     * 設定 vendorCd 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCd(String value) {
        this.vendorCd = value;
    }

    /**
     * 取得 isSpecialLabel 特性的值.
     * 
     */
    public boolean isIsSpecialLabel() {
        return isSpecialLabel;
    }

    /**
     * 設定 isSpecialLabel 特性的值.
     * 
     */
    public void setIsSpecialLabel(boolean value) {
        this.isSpecialLabel = value;
    }

    /**
     * 取得 labelCategoryId 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelCategoryId() {
        return labelCategoryId;
    }

    /**
     * 設定 labelCategoryId 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelCategoryId(String value) {
        this.labelCategoryId = value;
    }

    /**
     * 取得 labelCategoryDescription 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelCategoryDescription() {
        return labelCategoryDescription;
    }

    /**
     * 設定 labelCategoryDescription 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelCategoryDescription(String value) {
        this.labelCategoryDescription = value;
    }

}
