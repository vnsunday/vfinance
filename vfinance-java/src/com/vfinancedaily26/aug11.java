package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class aug11 {
	public void d3_8plus3() {
		ITask t1 = Task.Construct("load-text", null);
		Task.Schedule(new ITask[] { t1 }, null);
	}
	
	public void d3_15quarter_plus2() {
		ITask t1 = Task.Construct("Clean-Structure", "Workspace");
		ITask t2 = Task.Construct("load-text", "prepare");
		
		Task.Schedule(new ITask[] { t1, t2 }, null);
	}
}
