package com.vfinancedaily26;

import com.vfinance.ITask;
import com.vfinance.Task;

public class aug05 {
	public void d3_8half_plus3() {
		ITask article = Task.Construct("Article", "ZTable steps");
		ITask load_text = Task.Construct("Load-Text", "EN");
		ITask bidding = Task.Construct("bidding", "human");
		
		Task.Schedule(new ITask[] { article, load_text, bidding}, new int[] { 1, 1, 1});
	}
	
	public void d3_13_plus3() {
		ITask load_text = Task.Construct("Load-Text", "EN");
		ITask bidding = Task.Construct("bidding", "");
		ITask ioshop = Task.Construct("IO-Shop", "Market. Custom. Gift");
				
		Task.Schedule(new ITask[] { load_text, bidding, ioshop }, new int[] { 1, 1, 1});
		
		String[][] binary = new String[][] {
			{ "Address (Embassy)", "Central Building"},
			{ "Title", "Bussiness Analysis" }
		};
	}
}
