package com.rrju.fidget.lotto.impl;

import java.util.concurrent.ThreadLocalRandom;

import com.rrju.fidget.lotto.Ticket;

public class PickThreeTicket extends Ticket
{
	private static final String GAME_TYPE = "PICK_THREE";
	private static final int MIN_NUM = 0;
	private static final int MAX_NUM = 9;

	private int[] numbers = new int[3];

	public PickThreeTicket(String drawingDate, int n1, int n2, int n3)
	{
		init();
		setDrawingDate(drawingDate);
		setNumbers(genNumberIfInvalid(n1), genNumberIfInvalid(n2), genNumberIfInvalid(n3));
	}

	public PickThreeTicket(String drawingDate)
	{
		init();
		setDrawingDate(drawingDate);
		setNumbers(genNumber(), genNumber(), genNumber());
	}

	private void init()
	{
		setGameType(GAME_TYPE);
		setTimestamp(System.currentTimeMillis());
		setTicketId(0);
	}

	private int genNumber()
	{
		return ThreadLocalRandom.current().nextInt(MIN_NUM, MAX_NUM + 1);
	}

	private int genNumberIfInvalid(int n)
	{
		return (MIN_NUM <= n && n >= MAX_NUM ? n : genNumber());
	}

	private void setNumbers(int n1, int n2, int n3)
	{
		numbers = new int[] { n1, n2, n3 };
	}

	@Override
	public int[] getNumbers()
	{
		return numbers;
	}
}
