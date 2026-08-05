package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class july22 {

	public void d3_19half_plus3() {
		ITask entext = Task.Construct("EN-Text", "Panasonic");		
		Task.Schedule(new ITask[] { entext}, null);
	}
	
	public int d3_8half_plus3() {
		ITask enText = Task.Construct("EN_text", "");
		ITask finish  = Task.Construct("Finish", "");
		
		Task.Schedule(new ITask[] { enText, finish }, new int[] { 1, 1} );
		return 0;
	}
}
