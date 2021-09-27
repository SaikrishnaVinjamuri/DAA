/*package whatever //do not write package name here */

import java.util.*;

class pair{
	public int max , min ;
	public pair(int max,int min){
		this.max  = max;
		this.min = min;
	}
}

public class MaxMinArray2 {

	public static void Divide(int a[] , int left , int right , pair p){
		if(left==right){
			if(p.max <a[left])
				p.max = a[left];
			if(p.min > a[right])
				p.min = a[right];
			return ;
		}
		if(right-left == 1)
		{
			if(a[left] < a[right]){
				if(p.min>a[left])
					p.min = a[left];
				if(p.max < a[right])
					p.max = a[right];
			}
			else{
				if(p.max<a[left])
					p.max = a[left];
				if(p.min>a[right])
					p.min = a[right];
			}
			return;
		}
		int mid = (left+right)/2;
		Divide(a , left , mid , p);
		Divide(a , mid+1 , right , p );
			
	}

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0 ; i<n ; i++)
			a[i] = sc.nextInt();
		pair p = new pair(Integer.MIN_VALUE , Integer.MAX_VALUE);
		Divide(a,0,a.length-1,p);
		System.out.println("maximum : "+p.max+" , minimum : "+p.min);
	}
}
























