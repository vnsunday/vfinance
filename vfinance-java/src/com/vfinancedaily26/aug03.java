package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class aug03 {
	public void d3_17plus3() {
		// 
		ITask cf = Task.Construct("CostFunction", "");
		ITask exp = Task.Construct("Exploring", "Online-Execution");
		ITask bid = Task.Construct("Bidding", "Source: Human");
		
		cf.Strategy().DirectHandComupte(new String[] { "Number", "" });
		
		Task.Schedule(new ITask[] { cf, exp, bid }, new int[] { 1, 1, 1 });
	}
	
	public void d3_22half_plus1() {
		ITask bid = Task.Construct("Bidding", "Source: Human");
		bid.Strategy().DirectPhysicalContact(new String[] { "DirectTransaction" });
		
		Task.Schedule(new ITask[] { bid }, null);
	}
}
