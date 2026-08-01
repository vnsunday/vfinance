package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class aug01 {
	public void d3_8half_plus3() {
		ITask t1 = Task.Construct("Clip", "ztable");
		ITask t2 = Task.Construct("Entext", "Long");
		
		Task.Schedule(new ITask[] { t1, t2 }, new int[] { 1, 1} );
	}
}
