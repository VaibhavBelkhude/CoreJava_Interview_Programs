package com.nt.inheritance;

public class TestP {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			
	//for(int j=0; j<5; j++){ //only thin one change
				/**
	======================================
	 $ 
     $ $ 
     $ $ $ 
     $ $ $ $ 
     $ $ $ $ $ 
   ======================================
				 * 
				 */
			//for(int j=5-i; j>1; j--) {
			 //only this one change
				for(int j=0; j<5-i; j++) {
			
				/**
	======================================
				  $ 
                 $ $ 
                $ $ $ 
               $ $ $ $ 
              $ $ $ $ $
    ======================================            
				 */
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				//for(int k=0; k<=j; k++) {
				System.out.print("$ ");
			}
			System.out.println();
		}

	}

}
