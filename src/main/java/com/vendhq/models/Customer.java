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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Customer
 */

public class Customer {
  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("customer_code")
  private String customerCode = null;

  @JsonProperty("customer_group_id")
  private String customerGroupId = null;

  @JsonProperty("enable_loyalty")
  private Boolean enableLoyalty = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("date_of_birth")
  private String dateOfBirth = null;

  @JsonProperty("company_name")
  private String companyName = null;

  @JsonProperty("do_not_email")
  private Boolean doNotEmail = false;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("mobile")
  private String mobile = null;

  @JsonProperty("fax")
  private String fax = null;

  @JsonProperty("twitter")
  private String twitter = null;

  @JsonProperty("website")
  private String website = null;

  @JsonProperty("physical_address_1")
  private String physicalAddress1 = null;

  @JsonProperty("physical_address_2")
  private String physicalAddress2 = null;

  @JsonProperty("physical_suburb")
  private String physicalSuburb = null;

  @JsonProperty("physical_city")
  private String physicalCity = null;

  @JsonProperty("physical_postcode")
  private String physicalPostcode = null;

  @JsonProperty("physical_state")
  private String physicalState = null;

  @JsonProperty("physical_country_id")
  private String physicalCountryId = null;

  @JsonProperty("postal_address_1")
  private String postalAddress1 = null;

  @JsonProperty("postal_address_2")
  private String postalAddress2 = null;

  @JsonProperty("postal_suburb")
  private String postalSuburb = null;

  @JsonProperty("postal_city")
  private String postalCity = null;

  @JsonProperty("postal_postcode")
  private String postalPostcode = null;

  @JsonProperty("postal_state")
  private String postalState = null;

  @JsonProperty("postal_country_id")
  private String postalCountryId = null;

  @JsonProperty("custom_field_1")
  private String customField1 = null;

  @JsonProperty("custom_field_2")
  private String customField2 = null;

  @JsonProperty("custom_field_3")
  private String customField3 = null;

  @JsonProperty("custom_field_4")
  private String customField4 = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("year_to_date")
  private Double yearToDate = null;

  @JsonProperty("balance")
  private Double balance = null;

  @JsonProperty("loyalty_balance")
  private Double loyaltyBalance = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  @JsonProperty("deleted_at")
  private String deletedAt = null;

  @JsonProperty("version")
  private Double version = null;

  public Customer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Customer&#39;s first name.
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "Customer's first name.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Customer lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Customer &#39;s last name.
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "Customer 's last name.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Customer id(String id) {
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

  public Customer customerCode(String customerCode) {
    this.customerCode = customerCode;
    return this;
  }

   /**
   * Customer code used for claiming loyalty.
   * @return customerCode
  **/
  @ApiModelProperty(value = "Customer code used for claiming loyalty.")
  public String getCustomerCode() {
    return customerCode;
  }

  public void setCustomerCode(String customerCode) {
    this.customerCode = customerCode;
  }

  public Customer customerGroupId(String customerGroupId) {
    this.customerGroupId = customerGroupId;
    return this;
  }

   /**
   * Customer group ID.
   * @return customerGroupId
  **/
  @ApiModelProperty(value = "Customer group ID.")
  public String getCustomerGroupId() {
    return customerGroupId;
  }

  public void setCustomerGroupId(String customerGroupId) {
    this.customerGroupId = customerGroupId;
  }

  public Customer enableLoyalty(Boolean enableLoyalty) {
    this.enableLoyalty = enableLoyalty;
    return this;
  }

   /**
   * 
   * @return enableLoyalty
  **/
  @ApiModelProperty(value = "")
  public Boolean getEnableLoyalty() {
    return enableLoyalty;
  }

  public void setEnableLoyalty(Boolean enableLoyalty) {
    this.enableLoyalty = enableLoyalty;
  }

