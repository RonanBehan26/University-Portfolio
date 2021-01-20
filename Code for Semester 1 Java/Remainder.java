/*
*Title: Remainder
*Author: R.
*Date: 6/10
*/

public class Remainder{
 //data members
 private int x;
 private int y;
 private int a;
 private int b;
 private int c;


 //constructor
 public Remainder(){
	 x = 0;
	 y = 0;
	 a = 0;
	 b = 0;
	 c = 0;

 }

 //set method
 public void setX(int x){
	 this.x = x;
 }

 public void setY(int y){
 	 this.y = y;
 }

 //compute
 public void compute(){
	 a = x-y;
	 b = (x-y)*12;
	 c = (x-y)*120;
 }

 //get method
 public int getA(){
	 return a;
 }

 public int getB(){
 	 return b;
 }

 public int getC(){
 	 return c;
 }
}

