package com.example.simplechat.api;

import java.io.IOException;

import com.example.simplechat.utils.CommonUtils;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.googleapis.services.AbstractGoogleClient;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson.JacksonFactory;
import com.google.api.services.loginEndpoint.LoginEndpoint;

public class RemoteApi {
	protected static <B extends AbstractGoogleClient.Builder> B updateBuilder(B builder) {
		builder.setRootUrl(CommonUtils.BASE_URL + "_ah/api/");

		final boolean enableGZip = builder.getRootUrl().startsWith("https:");

		builder.setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
			@Override
			public void initialize(AbstractGoogleClientRequest<?> request)
					throws IOException {
				if (!enableGZip) {
					request.setDisableGZipContent(true);
				}
			}
		});

		return builder;
	}

	public static LoginEndpoint getLoginEndpoint() {
		LoginEndpoint.Builder endpointBuilder = new LoginEndpoint.Builder(
				AndroidHttp.newCompatibleTransport(), new JacksonFactory(),
				new HttpRequestInitializer() {
					@Override
					public void initialize(HttpRequest httpRequest) {
					}
				});

		return updateBuilder(endpointBuilder).build();
	}
}
