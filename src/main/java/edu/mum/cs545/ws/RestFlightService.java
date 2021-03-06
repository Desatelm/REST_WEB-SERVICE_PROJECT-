package edu.mum.cs545.ws;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cs545.airline.model.Airline;
import cs545.airline.model.Airplane;
import cs545.airline.model.Airport;
import cs545.airline.model.Flight;
import cs545.airline.service.FlightService;

@Named
@Path("flightservice")
public class RestFlightService {
	@Inject
	private FlightService flightService;

	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public Flight update(Flight flight) {
		return flightService.update(flight);
	}

	@Path("find")
	@Consumes(MediaType.APPLICATION_JSON)
	@GET
	public Flight find(Flight flight) {
		return flightService.find(flight);
	}

	@Path("findBynumber")
	@Consumes(MediaType.APPLICATION_JSON)
	@GET
	public List<Flight> findByNumber(String flightnr) {
		return flightService.findByNumber(flightnr);
	}

	@Path("findByAirline")
	@Consumes(MediaType.APPLICATION_JSON)
	@GET
	public List<Flight> findByAirline(Airline airline) {
		return flightService.findByAirline(airline);
	}

	@Path("findByOrigin")
	@Consumes(MediaType.APPLICATION_JSON)
	@GET
	public List<Flight> findByOrigin(Airport airport) {
		return flightService.findByOrigin(airport);
	}

	@Path("findByDestination")
	@Consumes(MediaType.APPLICATION_JSON)
	@GET
	public List<Flight> findByDestination(Airport airport) {
		return flightService.findByDestination(airport);
	}

	@Path("findByArrival")
	@Consumes(MediaType.APPLICATION_JSON)
	@GET
	public List<Flight> findByDateArrival(Date datetime) {
		return flightService.findByArrival(datetime);
	}

	/*
	 * @Path("findByArrivalBetween")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @GET public List<Flight> findByArrivalBetween1(Date datetimeFrom, Date
	 * datetimeTo) { return flightService.findByArrivalBetween(datetimeFrom,
	 * datetimeTo); }
	 * 
	 * @Path("findByDeparture")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @GET public List<Flight> findByDeparture1(Date datetime) { return
	 * flightService.findByDeparture(datetime); }
	 * 
	 * @Path("findByDepartureBetween")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @GET public List<Flight> findByDepartureBetween1(Date datetimeFrom, Date
	 * datetimeTo) { return flightService.findByDepartureBetween(datetimeFrom,
	 * datetimeTo); }
	 */

	@Path("findAll")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public List<Flight> findAll() {
		return flightService.findAll();
	}

}
