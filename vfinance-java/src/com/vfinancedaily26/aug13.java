package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class aug13 {
	public void d3_9plus3( ) {
		ITask t1 = Task.Construct("EN-text", "Load");
		t1.Graph("List3", new String[][] {
			{ "China", "Micro. Circuit" }
		});
	}
	
	public void d3_20plus3() {
		ITask t1 = Task.Construct("Power", "Zen. Primitive");
		ITask t2 = Task.Construct("En-text", "Load");
		
		t2.Graph("Key-Orientation-Clock", new String[][] {});
		Task.Schedule(new ITask[] { t1, t2 }, null);
	}
}
