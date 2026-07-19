package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class july18 {
	public static void d3_9plus3() {
		ITask obs1 = Task.Construct("ExactSekeletonObservation", "Statistics"); // 03 Task 
		ITask vis1 = Task.Construct("Visualization", "ZTable"); // 03 Task + Upload Version Control
		ITask green = Task.Construct("MethodAware", "Nutrition"); // 
		
		Task.Arrange3(obs1, vis1, green, "9+3");
    }
}