package com.rrju.fidget.lotto;

public interface TicketMaker<T extends Ticket>
{
	public T makeTicket(String drawingDate, int... numbers);

	public T makeRandomTicket(String drawingDate);
}
