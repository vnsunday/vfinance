package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class aug12 {
	public void d3_7half_plus3() {
		// 
		ITask t1 = Task.Construct("EN-load", null);
		ITask t2 = Task.Construct("const-function", "table I-O");
		ITask t3 = Task.Construct("text-observation", "");
		
		Task.Schedule(new ITask[] { t1, t2, t3},  null);
	}
}
