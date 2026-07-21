package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class july21 {
	public int d_7half_plus3() {
		ITask zpower = Task.Construct("Zen_Power", "");
		ITask EN_text = Task.Construct("", "");
		
		Task.Schedule(new ITask[] { zpower, EN_text }, new int[] { 1, 1 });
		return 0;
	}
}
