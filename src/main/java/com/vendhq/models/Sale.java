/*
 * API 2.0
 * Early release of version 2.0 of the Vend API.
 *
 * OpenAPI spec version: 2.0
 * Contact: api@vendhq.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.vendhq.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.vendhq.models.LineItem;
import com.vendhq.models.Payment;
import com.vendhq.models.SaleTax;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Sale
 */

public class Sale {
  @JsonProperty("outlet_id")
  private String outletId = null;

  @JsonProperty("return_for")
  private String returnFor = null;

  @JsonProperty("total_price")
  private Double totalPrice = null;

  @JsonProperty("total_tax")
  private Double totalTax = null;

  @JsonProperty("deleted_at")
  private String deletedAt = null;

  @JsonProperty("version")
  private Long version = null;

  @JsonProperty("taxes")
  private List<SaleTax> taxes = null;

  @JsonProperty("register_id")
  private String registerId = null;

  @JsonProperty("user_id")
  private String userId = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("line_items")
  private List<LineItem> lineItems = null;

  @JsonProperty("payments")
  private List<Payment> payments = null;

  @JsonProperty("customer_id")
  private String customerId = null;

  @JsonProperty("invoice_number")
  private String invoiceNumber = null;

  @JsonProperty("invoice_sequence")
  private Double invoiceSequence = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("short_code")
  private String shortCode = null;

  @JsonProperty("sale_date")
  private String saleDate = null;

  public Sale outletId(String outletId) {
    this.outletId = outletId;
    return this;
  }

   /**
   * Valid outlet ID for the retailer.
   * @return outletId
  **/
  @ApiModelProperty(value = "Valid outlet ID for the retailer.")
  public String getOutletId() {
    return outletId;
  }

  public void setOutletId(String outletId) {
    this.outletId = outletId;
  }

  public Sale returnFor(String returnFor) {
    this.returnFor = returnFor;
    return this;
  }

   /**
   * Reference ID to a different sale if this sale was created as a return.
   * @return returnFor
  **/
  @ApiModelProperty(value = "Reference ID to a different sale if this sale was created as a return.")
  public String getReturnFor() {
    return returnFor;
  }

  public void setReturnFor(String returnFor) {
    this.returnFor = returnFor;
  }

