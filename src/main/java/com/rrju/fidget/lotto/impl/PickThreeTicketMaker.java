package com.rrju.fidget.lotto.impl;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.rrju.fidget.lotto.TicketMaker;

@Service
public class PickThreeTicketMaker implements TicketMaker<PickThreeTicket>
{
	private AtomicLong ticketIdSeq = new AtomicLong(0L);

	@Override
	public PickThreeTicket makeTicket(String drawingDate, int... numbers)
	{
		PickThreeTicket t = new PickThreeTicket(drawingDate, numbers[0], numbers[1], numbers[2]);
		t.setTicketId(ticketIdSeq.incrementAndGet());
		return t;
	}

	@Override
	public PickThreeTicket makeRandomTicket(String drawingDate)
	{
		PickThreeTicket t = new PickThreeTicket(drawingDate);
		t.setTicketId(ticketIdSeq.incrementAndGet());
		return t;
	}
}
