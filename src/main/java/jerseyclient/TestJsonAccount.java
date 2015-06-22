package jerseyclient;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class TestJsonAccount {

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/JavaJersey").build();
	}

	private static void wrtieXMLResp() {
		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		// String response =
		// target.path("rest").path("demoMime").path("account")
		// .request().accept(MediaType.APPLICATION_XML)
		// .get(Response.class).toString();

		String response = target.path("rest").path("demoMime").path("account")
				.request().accept(MediaType.APPLICATION_XML).get(String.class);

		System.out.println(response);

	}

	private static void wrtieJsonResp() {
		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		// String response =
		// target.path("rest").path("demoMime").path("account")
		// .request().accept(MediaType.APPLICATION_XML)
		// .get(Response.class).toString();

		String response = target.path("rest").path("demoMime").path("account")
				.request().accept(MediaType.APPLICATION_JSON).get(String.class);

		System.out.println(response);

	}

	public static void main(String[] args) {

		// TestJsonAccount.wrtieXMLResp();
		TestJsonAccount.wrtieJsonResp();
	}

}
