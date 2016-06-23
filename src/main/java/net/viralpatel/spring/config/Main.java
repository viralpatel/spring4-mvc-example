package net.viralpatel.spring.config;

public class Main {

	public static void main(String[] args) {
		sing(1);
	}

	public static void sing(int num) {
		if (num == 100)
			return;
		
		sing(num + 1);
		
        System.out.println(num + ((num==1) ? " bottle" : " bottles") + " of beer on the wall, " 
        				 + num + ((num==1) ? " bottle" : " bottles") + " of beer.");
        System.out.println((num > 1) ? "Take one down and pass it around, " + (num - 1) + 
        				  ((num-1==1) ? " bottle" : " bottles") 
        				  			+ " of beer on the wall." : "No more bottles of beer");
    
	}
}
