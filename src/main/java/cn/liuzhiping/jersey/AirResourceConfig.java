package cn.liuzhiping.jersey;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import cn.liuzhiping.resource.DemoResource;

@ApplicationPath("/api/*")
public class AirResourceConfig extends ResourceConfig {
	/**
	 * <p>
	 * Constructor for AirResourceConfig.
	 * </p>
	 */
	public AirResourceConfig() {
		packages("cn.liuzhiping.resource");
		register(DemoResource.class);
	}
}