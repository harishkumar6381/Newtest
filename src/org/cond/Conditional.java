package org.cond;

public class Conditional {
		private void vote() {
			int a = 10;
			if(a<18) {
			System.out.println("candidate is not eligible");
		}
			else		
			System.out.println("candidate is eligible");
			}
		public static void main(String[] args) {
			Conditional c = new Conditional();
			c.vote();
		}
}
