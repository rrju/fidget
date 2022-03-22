package com.rrju.fidget.lotto;

public abstract class Ticket
{
	private long ticketId;
	private long timestamp;
	private String gameType;
	private String drawingDate;

	// --------------------------------------------------

	public abstract int[] getNumbers();

	public long getTicketId()
	{
		return ticketId;
	}

	public void setTicketId(long ticketId)
	{
		this.ticketId = ticketId;
	}

	public long getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(long timestamp)
	{
		this.timestamp = timestamp;
	}

	public String getGameType()
	{
		return gameType;
	}

	public void setGameType(String gameType)
	{
		this.gameType = gameType;
	}

	public String getDrawingDate()
	{
		return drawingDate;
	}

	public void setDrawingDate(String drawingDate)
	{
		this.drawingDate = drawingDate;
	}
}