  public Customer email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Customer&#39;s email address.
   * @return email
  **/
  @ApiModelProperty(value = "Customer's email address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Customer note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Customer note.
   * @return note
  **/
  @ApiModelProperty(value = "Customer note.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Customer gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Customer&#39;s gender. Can be &#x60;M&#x60;, &#x60;F&#x60; or null.
   * @return gender
  **/
  @ApiModelProperty(value = "Customer's gender. Can be `M`, `F` or null.")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Customer dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Birthday.
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "Birthday.")
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Customer companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Company name.
   * @return companyName
  **/
  @ApiModelProperty(value = "Company name.")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Customer doNotEmail(Boolean doNotEmail) {
    this.doNotEmail = doNotEmail;
    return this;
  }

   /**
   * Indicates whether the customer opted out of email communications.
   * @return doNotEmail
  **/
  @ApiModelProperty(value = "Indicates whether the customer opted out of email communications.")
  public Boolean getDoNotEmail() {
    return doNotEmail;
  }

  public void setDoNotEmail(Boolean doNotEmail) {
    this.doNotEmail = doNotEmail;
  }

  public Customer phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone no.
   * @return phone
  **/
  @ApiModelProperty(value = "Phone no.")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Customer mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Mobile phone no.
   * @return mobile
  **/
  @ApiModelProperty(value = "Mobile phone no.")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public Customer fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Fax no.
   * @return fax
  **/
  @ApiModelProperty(value = "Fax no.")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public Customer twitter(String twitter) {
    this.twitter = twitter;
    return this;
  }

   /**
   * Twitter handle.
   * @return twitter
  **/
  @ApiModelProperty(value = "Twitter handle.")
  public String getTwitter() {
    return twitter;
  }

  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }

  public Customer website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Website URL.
   * @return website
  **/
  @ApiModelProperty(value = "Website URL.")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Customer physicalAddress1(String physicalAddress1) {
    this.physicalAddress1 = physicalAddress1;
    return this;
  }

   /**
   * Physical address, line 1.
   * @return physicalAddress1
  **/
  @ApiModelProperty(value = "Physical address, line 1.")
  public String getPhysicalAddress1() {
    return physicalAddress1;
  }

  public void setPhysicalAddress1(String physicalAddress1) {
    this.physicalAddress1 = physicalAddress1;
  }

  public Customer physicalAddress2(String physicalAddress2) {
    this.physicalAddress2 = physicalAddress2;
    return this;
  }

   /**
   * Physical address, line 2.
   * @return physicalAddress2
  **/
  @ApiModelProperty(value = "Physical address, line 2.")
  public String getPhysicalAddress2() {
    return physicalAddress2;
  }

  public void setPhysicalAddress2(String physicalAddress2) {
    this.physicalAddress2 = physicalAddress2;
  }

  public Customer physicalSuburb(String physicalSuburb) {
    this.physicalSuburb = physicalSuburb;
    return this;
  }

   /**
   * Physical address, suburb.
   * @return physicalSuburb
  **/
  @ApiModelProperty(value = "Physical address, suburb.")
  public String getPhysicalSuburb() {
    return physicalSuburb;
  }

  public void setPhysicalSuburb(String physicalSuburb) {
    this.physicalSuburb = physicalSuburb;
  }

  public Customer physicalCity(String physicalCity) {
    this.physicalCity = physicalCity;
    return this;
  }

   /**
   * Physical address, city.
   * @return physicalCity
  **/
  @ApiModelProperty(value = "Physical address, city.")
  public String getPhysicalCity() {
    return physicalCity;
  }

  public void setPhysicalCity(String physicalCity) {
    this.physicalCity = physicalCity;
  }

  public Customer physicalPostcode(String physicalPostcode) {
    this.physicalPostcode = physicalPostcode;
    return this;
  }

   /**
   * Physical address, post code.
   * @return physicalPostcode
  **/
  @ApiModelProperty(value = "Physical address, post code.")
  public String getPhysicalPostcode() {
    return physicalPostcode;
  }

  public void setPhysicalPostcode(String physicalPostcode) {
    this.physicalPostcode = physicalPostcode;
  }

  public Customer physicalState(String physicalState) {
    this.physicalState = physicalState;
    return this;
  }

   /**
   * Physical address, state.
   * @return physicalState
  **/
  @ApiModelProperty(value = "Physical address, state.")
  public String getPhysicalState() {
    return physicalState;
  }

