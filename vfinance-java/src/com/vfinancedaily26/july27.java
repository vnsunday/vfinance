package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class july27 {
	public void d3_8half_plus3() {
	    ITask enText = Task.Construct("EN_text", "");
	    ITask enVocal = Task.Construct("EN_text", "");
	    ITask business = Task.Construct("", "Public Company");
	    
	    Task.Schedule(new ITask[] { enText, enVocal, business},  new int[] { 1, 1, 1 });
	}
}
