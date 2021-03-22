package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.RequestDto;
import com.example.dto.ResponeDto;
import com.example.model.Movies;
import com.example.model.Ticket;
import com.example.service.TicketService;

@RestController
public class Ticket_Booking 
{
	@Autowired
	private TicketService ticketservice;
	
	@GetMapping("/tickets")
	public ResponseEntity<List<Movies>> findAllTickets() {
		System.out.println("in fetch movies");
		List<Movies> movies=ticketservice.getMovies();
		System.out.println(movies);
	    return new ResponseEntity<List<Movies>> (movies,HttpStatus.OK);
	}
	
	@PostMapping("/bookticket")
	public ResponseEntity<ResponeDto> book_Ticket(@RequestBody RequestDto reqdto)
	{
		System.out.println("reqdto===="+reqdto);
		ResponeDto response=ticketservice.saveTicket(reqdto);
		
		return new ResponseEntity<ResponeDto> (response,HttpStatus.ACCEPTED);
	}

}