  public void setPhysicalState(String physicalState) {
    this.physicalState = physicalState;
  }

  public Customer physicalCountryId(String physicalCountryId) {
    this.physicalCountryId = physicalCountryId;
    return this;
  }

   /**
   * Physical address, country code.
   * @return physicalCountryId
  **/
  @ApiModelProperty(value = "Physical address, country code.")
  public String getPhysicalCountryId() {
    return physicalCountryId;
  }

  public void setPhysicalCountryId(String physicalCountryId) {
    this.physicalCountryId = physicalCountryId;
  }

  public Customer postalAddress1(String postalAddress1) {
    this.postalAddress1 = postalAddress1;
    return this;
  }

   /**
   * Postal address, line 1.
   * @return postalAddress1
  **/
  @ApiModelProperty(value = "Postal address, line 1.")
  public String getPostalAddress1() {
    return postalAddress1;
  }

  public void setPostalAddress1(String postalAddress1) {
    this.postalAddress1 = postalAddress1;
  }

  public Customer postalAddress2(String postalAddress2) {
    this.postalAddress2 = postalAddress2;
    return this;
  }

   /**
   * Postal address, line 2.
   * @return postalAddress2
  **/
  @ApiModelProperty(value = "Postal address, line 2.")
  public String getPostalAddress2() {
    return postalAddress2;
  }

  public void setPostalAddress2(String postalAddress2) {
    this.postalAddress2 = postalAddress2;
  }

  public Customer postalSuburb(String postalSuburb) {
    this.postalSuburb = postalSuburb;
    return this;
  }

   /**
   * Postal address, suburb.
   * @return postalSuburb
  **/
  @ApiModelProperty(value = "Postal address, suburb.")
  public String getPostalSuburb() {
    return postalSuburb;
  }

  public void setPostalSuburb(String postalSuburb) {
    this.postalSuburb = postalSuburb;
  }

  public Customer postalCity(String postalCity) {
    this.postalCity = postalCity;
    return this;
  }

   /**
   * Postal address, city.
   * @return postalCity
  **/
  @ApiModelProperty(value = "Postal address, city.")
  public String getPostalCity() {
    return postalCity;
  }

  public void setPostalCity(String postalCity) {
    this.postalCity = postalCity;
  }

  public Customer postalPostcode(String postalPostcode) {
    this.postalPostcode = postalPostcode;
    return this;
  }

   /**
   * Postal address, post code.
   * @return postalPostcode
  **/
  @ApiModelProperty(value = "Postal address, post code.")
  public String getPostalPostcode() {
    return postalPostcode;
  }

  public void setPostalPostcode(String postalPostcode) {
    this.postalPostcode = postalPostcode;
  }

  public Customer postalState(String postalState) {
    this.postalState = postalState;
    return this;
  }

   /**
   * Postal address, state.
   * @return postalState
  **/
  @ApiModelProperty(value = "Postal address, state.")
  public String getPostalState() {
    return postalState;
  }

  public void setPostalState(String postalState) {
    this.postalState = postalState;
  }

  public Customer postalCountryId(String postalCountryId) {
    this.postalCountryId = postalCountryId;
    return this;
  }

   /**
   * Postal address, country code.
   * @return postalCountryId
  **/
  @ApiModelProperty(value = "Postal address, country code.")
  public String getPostalCountryId() {
    return postalCountryId;
  }

  public void setPostalCountryId(String postalCountryId) {
    this.postalCountryId = postalCountryId;
  }

  public Customer customField1(String customField1) {
    this.customField1 = customField1;
    return this;
  }

   /**
   * Custom field 1. Can be used to store random data.
   * @return customField1
  **/
  @ApiModelProperty(value = "Custom field 1. Can be used to store random data.")
  public String getCustomField1() {
    return customField1;
  }

  public void setCustomField1(String customField1) {
    this.customField1 = customField1;
  }

  public Customer customField2(String customField2) {
    this.customField2 = customField2;
    return this;
  }

   /**
   * Custom field 2.
   * @return customField2
  **/
  @ApiModelProperty(value = "Custom field 2.")
  public String getCustomField2() {
    return customField2;
  }

