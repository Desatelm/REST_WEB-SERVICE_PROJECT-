package edu.mum.cs545.jsf;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import cs545.airline.model.Airport;
import cs545.airline.model.Flight;
import cs545.airline.service.AirportService;

@Named
@ApplicationScoped

public class RestAirportService {

	List<Airport> airports;

	public List<Airport> getAirports() {
		return airports;
	}

	public void setAirports(List<Airport> airports) {
		this.airports = airports;
	}

	@Inject
	private AirportService airportservice;

	public void create(Airport airport) {
		airportservice.create(airport);
	}

	public void delete(Airport airport) {
		airportservice.delete(airport);
	}

	public Airport update(Airport airport) {
		return airportservice.update(airport);
	}

	public Airport find(Airport airport) {
		return airportservice.find(airport);
	}

	public Airport findByCode(String airportcode) {
		return airportservice.findByCode(airportcode);
	}

	public List<Airport> findByArrival(Flight flight) {
		return airportservice.findByArrival(flight);
	}

	public List<Airport> findByDeparture(Flight flight) {
		return airportservice.findByDeparture(flight);
	}

	public List<Airport> findByCity(String city) {
		return airportservice.findByCity(city);
	}

	public List<Airport> findByCountry(String country) {
		return airportservice.findByCountry(country);
	}

	public List<Airport> findByName(String name) {
		return airportservice.findByName(name);
	}

	public String findAll() {
		airports = airportservice.findAll();
		return "airport";
	}

}
