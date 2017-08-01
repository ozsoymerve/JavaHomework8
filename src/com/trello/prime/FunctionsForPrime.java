package com.trello.prime;

public class FunctionsForPrime {

	public boolean isPrime(int number){
		int counter=0;
		for(int i=2;i<number;i++){
			int remender=number%i;
			if(remender==0){
				counter++;
			}
		}
		if(counter==0){
			System.out.println(number+"asaldýr");
		}
		
		
		return true;
	}
}