  public void setCustomField2(String customField2) {
    this.customField2 = customField2;
  }

  public Customer customField3(String customField3) {
    this.customField3 = customField3;
    return this;
  }

   /**
   * Custom field 3.
   * @return customField3
  **/
  @ApiModelProperty(value = "Custom field 3.")
  public String getCustomField3() {
    return customField3;
  }

  public void setCustomField3(String customField3) {
    this.customField3 = customField3;
  }

  public Customer customField4(String customField4) {
    this.customField4 = customField4;
    return this;
  }

   /**
   * Custom field 4.
   * @return customField4
  **/
  @ApiModelProperty(value = "Custom field 4.")
  public String getCustomField4() {
    return customField4;
  }

  public void setCustomField4(String customField4) {
    this.customField4 = customField4;
  }

  public Customer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Customers full name. **deprecated**
   * @return name
  **/
  @ApiModelProperty(value = "Customers full name. **deprecated**")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Customer yearToDate(Double yearToDate) {
    this.yearToDate = yearToDate;
    return this;
  }

   /**
   * Customer&#39;s spending this year.
   * @return yearToDate
  **/
  @ApiModelProperty(value = "Customer's spending this year.")
  public Double getYearToDate() {
    return yearToDate;
  }

  public void setYearToDate(Double yearToDate) {
    this.yearToDate = yearToDate;
  }

