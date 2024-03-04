package net.spikesync.basic.webapp;

import jakarta.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class RestfulApplication extends ResourceConfig {

	public RestfulApplication() {

		packages(TestResource.class.getPackage().getName());
	}
}
