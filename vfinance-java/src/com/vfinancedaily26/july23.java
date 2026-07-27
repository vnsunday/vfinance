package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class july23 {
	public void d3_8half_plus3() {
		ITask correct = Task.Construct("Correct", "Debian-Based");
		ITask chain = Task.Construct("Finish", "Chain-Clean");
		ITask exp_MF = Task.Construct("Exploring", "Organization & Anything Method");
		
		Task.Schedule(new ITask[] { correct, chain, exp_MF }, new int[] { 1, 1, 1 });
	}
}