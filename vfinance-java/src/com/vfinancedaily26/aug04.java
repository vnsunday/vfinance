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
}
