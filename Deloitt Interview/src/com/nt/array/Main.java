package com.nt.array;

public class Main {

	public static void main(String[] args) {
		int [] intary= {11,12,22,22,75,66,75,99};
		int no=22;
		int k=0;
		boolean found=false;
		for(; k<intary.length;k++) {
			if(intary[k]==no) {
				found=true;
				break;
			}//if
		}//for
		if(found) {
			System.out.println("Found the no:"+no+"At index at:"+k);
		}//if
		else {
			System.out.println(no+"not found in the array");
		}
     //Output:
		/**
		 * Found the no:22At index at:2
		 */
	}

}
