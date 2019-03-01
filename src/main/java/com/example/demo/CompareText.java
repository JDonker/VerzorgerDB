package com.example.demo;

public class CompareText {
	
	static int compare(String n1,String n2) {

	char c1;
	char c2;
	
	// per char checken
	for(int i=0;i<Math.min(n1.length(), n2.length());i++) {
		c1=n1.charAt(i);
		c2=n2.charAt(i);
		
		if(c1==c2) {
				continue;
		}else if (c1>c2) {
				return 1;
		}
			return -1;
	}
	
	// chars zijn gelijk baseren op lengte
	if(n1.length()==n2.length())
		return 0;
	
	if(n1.length()>n2.length()) 
		return 1;
				
	
	return -1;
	}

}
