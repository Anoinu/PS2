package base;
import java.util.Scanner;
public class MyInteger {
	private int iValue;
	
	public int getiValue(){
		return iValue;
	}
	public boolean isEven(){
		if (iValue%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isOdd(){
		if (iValue%2==1){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isPrime(){
		boolean exist=false;
		if (iValue==2){
			return true;
		}
		for(int i=2;i<=iValue;i++) {
			if (iValue%i==0){
				break;
			};
			if(i>= 1/2 * iValue){
				exist = true;
				break;
			};
		}
		return exist;
	}
	public static boolean isEven(int a){
		if (a %2==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isOdd(int b){
		if ( b % 2==1){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isPrime(int c){
		boolean exist=false;
		if (c==2){
			return true;
		}
		for(int i=2;i<=c;i++) {
			if (c%i==0){
				break;
			};
			if(i>= 1/2 * c){
				exist = true;
				break;
			};
		}
		return exist;
	}
}

