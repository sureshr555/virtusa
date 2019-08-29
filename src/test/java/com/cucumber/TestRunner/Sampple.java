package com.cucumber.TestRunner;

public class Sampple {

	public static void main(String[] args) {

		int num1[]={1,10,3,4,5,2};
		int num2[]={1,6,7,8,5};	
		int max=num1[0];
		
		
		System.out.println("===ASCENDING========");
		for (int i = 0; i < num1.length; i++) {
			
			if(max>=num1[i])
			{
			
				System.out.println(num1[i]);
			}
		}
		
			
		System.out.println("===max========");
		for (int i = 0; i < num1.length; i++) {
			
			if(max<=num1[i])
			{
				max=num1[i];
			}
		}
				System.out.println(max);
		
	
		System.out.println("===min========");
		int temp=num1[0];
		for (int i = 0; i < num1.length; i++) {
			
			if(temp>=num1[i])
			{
				temp=num1[i];
			}
		}
				System.out.println(temp);
		
	
		System.out.println("===sum========");


int sum=0;
for (int i = 0; i < num2.length; i++) {
	sum=sum+num2[i];
	
	
}
System.out.println(sum);
System.out.println("=====duplicate======");

for (int i = 0; i < num1.length; i++) {
	
	
	for (int j = 0; j < num2.length; j++) {
	
		if(num1[i]==num2[j])
		{
			System.out.println(num2[j]);
			
		}
}
}}}