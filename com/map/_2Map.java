package com.map;

import java.util.HashMap;
import java.util.Map;

public class _2Map {

	public void mapOperation() {
		Map<String, String> names = new HashMap<>();
		names.put("A", "1");
		names.put("C", "2"); // fix for issue in bugfix 
		System.out.println(names);
	}

}
