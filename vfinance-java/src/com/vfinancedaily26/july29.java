package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class july29 {
	public void d3_8_plus3() {
		ITask e1 = Task.Construct("Exploring", "Social Quality");
		ITask e2 = Task.Construct("Outdoor", "");
		
		Task.Schedule(new ITask[] { e1, e2}, new int[] { 1, 1 });
		Task.Completed(new ITask[] { e1, e2 });
	}
	
	public void d3_19half_plus3() {
		ITask powertext = Task.Construct("PowerText", "");
		ITask vs = Task.Construct("Visualize", "ztable");
		
		Task.Schedule(new ITask[] { powertext, vs}, new int[] {1 , 1});
	}
}
