package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class july21 {
	public int d_7half_plus1() {
		ITask zpower = Task.Construct("Zen_Power", "");
		Task.Schedule(new ITask[] { zpower }, new int[] { 1 });
		return 0;
	}
	
	public int d_9_plus3() {
		
		ITask enSound = Task.Construct("EN-Sound", "Movement Theory");
		ITask avatar = Task.Construct("Avatar", null);	
		avatar.Techniques(new Object[] { "Entrance_Building_Hall" });
		
		Task.Schedule(new ITask[] { enSound, avatar }, new int[] { 1, 1} );
		return 0;
	}
}
