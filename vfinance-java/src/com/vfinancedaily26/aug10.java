package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class aug10 {
	public void d3_8plus3() {
		ITask t1 = Task.Construct("bidding", "Human");
		ITask t2 = Task.Construct("Feature-Observation", "Probability");
		ITask t3 = Task.Construct("io-shop", "");
		
		Task.Schedule(new ITask[] { t1, t2, t3 }, new int[] { 1, 1, 1 });
	}
}
