package de.stylextv.haskal;

import de.stylextv.haskal.util.ExceptionUtil;

public class Main {
	
	public static void main(String[] args) {
		Haskal h = new Haskal();
		
		ExceptionUtil.catchEverything(() -> h.onStart());
	}
	
}
