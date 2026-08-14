package com.vfinance;

public interface IMindCore {
	public void Label(String name);
	public void Name(String name, Object thing);  // Naming a thing	
	public void Graph(String name, String[][] params);
	public void ListingNoSkip(String target, String filter);
}
