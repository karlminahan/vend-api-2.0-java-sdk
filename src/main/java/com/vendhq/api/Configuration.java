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


package com.vendhq.api;


public class Configuration {

    private String domainPrefix = "";
    private String applicationName = "";

    private ApiClient defaultApiClient = new ApiClient(domainPrefix, applicationName);

    public Configuration (String domainPrefix, String applicationName) {
        if (domainPrefix.isEmpty() || applicationName.isEmpty()) {
            throw new IllegalArgumentException("domainPrefix and applicationName must not be empty");
        }
        this.domainPrefix = domainPrefix;
        this.applicationName = applicationName;
        defaultApiClient = new ApiClient(domainPrefix, applicationName);
    }

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}