  public Customer balance(Double balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Customer&#39;s unpaid balance.
   * @return balance
  **/
  @ApiModelProperty(value = "Customer's unpaid balance.")
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public Customer loyaltyBalance(Double loyaltyBalance) {
    this.loyaltyBalance = loyaltyBalance;
    return this;
  }

   /**
   * Customer&#39;s loyalty balance.
   * @return loyaltyBalance
  **/
  @ApiModelProperty(value = "Customer's loyalty balance.")
  public Double getLoyaltyBalance() {
    return loyaltyBalance;
  }

  public void setLoyaltyBalance(Double loyaltyBalance) {
    this.loyaltyBalance = loyaltyBalance;
  }

  public Customer createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation timestamp in UTC.
   * @return createdAt
  **/
  @ApiModelProperty(value = "Creation timestamp in UTC.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Customer updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Last update timestamp in UTC.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "Last update timestamp in UTC.")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Customer deletedAt(String deletedAt) {
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

  public Customer version(Double version) {
    this.version = version;
    return this;
  }

   /**
   * Auto-incrementing object version number.
   * @return version
  **/
  @ApiModelProperty(value = "Auto-incrementing object version number.")
  public Double getVersion() {
    return version;
  }

  public void setVersion(Double version) {
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
    Customer customer = (Customer) o;
    return Objects.equals(this.firstName, customer.firstName) &&
        Objects.equals(this.lastName, customer.lastName) &&
        Objects.equals(this.id, customer.id) &&
        Objects.equals(this.customerCode, customer.customerCode) &&
        Objects.equals(this.customerGroupId, customer.customerGroupId) &&
        Objects.equals(this.enableLoyalty, customer.enableLoyalty) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.note, customer.note) &&
        Objects.equals(this.gender, customer.gender) &&
        Objects.equals(this.dateOfBirth, customer.dateOfBirth) &&
        Objects.equals(this.companyName, customer.companyName) &&
        Objects.equals(this.doNotEmail, customer.doNotEmail) &&
        Objects.equals(this.phone, customer.phone) &&
        Objects.equals(this.mobile, customer.mobile) &&
        Objects.equals(this.fax, customer.fax) &&
        Objects.equals(this.twitter, customer.twitter) &&
        Objects.equals(this.website, customer.website) &&
        Objects.equals(this.physicalAddress1, customer.physicalAddress1) &&
        Objects.equals(this.physicalAddress2, customer.physicalAddress2) &&
        Objects.equals(this.physicalSuburb, customer.physicalSuburb) &&
        Objects.equals(this.physicalCity, customer.physicalCity) &&
        Objects.equals(this.physicalPostcode, customer.physicalPostcode) &&
        Objects.equals(this.physicalState, customer.physicalState) &&
        Objects.equals(this.physicalCountryId, customer.physicalCountryId) &&
        Objects.equals(this.postalAddress1, customer.postalAddress1) &&
        Objects.equals(this.postalAddress2, customer.postalAddress2) &&
        Objects.equals(this.postalSuburb, customer.postalSuburb) &&
        Objects.equals(this.postalCity, customer.postalCity) &&
        Objects.equals(this.postalPostcode, customer.postalPostcode) &&
        Objects.equals(this.postalState, customer.postalState) &&
        Objects.equals(this.postalCountryId, customer.postalCountryId) &&
        Objects.equals(this.customField1, customer.customField1) &&
        Objects.equals(this.customField2, customer.customField2) &&
        Objects.equals(this.customField3, customer.customField3) &&
        Objects.equals(this.customField4, customer.customField4) &&
        Objects.equals(this.name, customer.name) &&
        Objects.equals(this.yearToDate, customer.yearToDate) &&
        Objects.equals(this.balance, customer.balance) &&
        Objects.equals(this.loyaltyBalance, customer.loyaltyBalance) &&
        Objects.equals(this.createdAt, customer.createdAt) &&
        Objects.equals(this.updatedAt, customer.updatedAt) &&
        Objects.equals(this.deletedAt, customer.deletedAt) &&
        Objects.equals(this.version, customer.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, id, customerCode, customerGroupId, enableLoyalty, email, note, gender, dateOfBirth, companyName, doNotEmail, phone, mobile, fax, twitter, website, physicalAddress1, physicalAddress2, physicalSuburb, physicalCity, physicalPostcode, physicalState, physicalCountryId, postalAddress1, postalAddress2, postalSuburb, postalCity, postalPostcode, postalState, postalCountryId, customField1, customField2, customField3, customField4, name, yearToDate, balance, loyaltyBalance, createdAt, updatedAt, deletedAt, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerCode: ").append(toIndentedString(customerCode)).append("\n");
    sb.append("    customerGroupId: ").append(toIndentedString(customerGroupId)).append("\n");
    sb.append("    enableLoyalty: ").append(toIndentedString(enableLoyalty)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    doNotEmail: ").append(toIndentedString(doNotEmail)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    physicalAddress1: ").append(toIndentedString(physicalAddress1)).append("\n");
    sb.append("    physicalAddress2: ").append(toIndentedString(physicalAddress2)).append("\n");
    sb.append("    physicalSuburb: ").append(toIndentedString(physicalSuburb)).append("\n");
    sb.append("    physicalCity: ").append(toIndentedString(physicalCity)).append("\n");
    sb.append("    physicalPostcode: ").append(toIndentedString(physicalPostcode)).append("\n");
    sb.append("    physicalState: ").append(toIndentedString(physicalState)).append("\n");
    sb.append("    physicalCountryId: ").append(toIndentedString(physicalCountryId)).append("\n");
    sb.append("    postalAddress1: ").append(toIndentedString(postalAddress1)).append("\n");
    sb.append("    postalAddress2: ").append(toIndentedString(postalAddress2)).append("\n");
    sb.append("    postalSuburb: ").append(toIndentedString(postalSuburb)).append("\n");
    sb.append("    postalCity: ").append(toIndentedString(postalCity)).append("\n");
    sb.append("    postalPostcode: ").append(toIndentedString(postalPostcode)).append("\n");
    sb.append("    postalState: ").append(toIndentedString(postalState)).append("\n");
    sb.append("    postalCountryId: ").append(toIndentedString(postalCountryId)).append("\n");
    sb.append("    customField1: ").append(toIndentedString(customField1)).append("\n");
    sb.append("    customField2: ").append(toIndentedString(customField2)).append("\n");
    sb.append("    customField3: ").append(toIndentedString(customField3)).append("\n");
    sb.append("    customField4: ").append(toIndentedString(customField4)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    yearToDate: ").append(toIndentedString(yearToDate)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    loyaltyBalance: ").append(toIndentedString(loyaltyBalance)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

