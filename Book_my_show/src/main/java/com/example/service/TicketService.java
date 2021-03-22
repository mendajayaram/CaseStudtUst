package com.example.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dto.BankRequestDto;
import com.example.dto.RequestDto;
import com.example.dto.ResponeDto;
import com.example.model.Movies;
import com.example.model.Ticket;
import com.example.repository.MovieRepository;
import com.example.repository.TicketRepository;

@Service
public class TicketService 
{
@Autowired
private TicketRepository ticketrepo;

@Autowired
private MovieRepository movierepo;

public List<Movies> getMovies() {
	// TODO Auto-generated method stub
	System.out.println("we are in service class");
	List<Movies> list=movierepo.findAll();
	System.out.println(list);
	 return list;
}

public ResponeDto saveTicket(RequestDto reqdto) {
	
	
	Ticket ticket=new Ticket();
	int total_price=reqdto.getQuantity()*200;
	ticket.setRelease_date(LocalDate.now());
	ticket.setMovie_name(reqdto.getMovie_name());
	ticket.setPrice(total_price);
	
	
	Ticket t=ticketrepo.save(ticket);
	
	
	BankRequestDto bankreqdto=new BankRequestDto();
	
	//bankreqdto.setAccno(new Random().nextInt(240000));
	bankreqdto.setAccno(22);
	bankreqdto.setBalance(total_price);
	bankreqdto.setDate(LocalDate.now());
	
	
	
	RestTemplate template=new RestTemplate();
	
	String Url="http://localhost:9024/addAccount";
	
	//ResponseEntity<String> status=template.postForEntity(Url, bankreqdto, String.class);
	//ResponseEntity<String> status=template.getForEntity("http://localhost:9024/info", String.class);
	
	//BankRequestDto bankreqdto1=new BankRequestDto();
	ResponseEntity<BankRequestDto> bankreqdto1=template.postForEntity(Url, bankreqdto, BankRequestDto.class);
	
	System.out.println("....."+bankreqdto1);
	
	ResponeDto resdto=new ResponeDto();
	
	
	
	//if(t!=null)
	//if(bankreqdto1.getStatus().equals("deducted"))
	if(true)
	{
		resdto.setBooking_date(LocalDate.now());
		resdto.setMovie_name(reqdto.getMovie_name());
		resdto.setPrice(reqdto.getPrice());
		resdto.setQuantity(total_price);		
		resdto.setStatus("Your Ticket Booked successfully");
		return resdto;
	}
	
	else
	{
		resdto.setBooking_date(LocalDate.now());
		resdto.setMovie_name(reqdto.getMovie_name());
		resdto.setPrice(reqdto.getPrice());
		//resdto.setStatus("Sorry something went wrong....");
		//resdto.setStatus(status.getBody());
		resdto.setQuantity(total_price);		
		resdto.setStatus("Transaction failed please try again");
		return resdto;
	}
	
    
}

}
