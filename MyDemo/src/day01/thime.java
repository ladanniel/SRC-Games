package day01;
//统考一，第五题；

import java.util.Arrays;



public class thime {
         public static void main(String[] args) {
			
		}
         public static void f(int n) {
			if (n<1000||n>9999) {
				return;
			}
			int[]arr = new int[4];
			for (int i = 0; i < arr.length; i++) {
				arr[arr.length-1-i]=(n%10+5)%10;
				n/=10;
				
			}
			System.out.println(Arrays.toString(arr));
		}
                                                                                  //换位过程类似冒泡排序
         
}
