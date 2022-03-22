package com.rrju.fidget.lotto;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
public class LottoAppController
{
	private TicketMaker<?> ticketMaker;

	public LottoAppController(TicketMaker<?> ticketMaker)
	{
		this.ticketMaker = ticketMaker;
	}

	@GetMapping("/{drawingDate}")
	public Ticket makeRandomTicket(@PathVariable String drawingDate)
	{
		return ticketMaker.makeRandomTicket(drawingDate);
	}
}
