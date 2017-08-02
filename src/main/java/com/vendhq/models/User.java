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
import com.vendhq.models.UserImages;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * User
 */

public class User {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("email_verified_at")
  private String emailVerifiedAt = null;

  @JsonProperty("restricted_outlet_id")
  private String restrictedOutletId = null;

  @JsonProperty("restricted_outlet_ids")
  private List<UUID> restrictedOutletIds = null;

  /**
   * User&#39;s account type.
   */
  public enum AccountTypeEnum {
    CASHIER("cashier"),
    
    MANAGER("manager"),
    
    ADMIN("admin");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccountTypeEnum fromValue(String text) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("account_type")
  private AccountTypeEnum accountType = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  @JsonProperty("deleted_at")
  private String deletedAt = null;

  @JsonProperty("seen_at")
  private String seenAt = null;

  @JsonProperty("target_daily")
  private BigDecimal targetDaily = null;

  @JsonProperty("target_weekly")
  private BigDecimal targetWeekly = null;

  @JsonProperty("target_monthly")
  private BigDecimal targetMonthly = null;

  @JsonProperty("version")
  private Long version = null;

  @JsonProperty("is_primary_user")
  private Boolean isPrimaryUser = null;

  @JsonProperty("image_source")
  private String imageSource = null;

  @JsonProperty("images")
  private UserImages images = null;

  public User id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Auto-generated object ID.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Auto-generated object ID.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public User username(String username) {
    this.username = username;
    return this;
  }

