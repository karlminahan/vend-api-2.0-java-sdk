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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Register
 */

public class Register {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("outlet_id")
  private String outletId = null;

  @JsonProperty("ask_for_note_on_save")
  private Double askForNoteOnSave = null;

  @JsonProperty("print_note_on_receipt")
  private Boolean printNoteOnReceipt = null;

  @JsonProperty("ask_for_user_on_sale")
  private Boolean askForUserOnSale = null;

  @JsonProperty("show_discounts_on_receipts")
  private Boolean showDiscountsOnReceipts = null;

  @JsonProperty("print_receipt")
  private Boolean printReceipt = null;

  @JsonProperty("email_receipt")
  private Boolean emailReceipt = null;

  @JsonProperty("invoice_prefix")
  private String invoicePrefix = null;

  @JsonProperty("invoice_suffix")
  private String invoiceSuffix = null;

  @JsonProperty("invoice_sequence")
  private Double invoiceSequence = null;

  @JsonProperty("button_layout_id")
  private String buttonLayoutId = null;

  @JsonProperty("is_open")
  private Boolean isOpen = null;

  @JsonProperty("register_open_time")
  private String registerOpenTime = null;

  @JsonProperty("register_close_time")
  private String registerCloseTime = null;

  @JsonProperty("register_open_sequence_id")
  private String registerOpenSequenceId = null;

  @JsonProperty("cash_managed_payment_type_id")
  private String cashManagedPaymentTypeId = null;

  @JsonProperty("deleted_at")
  private String deletedAt = null;

  @JsonProperty("version")
  private Long version = null;

