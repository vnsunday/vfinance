package com.vfinancedaily26;

import com.vfinance.IFinished;
import com.vfinance.IMessStuffFind;
import com.vfinance.IPathFinding;
import com.vfinance.ITask;
import com.vfinance.ITopDownAware;
import com.vfinance.Task;

public class july17 {
	
	static int d3_12thirdquarter_plus3() {
		
		ITopDownAware r1 = null; // Thinking in Java
		IMessStuffFind r2 = null; // Adapter 6V 
		IMessStuffFind r3 = null; // Sewing automatic 
		
		IFinished fn = null;
		Object a3[] = { r1, r2, r3};
		
		fn.Finish(r1);
		return 0;
	}
	
	static int d3_15_plus3() {
		
		ITask sewing = Task.Construct("StuffMessFind", "SewingMechanics");
		ITask adapter = Task.Construct("StuffMessFind", "Adapter6V");
		ITask java = Task.Construct("TopDownAware", "JVM");
		
		Task.Arrange3(sewing, adapter, adapter, "15+3");
		java.Techniques(new Object[] { "VocalKeyword" });
		
		Task.PauseLaterBetter(sewing);
		Task.PauseLaterBetter(adapter);
		Task.Completed(new ITask[] { java } );
		return 0;
	}

	public static void main(String[] args) {
		d3_12thirdquarter_plus3();
		d3_15_plus3();
	}
}
