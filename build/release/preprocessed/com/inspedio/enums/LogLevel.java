package com.inspedio.enums;

public class LogLevel extends InsEnum{

	public static final LogLevel SYSTEM = new LogLevel("SYSTEM", 0);
	public static final LogLevel PROCESS = new LogLevel("PROCESS", 1);
	public static final LogLevel INFO = new LogLevel("INFO", 2);
	public static final LogLevel EXTRA = new LogLevel("EXTRA", 3);
	
	protected LogLevel(String Name, int Value) {
		super(Name, Value);
	}

}
