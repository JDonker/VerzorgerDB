package com.example.demo.api;
import com.example.demo.controller.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;

import javax.ws.rs.Path;

import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;

import javax.ws.rs.core.Response;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.example.demo.VergelijkDier;
import com.example.demo.VergelijkNaam;
import com.example.demo.Verzorger;




@Path("sorted")
@Component
public class SortedEndpoint {

	@Autowired
	VerzorgerService verzorgerService;
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	// Deze sectie reageert op een get request 
	// ontvangt geen input
	// returned de verzorgers in JSON format.
	
	public Response listGroep(){
		Iterable <Verzorger> verzorgers = verzorgerService.findAll();
		
		List<Verzorger> sorteer = new ArrayList<Verzorger>();
		
		for(Verzorger man : verzorgers) {
			sorteer.add(man);
		}
		
		Collections.sort(sorteer,new VergelijkDier());;
		
		Iterable<Verzorger> vsorted = sorteer;
		return Response.ok(vsorted).build();
	}
	
	  @Path("{id}")

		public Response listGroepSorted(@PathParam("id") String type){
			Iterable <Verzorger> verzorgers = verzorgerService.findAll();

			List<Verzorger> sorteer = new ArrayList<Verzorger>();
			
			for(Verzorger man : verzorgers) {
				sorteer.add(man);
			}
			
			Collections.sort(sorteer,new VergelijkNaam());;
			
			Iterable<Verzorger> vsorted = sorteer;
			return Response.ok(vsorted).build();

	    }
}