  public Sale totalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Sale total.
   * @return totalPrice
  **/
  @ApiModelProperty(value = "Sale total.")
  public Double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Double totalPrice) {
    this.totalPrice = totalPrice;
  }

  public Sale totalTax(Double totalTax) {
    this.totalTax = totalTax;
    return this;
  }

   /**
   * Tax total.
   * @return totalTax
  **/
  @ApiModelProperty(value = "Tax total.")
  public Double getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }

  public Sale deletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Deletion timestamp in UTC.
   * @return deletedAt
  **/
  @ApiModelProperty(value = "Deletion timestamp in UTC.")
  public String getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }

  public Sale version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * Auto-incrementing object version number.
   * @return version
  **/
  @ApiModelProperty(value = "Auto-incrementing object version number.")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public Sale taxes(List<SaleTax> taxes) {
    this.taxes = taxes;
    return this;
  }

  public Sale addTaxesItem(SaleTax taxesItem) {
    if (this.taxes == null) {
      this.taxes = new ArrayList<SaleTax>();
    }
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * Collection of taxes.
   * @return taxes
  **/
  @ApiModelProperty(value = "Collection of taxes.")
  public List<SaleTax> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<SaleTax> taxes) {
    this.taxes = taxes;
  }

  public Sale registerId(String registerId) {
    this.registerId = registerId;
    return this;
  }

   /**
   * Valid register ID for the retailer.
   * @return registerId
  **/
  @ApiModelProperty(value = "Valid register ID for the retailer.")
  public String getRegisterId() {
    return registerId;
  }

  public void setRegisterId(String registerId) {
    this.registerId = registerId;
  }

  public Sale userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Valid user ID for the retailer.
   * @return userId
  **/
  @ApiModelProperty(value = "Valid user ID for the retailer.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Sale status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Sale status. One of: CLOSED, SAVED, ONACCOUNT, ONACCOUNT_CLOSED, LAYBY, LAYBY_CLOSED. VOIDED ???
   * @return status
  **/
  @ApiModelProperty(value = "Sale status. One of: CLOSED, SAVED, ONACCOUNT, ONACCOUNT_CLOSED, LAYBY, LAYBY_CLOSED. VOIDED ???")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Sale lineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Sale addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<LineItem>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * A collection of line items.
   * @return lineItems
  **/
  @ApiModelProperty(value = "A collection of line items.")
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public Sale payments(List<Payment> payments) {
    this.payments = payments;
    return this;
  }

  public Sale addPaymentsItem(Payment paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<Payment>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * Collection of payments.
   * @return payments
  **/
  @ApiModelProperty(value = "Collection of payments.")
  public List<Payment> getPayments() {
    return payments;
  }

  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }

  public Sale customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Valid customer ID for the retailer.
   * @return customerId
  **/
  @ApiModelProperty(value = "Valid customer ID for the retailer.")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Sale invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice number which if provided, should use the prefix and suffix defined for the register.
   * @return invoiceNumber
  **/
  @ApiModelProperty(value = "Invoice number which if provided, should use the prefix and suffix defined for the register.")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public Sale invoiceSequence(Double invoiceSequence) {
    this.invoiceSequence = invoiceSequence;
    return this;
  }

   /**
   * Optionally provided value.
   * @return invoiceSequence
  **/
  @ApiModelProperty(value = "Optionally provided value.")
  public Double getInvoiceSequence() {
    return invoiceSequence;
  }

  public void setInvoiceSequence(Double invoiceSequence) {
    this.invoiceSequence = invoiceSequence;
  }

  public Sale note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Sale Note.
   * @return note
  **/
  @ApiModelProperty(value = "Sale Note.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Sale shortCode(String shortCode) {
    this.shortCode = shortCode;
    return this;
  }

   /**
   * 6 character code used in the loyalty system. ???
   * @return shortCode
  **/
  @ApiModelProperty(value = "6 character code used in the loyalty system. ???")
  public String getShortCode() {
    return shortCode;
  }

  public void setShortCode(String shortCode) {
    this.shortCode = shortCode;
  }

  public Sale saleDate(String saleDate) {
    this.saleDate = saleDate;
    return this;
  }

   /**
   * Sale timestamp in UTC.
   * @return saleDate
  **/
  @ApiModelProperty(value = "Sale timestamp in UTC.")
  public String getSaleDate() {
    return saleDate;
  }

  public void setSaleDate(String saleDate) {
    this.saleDate = saleDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sale sale = (Sale) o;
    return Objects.equals(this.outletId, sale.outletId) &&
        Objects.equals(this.returnFor, sale.returnFor) &&
        Objects.equals(this.totalPrice, sale.totalPrice) &&
        Objects.equals(this.totalTax, sale.totalTax) &&
        Objects.equals(this.deletedAt, sale.deletedAt) &&
        Objects.equals(this.version, sale.version) &&
        Objects.equals(this.taxes, sale.taxes) &&
        Objects.equals(this.registerId, sale.registerId) &&
        Objects.equals(this.userId, sale.userId) &&
        Objects.equals(this.status, sale.status) &&
        Objects.equals(this.lineItems, sale.lineItems) &&
        Objects.equals(this.payments, sale.payments) &&
        Objects.equals(this.customerId, sale.customerId) &&
        Objects.equals(this.invoiceNumber, sale.invoiceNumber) &&
        Objects.equals(this.invoiceSequence, sale.invoiceSequence) &&
        Objects.equals(this.note, sale.note) &&
        Objects.equals(this.shortCode, sale.shortCode) &&
        Objects.equals(this.saleDate, sale.saleDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outletId, returnFor, totalPrice, totalTax, deletedAt, version, taxes, registerId, userId, status, lineItems, payments, customerId, invoiceNumber, invoiceSequence, note, shortCode, saleDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sale {\n");
    
    sb.append("    outletId: ").append(toIndentedString(outletId)).append("\n");
    sb.append("    returnFor: ").append(toIndentedString(returnFor)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    registerId: ").append(toIndentedString(registerId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    invoiceSequence: ").append(toIndentedString(invoiceSequence)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    shortCode: ").append(toIndentedString(shortCode)).append("\n");
    sb.append("    saleDate: ").append(toIndentedString(saleDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

