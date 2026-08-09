package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class aug09 {
	public void d3_9plus3() {
		ITask t1 = Task.Construct("Color-dodge", "");
		ITask t2 = Task.Construct("EN-text", "Literature");
		
		Task.Schedule(new ITask[] { t1, t2 }, new int[] { 1, 1});
	}
}