  public Register id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Auto-generated object ID.
   * @return id
  **/
  @ApiModelProperty(value = "Auto-generated object ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Register name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The Register name.
   * @return name
  **/
  @ApiModelProperty(value = "The Register name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Register outletId(String outletId) {
    this.outletId = outletId;
    return this;
  }

   /**
   * A valid ID of an Outlet that this register is associated with.
   * @return outletId
  **/
  @ApiModelProperty(value = "A valid ID of an Outlet that this register is associated with.")
  public String getOutletId() {
    return outletId;
  }

  public void setOutletId(String outletId) {
    this.outletId = outletId;
  }

  public Register askForNoteOnSave(Double askForNoteOnSave) {
    this.askForNoteOnSave = askForNoteOnSave;
    return this;
  }

   /**
   * &#x60;0&#x60; for **Never**, &#x60;1&#x60; for **On Save/Layby/Account/Return**, &#x60;2&#x60; for **Always**.
   * @return askForNoteOnSave
  **/
  @ApiModelProperty(value = "`0` for **Never**, `1` for **On Save/Layby/Account/Return**, `2` for **Always**.")
  public Double getAskForNoteOnSave() {
    return askForNoteOnSave;
  }

  public void setAskForNoteOnSave(Double askForNoteOnSave) {
    this.askForNoteOnSave = askForNoteOnSave;
  }

  public Register printNoteOnReceipt(Boolean printNoteOnReceipt) {
    this.printNoteOnReceipt = printNoteOnReceipt;
    return this;
  }

   /**
   * 
   * @return printNoteOnReceipt
  **/
  @ApiModelProperty(value = "")
  public Boolean isPrintNoteOnReceipt() {
    return printNoteOnReceipt;
  }

  public void setPrintNoteOnReceipt(Boolean printNoteOnReceipt) {
    this.printNoteOnReceipt = printNoteOnReceipt;
  }

  public Register askForUserOnSale(Boolean askForUserOnSale) {
    this.askForUserOnSale = askForUserOnSale;
    return this;
  }

   /**
   * 
   * @return askForUserOnSale
  **/
  @ApiModelProperty(value = "")
  public Boolean isAskForUserOnSale() {
    return askForUserOnSale;
  }

  public void setAskForUserOnSale(Boolean askForUserOnSale) {
    this.askForUserOnSale = askForUserOnSale;
  }

  public Register showDiscountsOnReceipts(Boolean showDiscountsOnReceipts) {
    this.showDiscountsOnReceipts = showDiscountsOnReceipts;
    return this;
  }

   /**
   * 
   * @return showDiscountsOnReceipts
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowDiscountsOnReceipts() {
    return showDiscountsOnReceipts;
  }

  public void setShowDiscountsOnReceipts(Boolean showDiscountsOnReceipts) {
    this.showDiscountsOnReceipts = showDiscountsOnReceipts;
  }

  public Register printReceipt(Boolean printReceipt) {
    this.printReceipt = printReceipt;
    return this;
  }

   /**
   * Indicates whether a receipt should be printed after a sale.
   * @return printReceipt
  **/
  @ApiModelProperty(value = "Indicates whether a receipt should be printed after a sale.")
  public Boolean isPrintReceipt() {
    return printReceipt;
  }

  public void setPrintReceipt(Boolean printReceipt) {
    this.printReceipt = printReceipt;
  }

  public Register emailReceipt(Boolean emailReceipt) {
    this.emailReceipt = emailReceipt;
    return this;
  }

   /**
   * Indicates whether a receipt should be emailed after a sale.
   * @return emailReceipt
  **/
  @ApiModelProperty(value = "Indicates whether a receipt should be emailed after a sale.")
  public Boolean isEmailReceipt() {
    return emailReceipt;
  }

  public void setEmailReceipt(Boolean emailReceipt) {
    this.emailReceipt = emailReceipt;
  }

  public Register invoicePrefix(String invoicePrefix) {
    this.invoicePrefix = invoicePrefix;
    return this;
  }

   /**
   * Invoice number prefix.
   * @return invoicePrefix
  **/
  @ApiModelProperty(value = "Invoice number prefix.")
  public String getInvoicePrefix() {
    return invoicePrefix;
  }

  public void setInvoicePrefix(String invoicePrefix) {
    this.invoicePrefix = invoicePrefix;
  }

  public Register invoiceSuffix(String invoiceSuffix) {
    this.invoiceSuffix = invoiceSuffix;
    return this;
  }

   /**
   * Invoice number suffix.
   * @return invoiceSuffix
  **/
  @ApiModelProperty(value = "Invoice number suffix.")
  public String getInvoiceSuffix() {
    return invoiceSuffix;
  }

  public void setInvoiceSuffix(String invoiceSuffix) {
    this.invoiceSuffix = invoiceSuffix;
  }

  public Register invoiceSequence(Double invoiceSequence) {
    this.invoiceSequence = invoiceSequence;
    return this;
  }

   /**
   * The numeric part of the last issued invoice.
   * @return invoiceSequence
  **/
  @ApiModelProperty(value = "The numeric part of the last issued invoice.")
  public Double getInvoiceSequence() {
    return invoiceSequence;
  }

  public void setInvoiceSequence(Double invoiceSequence) {
    this.invoiceSequence = invoiceSequence;
  }

  public Register buttonLayoutId(String buttonLayoutId) {
    this.buttonLayoutId = buttonLayoutId;
    return this;
  }

   /**
   * Register ID.
   * @return buttonLayoutId
  **/
  @ApiModelProperty(value = "Register ID.")
  public String getButtonLayoutId() {
    return buttonLayoutId;
  }

  public void setButtonLayoutId(String buttonLayoutId) {
    this.buttonLayoutId = buttonLayoutId;
  }

  public Register isOpen(Boolean isOpen) {
    this.isOpen = isOpen;
    return this;
  }

   /**
   * Indicates if the Register is currently open.
   * @return isOpen
  **/
  @ApiModelProperty(value = "Indicates if the Register is currently open.")
  public Boolean isIsOpen() {
    return isOpen;
  }

  public void setIsOpen(Boolean isOpen) {
    this.isOpen = isOpen;
  }

  public Register registerOpenTime(String registerOpenTime) {
    this.registerOpenTime = registerOpenTime;
    return this;
  }

   /**
   * Date/time when the register was open. Always in UTC.
   * @return registerOpenTime
  **/
  @ApiModelProperty(value = "Date/time when the register was open. Always in UTC.")
  public String getRegisterOpenTime() {
    return registerOpenTime;
  }

  public void setRegisterOpenTime(String registerOpenTime) {
    this.registerOpenTime = registerOpenTime;
  }

  public Register registerCloseTime(String registerCloseTime) {
    this.registerCloseTime = registerCloseTime;
    return this;
  }

   /**
   * Date/time when the register was closed. Null if currently open.
   * @return registerCloseTime
  **/
  @ApiModelProperty(value = "Date/time when the register was closed. Null if currently open.")
  public String getRegisterCloseTime() {
    return registerCloseTime;
  }

  public void setRegisterCloseTime(String registerCloseTime) {
    this.registerCloseTime = registerCloseTime;
  }

  public Register registerOpenSequenceId(String registerOpenSequenceId) {
    this.registerOpenSequenceId = registerOpenSequenceId;
    return this;
  }

   /**
   * **internal** The ID of the current register closure object.
   * @return registerOpenSequenceId
  **/
  @ApiModelProperty(value = "**internal** The ID of the current register closure object.")
  public String getRegisterOpenSequenceId() {
    return registerOpenSequenceId;
  }

  public void setRegisterOpenSequenceId(String registerOpenSequenceId) {
    this.registerOpenSequenceId = registerOpenSequenceId;
  }

  public Register cashManagedPaymentTypeId(String cashManagedPaymentTypeId) {
    this.cashManagedPaymentTypeId = cashManagedPaymentTypeId;
    return this;
  }

   /**
   * **internal** The ID of the payment type used for cash management transactions in this regsiter.
   * @return cashManagedPaymentTypeId
  **/
  @ApiModelProperty(value = "**internal** The ID of the payment type used for cash management transactions in this regsiter.")
  public String getCashManagedPaymentTypeId() {
    return cashManagedPaymentTypeId;
  }

  public void setCashManagedPaymentTypeId(String cashManagedPaymentTypeId) {
    this.cashManagedPaymentTypeId = cashManagedPaymentTypeId;
  }

  public Register deletedAt(String deletedAt) {
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

  public Register version(Long version) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Register register = (Register) o;
    return Objects.equals(this.id, register.id) &&
        Objects.equals(this.name, register.name) &&
        Objects.equals(this.outletId, register.outletId) &&
        Objects.equals(this.askForNoteOnSave, register.askForNoteOnSave) &&
        Objects.equals(this.printNoteOnReceipt, register.printNoteOnReceipt) &&
        Objects.equals(this.askForUserOnSale, register.askForUserOnSale) &&
        Objects.equals(this.showDiscountsOnReceipts, register.showDiscountsOnReceipts) &&
        Objects.equals(this.printReceipt, register.printReceipt) &&
        Objects.equals(this.emailReceipt, register.emailReceipt) &&
        Objects.equals(this.invoicePrefix, register.invoicePrefix) &&
        Objects.equals(this.invoiceSuffix, register.invoiceSuffix) &&
        Objects.equals(this.invoiceSequence, register.invoiceSequence) &&
        Objects.equals(this.buttonLayoutId, register.buttonLayoutId) &&
        Objects.equals(this.isOpen, register.isOpen) &&
        Objects.equals(this.registerOpenTime, register.registerOpenTime) &&
        Objects.equals(this.registerCloseTime, register.registerCloseTime) &&
        Objects.equals(this.registerOpenSequenceId, register.registerOpenSequenceId) &&
        Objects.equals(this.cashManagedPaymentTypeId, register.cashManagedPaymentTypeId) &&
        Objects.equals(this.deletedAt, register.deletedAt) &&
        Objects.equals(this.version, register.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, outletId, askForNoteOnSave, printNoteOnReceipt, askForUserOnSale, showDiscountsOnReceipts, printReceipt, emailReceipt, invoicePrefix, invoiceSuffix, invoiceSequence, buttonLayoutId, isOpen, registerOpenTime, registerCloseTime, registerOpenSequenceId, cashManagedPaymentTypeId, deletedAt, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Register {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outletId: ").append(toIndentedString(outletId)).append("\n");
    sb.append("    askForNoteOnSave: ").append(toIndentedString(askForNoteOnSave)).append("\n");
    sb.append("    printNoteOnReceipt: ").append(toIndentedString(printNoteOnReceipt)).append("\n");
    sb.append("    askForUserOnSale: ").append(toIndentedString(askForUserOnSale)).append("\n");
    sb.append("    showDiscountsOnReceipts: ").append(toIndentedString(showDiscountsOnReceipts)).append("\n");
    sb.append("    printReceipt: ").append(toIndentedString(printReceipt)).append("\n");
    sb.append("    emailReceipt: ").append(toIndentedString(emailReceipt)).append("\n");
    sb.append("    invoicePrefix: ").append(toIndentedString(invoicePrefix)).append("\n");
    sb.append("    invoiceSuffix: ").append(toIndentedString(invoiceSuffix)).append("\n");
    sb.append("    invoiceSequence: ").append(toIndentedString(invoiceSequence)).append("\n");
    sb.append("    buttonLayoutId: ").append(toIndentedString(buttonLayoutId)).append("\n");
    sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
    sb.append("    registerOpenTime: ").append(toIndentedString(registerOpenTime)).append("\n");
    sb.append("    registerCloseTime: ").append(toIndentedString(registerCloseTime)).append("\n");
    sb.append("    registerOpenSequenceId: ").append(toIndentedString(registerOpenSequenceId)).append("\n");
    sb.append("    cashManagedPaymentTypeId: ").append(toIndentedString(cashManagedPaymentTypeId)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

