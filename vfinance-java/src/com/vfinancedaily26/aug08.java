package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class aug08 {
	public void d3_15half_plus3() {
		ITask t1 = Task.Construct("bidding", "human");
		ITask t2 = Task.Construct("EN-text", "");
		
		t1.Strategy().DirectPhysicalContact(new String[] {"" , ""});
		t1.Graph("Grace", new String[][] {
			{ "URL", "" }
		});
		
		Task.Schedule(new ITask[] { t1, t2}, new int[] { 1, 1});
	}
}