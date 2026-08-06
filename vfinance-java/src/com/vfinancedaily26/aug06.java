package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class aug06 {
	public void d3_9plus3() {
		ITask t1 = Task.Construct("bidding", "Human. ");
		ITask t2 = Task.Construct("Awarness", "EN. Load-text");
		ITask t3 = Task.Construct("Visualize", "Chain");
		
		Task.Schedule(new ITask[] { t1, t2, t3 }, new int[] { 1, 1, 1 }); 
		
		t1.Meta(new String[][] {
			{"Crypto-currency", ""}
		});
	}
}