   /**
   * User&#39;s username used for login.
   * @return username
  **/
  @ApiModelProperty(required = true, value = "User's username used for login.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Full user&#39;s name to be used for display in the UI.
   * @return displayName
  **/
  @ApiModelProperty(value = "Full user's name to be used for display in the UI.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User&#39;s email address.
   * @return email
  **/
  @ApiModelProperty(value = "User's email address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User emailVerifiedAt(String emailVerifiedAt) {
    this.emailVerifiedAt = emailVerifiedAt;
    return this;
  }

   /**
   * The timestamp of users email verification.
   * @return emailVerifiedAt
  **/
  @ApiModelProperty(value = "The timestamp of users email verification.")
  public String getEmailVerifiedAt() {
    return emailVerifiedAt;
  }

  public void setEmailVerifiedAt(String emailVerifiedAt) {
    this.emailVerifiedAt = emailVerifiedAt;
  }

  public User restrictedOutletId(String restrictedOutletId) {
    this.restrictedOutletId = restrictedOutletId;
    return this;
  }

   /**
   * **deprecated** Use the &#x60;restricted_outlet_ids&#x60; instead.
   * @return restrictedOutletId
  **/
  @ApiModelProperty(value = "**deprecated** Use the `restricted_outlet_ids` instead.")
  public String getRestrictedOutletId() {
    return restrictedOutletId;
  }

  public void setRestrictedOutletId(String restrictedOutletId) {
    this.restrictedOutletId = restrictedOutletId;
  }

  public User restrictedOutletIds(List<UUID> restrictedOutletIds) {
    this.restrictedOutletIds = restrictedOutletIds;
    return this;
  }

  public User addRestrictedOutletIdsItem(UUID restrictedOutletIdsItem) {
    if (this.restrictedOutletIds == null) {
      this.restrictedOutletIds = new ArrayList<UUID>();
    }
    this.restrictedOutletIds.add(restrictedOutletIdsItem);
    return this;
  }

   /**
   * A list of outlet IDs the user is associated with
   * @return restrictedOutletIds
  **/
  @ApiModelProperty(value = "A list of outlet IDs the user is associated with")
  public List<UUID> getRestrictedOutletIds() {
    return restrictedOutletIds;
  }

  public void setRestrictedOutletIds(List<UUID> restrictedOutletIds) {
    this.restrictedOutletIds = restrictedOutletIds;
  }

  public User accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * User&#39;s account type.
   * @return accountType
  **/
  @ApiModelProperty(required = true, value = "User's account type.")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public User createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation timestamp in UTC.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "Creation timestamp in UTC.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public User updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Last update timestamp in UTC.
   * @return updatedAt
  **/
  @ApiModelProperty(required = true, value = "Last update timestamp in UTC.")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public User deletedAt(String deletedAt) {
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

  public User seenAt(String seenAt) {
    this.seenAt = seenAt;
    return this;
  }

   /**
   * The timestamp of the user&#39;s last activity in the system.
   * @return seenAt
  **/
  @ApiModelProperty(value = "The timestamp of the user's last activity in the system.")
  public String getSeenAt() {
    return seenAt;
  }

  public void setSeenAt(String seenAt) {
    this.seenAt = seenAt;
  }

  public User targetDaily(BigDecimal targetDaily) {
    this.targetDaily = targetDaily;
    return this;
  }

   /**
   * Daily sales target for the user.
   * @return targetDaily
  **/
  @ApiModelProperty(value = "Daily sales target for the user.")
  public BigDecimal getTargetDaily() {
    return targetDaily;
  }

  public void setTargetDaily(BigDecimal targetDaily) {
    this.targetDaily = targetDaily;
  }

  public User targetWeekly(BigDecimal targetWeekly) {
    this.targetWeekly = targetWeekly;
    return this;
  }

   /**
   * Weekly sales target for the user.
   * @return targetWeekly
  **/
  @ApiModelProperty(value = "Weekly sales target for the user.")
  public BigDecimal getTargetWeekly() {
    return targetWeekly;
  }

  public void setTargetWeekly(BigDecimal targetWeekly) {
    this.targetWeekly = targetWeekly;
  }

  public User targetMonthly(BigDecimal targetMonthly) {
    this.targetMonthly = targetMonthly;
    return this;
  }

   /**
   * Monthly sales target for the user.
   * @return targetMonthly
  **/
  @ApiModelProperty(value = "Monthly sales target for the user.")
  public BigDecimal getTargetMonthly() {
    return targetMonthly;
  }

  public void setTargetMonthly(BigDecimal targetMonthly) {
    this.targetMonthly = targetMonthly;
  }

  public User version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * Auto-incrementing object version number.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "Auto-incrementing object version number.")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public User isPrimaryUser(Boolean isPrimaryUser) {
    this.isPrimaryUser = isPrimaryUser;
    return this;
  }

   /**
   * Indicated whether this user is the primary user for the account.
   * @return isPrimaryUser
  **/
  @ApiModelProperty(required = true, value = "Indicated whether this user is the primary user for the account.")
  public Boolean isIsPrimaryUser() {
    return isPrimaryUser;
  }

  public void setIsPrimaryUser(Boolean isPrimaryUser) {
    this.isPrimaryUser = isPrimaryUser;
  }

  public User imageSource(String imageSource) {
    this.imageSource = imageSource;
    return this;
  }

   /**
   * URL of the default-sized user&#39;s avatar.
   * @return imageSource
  **/
  @ApiModelProperty(value = "URL of the default-sized user's avatar.")
  public String getImageSource() {
    return imageSource;
  }

  public void setImageSource(String imageSource) {
    this.imageSource = imageSource;
  }

  public User images(UserImages images) {
    this.images = images;
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @ApiModelProperty(value = "")
  public UserImages getImages() {
    return images;
  }

  public void setImages(UserImages images) {
    this.images = images;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.displayName, user.displayName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.emailVerifiedAt, user.emailVerifiedAt) &&
        Objects.equals(this.restrictedOutletId, user.restrictedOutletId) &&
        Objects.equals(this.restrictedOutletIds, user.restrictedOutletIds) &&
        Objects.equals(this.accountType, user.accountType) &&
        Objects.equals(this.createdAt, user.createdAt) &&
        Objects.equals(this.updatedAt, user.updatedAt) &&
        Objects.equals(this.deletedAt, user.deletedAt) &&
        Objects.equals(this.seenAt, user.seenAt) &&
        Objects.equals(this.targetDaily, user.targetDaily) &&
        Objects.equals(this.targetWeekly, user.targetWeekly) &&
        Objects.equals(this.targetMonthly, user.targetMonthly) &&
        Objects.equals(this.version, user.version) &&
        Objects.equals(this.isPrimaryUser, user.isPrimaryUser) &&
        Objects.equals(this.imageSource, user.imageSource) &&
        Objects.equals(this.images, user.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, displayName, email, emailVerifiedAt, restrictedOutletId, restrictedOutletIds, accountType, createdAt, updatedAt, deletedAt, seenAt, targetDaily, targetWeekly, targetMonthly, version, isPrimaryUser, imageSource, images);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailVerifiedAt: ").append(toIndentedString(emailVerifiedAt)).append("\n");
    sb.append("    restrictedOutletId: ").append(toIndentedString(restrictedOutletId)).append("\n");
    sb.append("    restrictedOutletIds: ").append(toIndentedString(restrictedOutletIds)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    seenAt: ").append(toIndentedString(seenAt)).append("\n");
    sb.append("    targetDaily: ").append(toIndentedString(targetDaily)).append("\n");
    sb.append("    targetWeekly: ").append(toIndentedString(targetWeekly)).append("\n");
    sb.append("    targetMonthly: ").append(toIndentedString(targetMonthly)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    isPrimaryUser: ").append(toIndentedString(isPrimaryUser)).append("\n");
    sb.append("    imageSource: ").append(toIndentedString(imageSource)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

