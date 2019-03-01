package com.example.demo.config;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.example.demo.api.VerzorgerEndpoint;
import com.example.demo.api.SortedEndpoint;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig(){
		register(VerzorgerEndpoint.class);

		register(SortedEndpoint.class);
	}
}
