
package com.learnng.automation.api.albums;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.learning.automation.api.pojo.Album;

public class GetRequestJsonPlaceholder {

	// Step 1 - Create the client object similar to opening postman, you cannot see
	// launching postman,
	// it happens internally,- headless

	HttpClient httpClient = HttpClientBuilder.create().build();

	@Test
	public void getAlbumTest() throws ClientProtocolException, IOException {
		// Step 2 - create the request here it's GET since we are retrieving
		HttpGet getRequest = new HttpGet("https://jsonplaceholder.typicode.com/posts");
		// Step 3 - setting the content type, here we are setting to json format
		getRequest.addHeader("accept", "application/json");

		// Step 4 - Execute the request and get the response, same as send which gives
		// response and
		// we are storing the response

		HttpResponse response = httpClient.execute(getRequest);
		// Step 5 Get the status code from response
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("Status code is" + statusCode);
		// Step 6- Validate the status code
		Assert.assertTrue(statusCode == 200, "jsonplaceholder typicode tests failed");

	}
}