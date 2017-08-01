package com.trello.prime;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("sayý giriniz:");
		int number=s.nextInt();
		if(number>=2){
		FunctionsForPrime ffp=new FunctionsForPrime();
		for(int i=2;i<=number;i++){
		ffp.isPrime(i);
		}
		}
	}

}
