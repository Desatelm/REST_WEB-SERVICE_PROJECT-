package edu.mum.cs545.jsf;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cs545.airline.model.Airplane;
import cs545.airline.model.Flight;
import cs545.airline.service.AirplaneService;

@Named
@ApplicationScoped

public class RestAirplaneService {
	private List<Airplane> airplanes;

	public List<Airplane> getAirplanes() {
		return airplanes;
	}

	public void setAirplanes(List<Airplane> airplanes) {
		this.airplanes = airplanes;
	}

	@Inject
	private AirplaneService airplaneService;

	public void createAirplane(Airplane airport) {
		airplaneService.create(airport);
	}

	public void deleteAirplane(Airplane airport) {
		airplaneService.delete(airport);
	}

	public List<Airplane> findByModel(String airplane) {
		return airplaneService.findByModel(airplane);
	}

	public List<Airplane> findByFlight(Flight flight) {
		return airplaneService.findByFlight(flight);
	}

	public String findAll() {
		airplanes = airplaneService.findAll();
		return "airplane";
	}

	public Airplane findBySrlnr(String airplane) {
		return airplaneService.findBySrlnr(airplane);
	}

	public Airplane update(Airplane airplane) {
		return airplaneService.update(airplane);
	}
}
