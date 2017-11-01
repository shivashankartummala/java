package com.sstummala.codingproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecretCouponCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<String>> codes1 = new ArrayList<List<String>>();
		codes1.add( Arrays.asList("apple", "apple"));
		codes1.add(Arrays.asList("banana", "anything","banana"));
		List<String> cart1 = Arrays.asList("banana","apple","apple","grapes","banana","watermelon","banana");
		List<String> cart2 = Arrays.asList("banana","watermelon","banana","banana","apple","apple","grapes");
				
		
		List<List<String>> codes2 = new ArrayList<List<String>>();
		codes2.add( Arrays.asList("apple", "apple"));
		codes2.add(Arrays.asList("banana", "orange","banana"));
		List<String> cart3 =  Arrays.asList("banana","apple","apple","grapes","banana","orange","banana");
		List<String> cart4 =  Arrays.asList("apple","cherries","apple","grapes","banana","orange","banana");
		
		
		System.out.println("cart1: " +isWinner(codes1,cart1));
		System.out.println("cart2: " +isWinner(codes1,cart2));
		System.out.println("cart3: " +isWinner(codes2,cart3));
		System.out.println("cart4: " +isWinner(codes2,cart4));
		

	}
	
	public static boolean isWinner(List<List<String>> codes, List<String> shoppingcart){
		boolean flag=false;
		int count=0;
		int total=0;
		int index=0;
		
		String[] shopcart = shoppingcart.toArray(new String[shoppingcart.size()]);
		
		for(List<String> cc : codes){
			String[] curcode = cc.toArray(new String[cc.size()]);
			total+=cc.size();
			int curcount =0;
			
			for(int j=0;index<shopcart.length && j<curcode.length;){
				if(shopcart[index].equals(curcode[j]) || curcode[j].equals("anything")){
					System.out.println(shopcart[index] + ":" +curcode[j]);
					index++;
					j++;
					curcount++;					
				}else if(j==0){
					index++;
				}else{
					j++;
				}
			}
			count+=curcount;
			
		}
		
		System.out.println("count:"+count +"; total:"+total);
		if(count>=total) return true;
		else return flag;
		
	}

}
