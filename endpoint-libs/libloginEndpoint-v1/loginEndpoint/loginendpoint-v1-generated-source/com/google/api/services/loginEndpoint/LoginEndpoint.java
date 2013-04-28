/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This file was generated.
 *  with google-apis-code-generator 1.3.0 (build: 2013-04-25 17:55:28 UTC)
 *  on 2013-04-28 at 01:25:11 UTC 
 */

package com.google.api.services.loginEndpoint;

import com.google.api.client.googleapis.GoogleUtils;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.common.base.Preconditions;

/**
 * Service definition for LoginEndpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link LoginEndpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * <p>
 * Upgrade warning: this class now extends {@link AbstractGoogleJsonClient}, whereas in prior
 * version 1.8 it extended {@link com.google.api.client.googleapis.services.GoogleClient}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class LoginEndpoint extends AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    Preconditions.checkState(GoogleUtils.VERSION.equals("1.13.2-beta"),
        "You are currently running with version %s of google-api-client. " +
        "You need version 1.13.2-beta of google-api-client to run version " +
        "1.13.2-beta of the  library.", GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://titechsimchat.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "loginEndpoint/v1/login/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   * @deprecated (scheduled to be removed in 1.13)
   */
  @Deprecated
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport
   * @param jsonFactory JSON factory
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public LoginEndpoint(HttpTransport transport, JsonFactory jsonFactory,
      HttpRequestInitializer httpRequestInitializer) {
    super(transport,
        jsonFactory,
        DEFAULT_ROOT_URL,
        DEFAULT_SERVICE_PATH,
        httpRequestInitializer,
        false);
  }

  /**
   * @param transport HTTP transport
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @param rootUrl root URL of the service
   * @param servicePath service path
   * @param jsonObjectParser JSON object parser
   * @param googleClientRequestInitializer Google request initializer or {@code null} for none
   * @param applicationName application name to be sent in the User-Agent header of requests or
   *        {@code null} for none
   * @param suppressPatternChecks whether discovery pattern checks should be suppressed on required
   *        parameters
   */
  LoginEndpoint(HttpTransport transport,
      HttpRequestInitializer httpRequestInitializer,
      String rootUrl,
      String servicePath,
      JsonObjectParser jsonObjectParser,
      GoogleClientRequestInitializer googleClientRequestInitializer,
      String applicationName,
      boolean suppressPatternChecks) {
    super(transport,
        httpRequestInitializer,
        rootUrl,
        servicePath,
        jsonObjectParser,
        googleClientRequestInitializer,
        applicationName,
        suppressPatternChecks);
  }

  @Override
  protected void initialize(AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the LoginV1Endpoint collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code LoginEndpoint loginEndpoint = new LoginEndpoint(...);}
   *   {@code LoginEndpoint.LoginV1Endpoint.List request = loginEndpoint.loginV1Endpoint().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public LoginV1Endpoint loginV1Endpoint() {
    return new LoginV1Endpoint();
  }

  /**
   * The "loginV1Endpoint" collection of methods.
   */
  public class LoginV1Endpoint {

    /**
     * Create a request for the method "loginV1Endpoint.login".
     *
     * This request holds the parameters needed by the the loginEndpoint server.  After setting any
     * optional parameters, call the {@link Login#execute()} method to invoke the remote operation.
     *
     * @param email
     * @param password
     * @return the request
     */
    public Login login(String email, String password) throws java.io.IOException {
      Login result = new Login(email, password);
      initialize(result);
      return result;
    }

    public class Login extends LoginEndpointRequest<com.google.api.services.loginEndpoint.model.LoginResultV1Dto> {

      private static final String REST_PATH = "{email}/{password}";

      /**
       * Create a request for the method "loginV1Endpoint.login".
       *
       * This request holds the parameters needed by the the loginEndpoint server.  After setting any
       * optional parameters, call the {@link Login#execute()} method to invoke the remote operation.
       * <p> {@link Login#initialize(AbstractGoogleClientRequest)} must be called to initialize this
       * instance immediately after invoking the constructor. </p>
       *
       * @param email
       * @param password
       * @since 1.13
       */
      protected Login(String email, String password) {
        super(LoginEndpoint.this, "POST", REST_PATH, null, com.google.api.services.loginEndpoint.model.LoginResultV1Dto.class);
        this.email = Preconditions.checkNotNull(email, "Required parameter email must be specified.");
        this.password = Preconditions.checkNotNull(password, "Required parameter password must be specified.");
      }

      @Override
      public Login setAlt(String alt) {
        return (Login) super.setAlt(alt);
      }

      @Override
      public Login setFields(String fields) {
        return (Login) super.setFields(fields);
      }

      @Override
      public Login setKey(String key) {
        return (Login) super.setKey(key);
      }

      @Override
      public Login setOauthToken(String oauthToken) {
        return (Login) super.setOauthToken(oauthToken);
      }

      @Override
      public Login setPrettyPrint(Boolean prettyPrint) {
        return (Login) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Login setQuotaUser(String quotaUser) {
        return (Login) super.setQuotaUser(quotaUser);
      }

      @Override
      public Login setUserIp(String userIp) {
        return (Login) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private String email;

      /**

       */
      public String getEmail() {
        return email;
      }

      public Login setEmail(String email) {
        this.email = email;
        return this;
      }

      @com.google.api.client.util.Key
      private String password;

      /**

       */
      public String getPassword() {
        return password;
      }

      public Login setPassword(String password) {
        this.password = password;
        return this;
      }

    }

  }

  /**
   * Builder for {@link LoginEndpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport
     * @param jsonFactory JSON factory
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(HttpTransport transport, JsonFactory jsonFactory,
        HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link LoginEndpoint}. */
    @Override
    public LoginEndpoint build() {
      return new LoginEndpoint(getTransport(),
          getHttpRequestInitializer(),
          getRootUrl(),
          getServicePath(),
          getObjectParser(),
          getGoogleClientRequestInitializer(),
          getApplicationName(),
          getSuppressPatternChecks());
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    /**
     * Set the {@link LoginEndpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setLoginEndpointRequestInitializer(
        LoginEndpointRequestInitializer loginendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(loginendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
