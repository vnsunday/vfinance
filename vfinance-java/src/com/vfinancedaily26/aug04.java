package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class aug04 {
	public void d3_14plus3() {
		ITask ttext = Task.Construct("Draw-Visualize", "");
		ITask bid = Task.Construct("Bidding", "Human");
		
		bid.Strategy().DirectPhysicalContact(new String[] {"", ""});
		Task.Schedule(new ITask[] { ttext, bid }, new int[] { 1, 1});
	}
	
	public void d3_22plus1() {
		ITask bid = Task.Construct("bidding", "Human");
		bid.Strategy().DirectPhysicalContact(new String[] { "Full", "Buy-side/Sell-side"});
		
		Task.Schedule(new ITask[] { bid } , null);
	}
}
