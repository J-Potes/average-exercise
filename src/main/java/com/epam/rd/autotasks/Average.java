package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
    	int cant = 0;
    	int sum_n = 0;
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        do {
        	input = scanner.nextInt();
        	if(input != 0) {
        		cant++;
            	sum_n += input;
        	}
        }while(input != 0);
        
        int avr = sum_n/cant;
        System.out.println(avr);
    }

}