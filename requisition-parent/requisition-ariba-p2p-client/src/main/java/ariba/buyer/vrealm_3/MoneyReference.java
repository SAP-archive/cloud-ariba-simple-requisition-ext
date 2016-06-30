
package ariba.buyer.vrealm_3;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Name null, type ariba.basic.core.Money, variant vrealm_3.
 * 
 * <p>Java class for Money_Reference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Money_Reference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AmountInReportingCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ApproxAmountInBaseCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ConversionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Currency" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="UniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Money_Reference", propOrder = {

})
@XmlSeeAlso({
    ariba.buyer.vrealm_3.RequisitionRequisitionImportPull.LineItems.Item.Custom.CustomMoney.class,
    ariba.buyer.vrealm_3.RequisitionRequisitionImportPull.Custom.CustomMoney.class,
    ariba.buyer.vrealm_3.RequisitionRequisitionIdExport.Custom.CustomMoney.class
})
public class MoneyReference {

    @XmlElementRef(name = "Amount", namespace = "urn:Ariba:Buyer:vrealm_3", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> amount;
    @XmlElementRef(name = "AmountInReportingCurrency", namespace = "urn:Ariba:Buyer:vrealm_3", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> amountInReportingCurrency;
    @XmlElementRef(name = "ApproxAmountInBaseCurrency", namespace = "urn:Ariba:Buyer:vrealm_3", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> approxAmountInBaseCurrency;
    @XmlElementRef(name = "ConversionDate", namespace = "urn:Ariba:Buyer:vrealm_3", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> conversionDate;
    @XmlElement(name = "Currency")
    protected MoneyReference.Currency currency;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAmount(JAXBElement<BigDecimal> value) {
        this.amount = value;
    }

    /**
     * Gets the value of the amountInReportingCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAmountInReportingCurrency() {
        return amountInReportingCurrency;
    }

    /**
     * Sets the value of the amountInReportingCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAmountInReportingCurrency(JAXBElement<BigDecimal> value) {
        this.amountInReportingCurrency = value;
    }

    /**
     * Gets the value of the approxAmountInBaseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getApproxAmountInBaseCurrency() {
        return approxAmountInBaseCurrency;
    }

    /**
     * Sets the value of the approxAmountInBaseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setApproxAmountInBaseCurrency(JAXBElement<BigDecimal> value) {
        this.approxAmountInBaseCurrency = value;
    }

    /**
     * Gets the value of the conversionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getConversionDate() {
        return conversionDate;
    }

    /**
     * Sets the value of the conversionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setConversionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.conversionDate = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyReference.Currency }
     *     
     */
    public MoneyReference.Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyReference.Currency }
     *     
     */
    public void setCurrency(MoneyReference.Currency value) {
        this.currency = value;
    }


    /**
     * Class name ariba.basic.core.Currency, group name Reference, variant vrealm_3.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="UniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Currency {

        @XmlElementRef(name = "UniqueName", namespace = "urn:Ariba:Buyer:vrealm_3", type = JAXBElement.class, required = false)
        protected JAXBElement<String> uniqueName;

        /**
         * Gets the value of the uniqueName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getUniqueName() {
            return uniqueName;
        }

        /**
         * Sets the value of the uniqueName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setUniqueName(JAXBElement<String> value) {
            this.uniqueName = value;
        }

    }

}
