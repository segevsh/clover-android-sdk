/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2019 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.apps;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getApp app}</li>
 * <li>{@link #getLocale locale}</li>
 * <li>{@link #getName name}</li>
 * <li>{@link #getDescription description}</li>
 * <li>{@link #getTagline tagline}</li>
 * <li>{@link #getBenefits benefits}</li>
 * <li>{@link #getVideoUrl videoUrl}</li>
 * <li>{@link #getFilenameIcon filenameIcon}</li>
 * <li>{@link #getFilenameIconSmall filenameIconSmall}</li>
 * <li>{@link #getFilenameIconLarge filenameIconLarge}</li>
 * <li>{@link #getFilenameCover filenameCover}</li>
 * <li>{@link #getFilenameBanner filenameBanner}</li>
 * <li>{@link #getPrivacyPolicy privacyPolicy}</li>
 * <li>{@link #getEula eula}</li>
 * <li>{@link #getSupportPhone supportPhone}</li>
 * <li>{@link #getSupportPhoneHours supportPhoneHours}</li>
 * <li>{@link #getSupportEmail supportEmail}</li>
 * <li>{@link #getSupportUrl supportUrl}</li>
 * <li>{@link #getSmartReceiptText smartReceiptText}</li>
 * <li>{@link #getSmartReceiptUrl smartReceiptUrl}</li>
 * <li>{@link #getLinkLabel linkLabel}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class AppLocale extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * Reference to app this developer_app_locale belongs to
   */
  public com.clover.sdk.v3.base.Reference getApp() {
    return genClient.cacheGet(CacheKey.app);
  }

  /**
   * Java Locale format. Examples: en_US, de_DE, en_CA, fr_CA
   */
  public java.lang.String getLocale() {
    return genClient.cacheGet(CacheKey.locale);
  }

  /**
   * Name of the app
   */
  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }

  /**
   * App Description
   */
  public java.lang.String getDescription() {
    return genClient.cacheGet(CacheKey.description);
  }

  /**
   * Short tagline for the app
   */
  public java.lang.String getTagline() {
    return genClient.cacheGet(CacheKey.tagline);
  }

  /**
   * Brief description about benefits of app
   */
  public java.util.List<java.lang.String> getBenefits() {
    return genClient.cacheGet(CacheKey.benefits);
  }

  /**
   * URL for embedded video
   */
  public java.lang.String getVideoUrl() {
    return genClient.cacheGet(CacheKey.videoUrl);
  }

  public java.lang.String getFilenameIcon() {
    return genClient.cacheGet(CacheKey.filenameIcon);
  }

  /**
   * URL to the icon of the app. Generated from filenameIcon.
   */
  public java.lang.String getFilenameIconSmall() {
    return genClient.cacheGet(CacheKey.filenameIconSmall);
  }

  /**
   * URL to the icon of the app. Generated from filenameIcon.
   */
  public java.lang.String getFilenameIconLarge() {
    return genClient.cacheGet(CacheKey.filenameIconLarge);
  }

  /**
   * URL to the cover images of the app. To be displayed on app market details page.
   */
  public java.lang.String getFilenameCover() {
    return genClient.cacheGet(CacheKey.filenameCover);
  }

  /**
   * URL to the hero images of the app. To be displayed on app market home page.
   */
  public java.lang.String getFilenameBanner() {
    return genClient.cacheGet(CacheKey.filenameBanner);
  }

  public java.lang.String getPrivacyPolicy() {
    return genClient.cacheGet(CacheKey.privacyPolicy);
  }

  public java.lang.String getEula() {
    return genClient.cacheGet(CacheKey.eula);
  }

  public java.lang.String getSupportPhone() {
    return genClient.cacheGet(CacheKey.supportPhone);
  }

  public java.lang.String getSupportPhoneHours() {
    return genClient.cacheGet(CacheKey.supportPhoneHours);
  }

  public java.lang.String getSupportEmail() {
    return genClient.cacheGet(CacheKey.supportEmail);
  }

  public java.lang.String getSupportUrl() {
    return genClient.cacheGet(CacheKey.supportUrl);
  }

  /**
   * Text will print on printed receipts for this app
   */
  public java.lang.String getSmartReceiptText() {
    return genClient.cacheGet(CacheKey.smartReceiptText);
  }

  /**
   * URL we will expose on printed and web receipts for this app
   */
  public java.lang.String getSmartReceiptUrl() {
    return genClient.cacheGet(CacheKey.smartReceiptUrl);
  }

  /**
   * Text for external link to this app's detail page in the app market.
   */
  public java.lang.String getLinkLabel() {
    return genClient.cacheGet(CacheKey.linkLabel);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    id
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    app
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.base.Reference.JSON_CREATOR)),
    locale
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    name
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    description
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    tagline
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    benefits
        (com.clover.sdk.extractors.BasicListExtractionStrategy.instance(java.lang.String.class)),
    videoUrl
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    filenameIcon
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    filenameIconSmall
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    filenameIconLarge
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    filenameCover
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    filenameBanner
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    privacyPolicy
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    eula
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    supportPhone
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    supportPhoneHours
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    supportEmail
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    supportUrl
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    smartReceiptText
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    smartReceiptUrl
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    linkLabel
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
      ;

    private final com.clover.sdk.extractors.ExtractionStrategy extractionStrategy;

    private CacheKey(com.clover.sdk.extractors.ExtractionStrategy s) {
      extractionStrategy = s;
    }

    @Override
    public com.clover.sdk.extractors.ExtractionStrategy getExtractionStrategy() {
      return extractionStrategy;
    }
  }

  private final GenericClient<AppLocale> genClient;

  /**
   * Constructs a new empty instance.
   */
  public AppLocale() {
    genClient = new GenericClient<AppLocale>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected AppLocale(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public AppLocale(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public AppLocale(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public AppLocale(AppLocale src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {
    genClient.validateLength(getId(), 13);

    genClient.validateNull(getLocale(), "locale");
    genClient.validateLength(getLocale(), 5);

    genClient.validateLength(getName(), 127);

    genClient.validateLength(getDescription(), 2000);

    genClient.validateLength(getTagline(), 255);

    genClient.validateLength(getVideoUrl(), 255);

    genClient.validateLength(getFilenameIcon(), 100);

    genClient.validateLength(getFilenameIconSmall(), 255);

    genClient.validateLength(getFilenameIconLarge(), 255);

    genClient.validateLength(getFilenameCover(), 255);

    genClient.validateLength(getFilenameBanner(), 255);

    genClient.validateLength(getPrivacyPolicy(), 255);

    genClient.validateLength(getEula(), 255);

    genClient.validateLength(getSupportPhone(), 25);

    genClient.validateLength(getSupportPhoneHours(), 127);

    genClient.validateLength(getSupportEmail(), 127);

    genClient.validateLength(getSupportUrl(), 255);

    genClient.validateLength(getSmartReceiptText(), 100);

    genClient.validateLength(getSmartReceiptUrl(), 255);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'app' field is set and is not null */
  public boolean isNotNullApp() {
    return genClient.cacheValueIsNotNull(CacheKey.app);
  }

  /** Checks whether the 'locale' field is set and is not null */
  public boolean isNotNullLocale() {
    return genClient.cacheValueIsNotNull(CacheKey.locale);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'description' field is set and is not null */
  public boolean isNotNullDescription() {
    return genClient.cacheValueIsNotNull(CacheKey.description);
  }

  /** Checks whether the 'tagline' field is set and is not null */
  public boolean isNotNullTagline() {
    return genClient.cacheValueIsNotNull(CacheKey.tagline);
  }

  /** Checks whether the 'benefits' field is set and is not null */
  public boolean isNotNullBenefits() {
    return genClient.cacheValueIsNotNull(CacheKey.benefits);
  }

  /** Checks whether the 'benefits' field is set and is not null and is not empty */
  public boolean isNotEmptyBenefits() { return isNotNullBenefits() && !getBenefits().isEmpty(); }

  /** Checks whether the 'videoUrl' field is set and is not null */
  public boolean isNotNullVideoUrl() {
    return genClient.cacheValueIsNotNull(CacheKey.videoUrl);
  }

  /** Checks whether the 'filenameIcon' field is set and is not null */
  public boolean isNotNullFilenameIcon() {
    return genClient.cacheValueIsNotNull(CacheKey.filenameIcon);
  }

  /** Checks whether the 'filenameIconSmall' field is set and is not null */
  public boolean isNotNullFilenameIconSmall() {
    return genClient.cacheValueIsNotNull(CacheKey.filenameIconSmall);
  }

  /** Checks whether the 'filenameIconLarge' field is set and is not null */
  public boolean isNotNullFilenameIconLarge() {
    return genClient.cacheValueIsNotNull(CacheKey.filenameIconLarge);
  }

  /** Checks whether the 'filenameCover' field is set and is not null */
  public boolean isNotNullFilenameCover() {
    return genClient.cacheValueIsNotNull(CacheKey.filenameCover);
  }

  /** Checks whether the 'filenameBanner' field is set and is not null */
  public boolean isNotNullFilenameBanner() {
    return genClient.cacheValueIsNotNull(CacheKey.filenameBanner);
  }

  /** Checks whether the 'privacyPolicy' field is set and is not null */
  public boolean isNotNullPrivacyPolicy() {
    return genClient.cacheValueIsNotNull(CacheKey.privacyPolicy);
  }

  /** Checks whether the 'eula' field is set and is not null */
  public boolean isNotNullEula() {
    return genClient.cacheValueIsNotNull(CacheKey.eula);
  }

  /** Checks whether the 'supportPhone' field is set and is not null */
  public boolean isNotNullSupportPhone() {
    return genClient.cacheValueIsNotNull(CacheKey.supportPhone);
  }

  /** Checks whether the 'supportPhoneHours' field is set and is not null */
  public boolean isNotNullSupportPhoneHours() {
    return genClient.cacheValueIsNotNull(CacheKey.supportPhoneHours);
  }

  /** Checks whether the 'supportEmail' field is set and is not null */
  public boolean isNotNullSupportEmail() {
    return genClient.cacheValueIsNotNull(CacheKey.supportEmail);
  }

  /** Checks whether the 'supportUrl' field is set and is not null */
  public boolean isNotNullSupportUrl() {
    return genClient.cacheValueIsNotNull(CacheKey.supportUrl);
  }

  /** Checks whether the 'smartReceiptText' field is set and is not null */
  public boolean isNotNullSmartReceiptText() {
    return genClient.cacheValueIsNotNull(CacheKey.smartReceiptText);
  }

  /** Checks whether the 'smartReceiptUrl' field is set and is not null */
  public boolean isNotNullSmartReceiptUrl() {
    return genClient.cacheValueIsNotNull(CacheKey.smartReceiptUrl);
  }

  /** Checks whether the 'linkLabel' field is set and is not null */
  public boolean isNotNullLinkLabel() {
    return genClient.cacheValueIsNotNull(CacheKey.linkLabel);
  }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'app' field has been set, however the value could be null */
  public boolean hasApp() {
    return genClient.cacheHasKey(CacheKey.app);
  }

  /** Checks whether the 'locale' field has been set, however the value could be null */
  public boolean hasLocale() {
    return genClient.cacheHasKey(CacheKey.locale);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'description' field has been set, however the value could be null */
  public boolean hasDescription() {
    return genClient.cacheHasKey(CacheKey.description);
  }

  /** Checks whether the 'tagline' field has been set, however the value could be null */
  public boolean hasTagline() {
    return genClient.cacheHasKey(CacheKey.tagline);
  }

  /** Checks whether the 'benefits' field has been set, however the value could be null */
  public boolean hasBenefits() {
    return genClient.cacheHasKey(CacheKey.benefits);
  }

  /** Checks whether the 'videoUrl' field has been set, however the value could be null */
  public boolean hasVideoUrl() {
    return genClient.cacheHasKey(CacheKey.videoUrl);
  }

  /** Checks whether the 'filenameIcon' field has been set, however the value could be null */
  public boolean hasFilenameIcon() {
    return genClient.cacheHasKey(CacheKey.filenameIcon);
  }

  /** Checks whether the 'filenameIconSmall' field has been set, however the value could be null */
  public boolean hasFilenameIconSmall() {
    return genClient.cacheHasKey(CacheKey.filenameIconSmall);
  }

  /** Checks whether the 'filenameIconLarge' field has been set, however the value could be null */
  public boolean hasFilenameIconLarge() {
    return genClient.cacheHasKey(CacheKey.filenameIconLarge);
  }

  /** Checks whether the 'filenameCover' field has been set, however the value could be null */
  public boolean hasFilenameCover() {
    return genClient.cacheHasKey(CacheKey.filenameCover);
  }

  /** Checks whether the 'filenameBanner' field has been set, however the value could be null */
  public boolean hasFilenameBanner() {
    return genClient.cacheHasKey(CacheKey.filenameBanner);
  }

  /** Checks whether the 'privacyPolicy' field has been set, however the value could be null */
  public boolean hasPrivacyPolicy() {
    return genClient.cacheHasKey(CacheKey.privacyPolicy);
  }

  /** Checks whether the 'eula' field has been set, however the value could be null */
  public boolean hasEula() {
    return genClient.cacheHasKey(CacheKey.eula);
  }

  /** Checks whether the 'supportPhone' field has been set, however the value could be null */
  public boolean hasSupportPhone() {
    return genClient.cacheHasKey(CacheKey.supportPhone);
  }

  /** Checks whether the 'supportPhoneHours' field has been set, however the value could be null */
  public boolean hasSupportPhoneHours() {
    return genClient.cacheHasKey(CacheKey.supportPhoneHours);
  }

  /** Checks whether the 'supportEmail' field has been set, however the value could be null */
  public boolean hasSupportEmail() {
    return genClient.cacheHasKey(CacheKey.supportEmail);
  }

  /** Checks whether the 'supportUrl' field has been set, however the value could be null */
  public boolean hasSupportUrl() {
    return genClient.cacheHasKey(CacheKey.supportUrl);
  }

  /** Checks whether the 'smartReceiptText' field has been set, however the value could be null */
  public boolean hasSmartReceiptText() {
    return genClient.cacheHasKey(CacheKey.smartReceiptText);
  }

  /** Checks whether the 'smartReceiptUrl' field has been set, however the value could be null */
  public boolean hasSmartReceiptUrl() {
    return genClient.cacheHasKey(CacheKey.smartReceiptUrl);
  }

  /** Checks whether the 'linkLabel' field has been set, however the value could be null */
  public boolean hasLinkLabel() {
    return genClient.cacheHasKey(CacheKey.linkLabel);
  }


  /**
   * Sets the field 'id'.
   */
  public AppLocale setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'app'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public AppLocale setApp(com.clover.sdk.v3.base.Reference app) {
    return genClient.setRecord(app, CacheKey.app);
  }

  /**
   * Sets the field 'locale'.
   */
  public AppLocale setLocale(java.lang.String locale) {
    return genClient.setOther(locale, CacheKey.locale);
  }

  /**
   * Sets the field 'name'.
   */
  public AppLocale setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'description'.
   */
  public AppLocale setDescription(java.lang.String description) {
    return genClient.setOther(description, CacheKey.description);
  }

  /**
   * Sets the field 'tagline'.
   */
  public AppLocale setTagline(java.lang.String tagline) {
    return genClient.setOther(tagline, CacheKey.tagline);
  }

  /**
   * Sets the field 'benefits'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public AppLocale setBenefits(java.util.List<java.lang.String> benefits) {
    return genClient.setArrayOther(benefits, CacheKey.benefits);
  }

  /**
   * Sets the field 'videoUrl'.
   */
  public AppLocale setVideoUrl(java.lang.String videoUrl) {
    return genClient.setOther(videoUrl, CacheKey.videoUrl);
  }

  /**
   * Sets the field 'filenameIcon'.
   */
  public AppLocale setFilenameIcon(java.lang.String filenameIcon) {
    return genClient.setOther(filenameIcon, CacheKey.filenameIcon);
  }

  /**
   * Sets the field 'filenameIconSmall'.
   */
  public AppLocale setFilenameIconSmall(java.lang.String filenameIconSmall) {
    return genClient.setOther(filenameIconSmall, CacheKey.filenameIconSmall);
  }

  /**
   * Sets the field 'filenameIconLarge'.
   */
  public AppLocale setFilenameIconLarge(java.lang.String filenameIconLarge) {
    return genClient.setOther(filenameIconLarge, CacheKey.filenameIconLarge);
  }

  /**
   * Sets the field 'filenameCover'.
   */
  public AppLocale setFilenameCover(java.lang.String filenameCover) {
    return genClient.setOther(filenameCover, CacheKey.filenameCover);
  }

  /**
   * Sets the field 'filenameBanner'.
   */
  public AppLocale setFilenameBanner(java.lang.String filenameBanner) {
    return genClient.setOther(filenameBanner, CacheKey.filenameBanner);
  }

  /**
   * Sets the field 'privacyPolicy'.
   */
  public AppLocale setPrivacyPolicy(java.lang.String privacyPolicy) {
    return genClient.setOther(privacyPolicy, CacheKey.privacyPolicy);
  }

  /**
   * Sets the field 'eula'.
   */
  public AppLocale setEula(java.lang.String eula) {
    return genClient.setOther(eula, CacheKey.eula);
  }

  /**
   * Sets the field 'supportPhone'.
   */
  public AppLocale setSupportPhone(java.lang.String supportPhone) {
    return genClient.setOther(supportPhone, CacheKey.supportPhone);
  }

  /**
   * Sets the field 'supportPhoneHours'.
   */
  public AppLocale setSupportPhoneHours(java.lang.String supportPhoneHours) {
    return genClient.setOther(supportPhoneHours, CacheKey.supportPhoneHours);
  }

  /**
   * Sets the field 'supportEmail'.
   */
  public AppLocale setSupportEmail(java.lang.String supportEmail) {
    return genClient.setOther(supportEmail, CacheKey.supportEmail);
  }

  /**
   * Sets the field 'supportUrl'.
   */
  public AppLocale setSupportUrl(java.lang.String supportUrl) {
    return genClient.setOther(supportUrl, CacheKey.supportUrl);
  }

  /**
   * Sets the field 'smartReceiptText'.
   */
  public AppLocale setSmartReceiptText(java.lang.String smartReceiptText) {
    return genClient.setOther(smartReceiptText, CacheKey.smartReceiptText);
  }

  /**
   * Sets the field 'smartReceiptUrl'.
   */
  public AppLocale setSmartReceiptUrl(java.lang.String smartReceiptUrl) {
    return genClient.setOther(smartReceiptUrl, CacheKey.smartReceiptUrl);
  }

  /**
   * Sets the field 'linkLabel'.
   */
  public AppLocale setLinkLabel(java.lang.String linkLabel) {
    return genClient.setOther(linkLabel, CacheKey.linkLabel);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'app' field, the 'has' method for this field will now return false */
  public void clearApp() {
    genClient.clear(CacheKey.app);
  }
  /** Clears the 'locale' field, the 'has' method for this field will now return false */
  public void clearLocale() {
    genClient.clear(CacheKey.locale);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'description' field, the 'has' method for this field will now return false */
  public void clearDescription() {
    genClient.clear(CacheKey.description);
  }
  /** Clears the 'tagline' field, the 'has' method for this field will now return false */
  public void clearTagline() {
    genClient.clear(CacheKey.tagline);
  }
  /** Clears the 'benefits' field, the 'has' method for this field will now return false */
  public void clearBenefits() {
    genClient.clear(CacheKey.benefits);
  }
  /** Clears the 'videoUrl' field, the 'has' method for this field will now return false */
  public void clearVideoUrl() {
    genClient.clear(CacheKey.videoUrl);
  }
  /** Clears the 'filenameIcon' field, the 'has' method for this field will now return false */
  public void clearFilenameIcon() {
    genClient.clear(CacheKey.filenameIcon);
  }
  /** Clears the 'filenameIconSmall' field, the 'has' method for this field will now return false */
  public void clearFilenameIconSmall() {
    genClient.clear(CacheKey.filenameIconSmall);
  }
  /** Clears the 'filenameIconLarge' field, the 'has' method for this field will now return false */
  public void clearFilenameIconLarge() {
    genClient.clear(CacheKey.filenameIconLarge);
  }
  /** Clears the 'filenameCover' field, the 'has' method for this field will now return false */
  public void clearFilenameCover() {
    genClient.clear(CacheKey.filenameCover);
  }
  /** Clears the 'filenameBanner' field, the 'has' method for this field will now return false */
  public void clearFilenameBanner() {
    genClient.clear(CacheKey.filenameBanner);
  }
  /** Clears the 'privacyPolicy' field, the 'has' method for this field will now return false */
  public void clearPrivacyPolicy() {
    genClient.clear(CacheKey.privacyPolicy);
  }
  /** Clears the 'eula' field, the 'has' method for this field will now return false */
  public void clearEula() {
    genClient.clear(CacheKey.eula);
  }
  /** Clears the 'supportPhone' field, the 'has' method for this field will now return false */
  public void clearSupportPhone() {
    genClient.clear(CacheKey.supportPhone);
  }
  /** Clears the 'supportPhoneHours' field, the 'has' method for this field will now return false */
  public void clearSupportPhoneHours() {
    genClient.clear(CacheKey.supportPhoneHours);
  }
  /** Clears the 'supportEmail' field, the 'has' method for this field will now return false */
  public void clearSupportEmail() {
    genClient.clear(CacheKey.supportEmail);
  }
  /** Clears the 'supportUrl' field, the 'has' method for this field will now return false */
  public void clearSupportUrl() {
    genClient.clear(CacheKey.supportUrl);
  }
  /** Clears the 'smartReceiptText' field, the 'has' method for this field will now return false */
  public void clearSmartReceiptText() {
    genClient.clear(CacheKey.smartReceiptText);
  }
  /** Clears the 'smartReceiptUrl' field, the 'has' method for this field will now return false */
  public void clearSmartReceiptUrl() {
    genClient.clear(CacheKey.smartReceiptUrl);
  }
  /** Clears the 'linkLabel' field, the 'has' method for this field will now return false */
  public void clearLinkLabel() {
    genClient.clear(CacheKey.linkLabel);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public AppLocale copyChanges() {
    AppLocale copy = new AppLocale();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(AppLocale src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new AppLocale(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<AppLocale> CREATOR = new android.os.Parcelable.Creator<AppLocale>() {
    @Override
    public AppLocale createFromParcel(android.os.Parcel in) {
      AppLocale instance = new AppLocale(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public AppLocale[] newArray(int size) {
      return new AppLocale[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<AppLocale> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<AppLocale>() {
    @Override
    public AppLocale create(org.json.JSONObject jsonObject) {
      return new AppLocale(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;
    public static final boolean APP_IS_REQUIRED = false;
    public static final boolean LOCALE_IS_REQUIRED = true;
    public static final long LOCALE_MAX_LEN = 5;
    public static final boolean NAME_IS_REQUIRED = false;
    public static final long NAME_MAX_LEN = 127;
    public static final boolean DESCRIPTION_IS_REQUIRED = false;
    public static final long DESCRIPTION_MAX_LEN = 2000;
    public static final boolean TAGLINE_IS_REQUIRED = false;
    public static final long TAGLINE_MAX_LEN = 255;
    public static final boolean BENEFITS_IS_REQUIRED = false;
    public static final boolean VIDEOURL_IS_REQUIRED = false;
    public static final long VIDEOURL_MAX_LEN = 255;
    public static final boolean FILENAMEICON_IS_REQUIRED = false;
    public static final long FILENAMEICON_MAX_LEN = 100;
    public static final boolean FILENAMEICONSMALL_IS_REQUIRED = false;
    public static final long FILENAMEICONSMALL_MAX_LEN = 255;
    public static final boolean FILENAMEICONLARGE_IS_REQUIRED = false;
    public static final long FILENAMEICONLARGE_MAX_LEN = 255;
    public static final boolean FILENAMECOVER_IS_REQUIRED = false;
    public static final long FILENAMECOVER_MAX_LEN = 255;
    public static final boolean FILENAMEBANNER_IS_REQUIRED = false;
    public static final long FILENAMEBANNER_MAX_LEN = 255;
    public static final boolean PRIVACYPOLICY_IS_REQUIRED = false;
    public static final long PRIVACYPOLICY_MAX_LEN = 255;
    public static final boolean EULA_IS_REQUIRED = false;
    public static final long EULA_MAX_LEN = 255;
    public static final boolean SUPPORTPHONE_IS_REQUIRED = false;
    public static final long SUPPORTPHONE_MAX_LEN = 25;
    public static final boolean SUPPORTPHONEHOURS_IS_REQUIRED = false;
    public static final long SUPPORTPHONEHOURS_MAX_LEN = 127;
    public static final boolean SUPPORTEMAIL_IS_REQUIRED = false;
    public static final long SUPPORTEMAIL_MAX_LEN = 127;
    public static final boolean SUPPORTURL_IS_REQUIRED = false;
    public static final long SUPPORTURL_MAX_LEN = 255;
    public static final boolean SMARTRECEIPTTEXT_IS_REQUIRED = false;
    public static final long SMARTRECEIPTTEXT_MAX_LEN = 100;
    public static final boolean SMARTRECEIPTURL_IS_REQUIRED = false;
    public static final long SMARTRECEIPTURL_MAX_LEN = 255;
    public static final boolean LINKLABEL_IS_REQUIRED = false;

  }

}
