package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class july31 {
	public void d3_9plus3() {
		ITask t1 = Task.Construct("Avatar", "");
		ITask t2 = Task.Construct("Visualize", "");
		
		Task.Schedule(new ITask[] { t1, t2}, new int[] { 1, 1} );
	}
	
	public void d3_14half_plus3() {
		ITask t1 = Task.Construct("Video", "ztable");
		ITask t2 = Task.Construct("CostFunction", "");
		ITask t3 = Task.Construct("Finger", "Template-Time");
		
		Task.Schedule(new ITask[] { t1, t2, t3 }, new int[] { 1, 1, 1 });
	}
}
