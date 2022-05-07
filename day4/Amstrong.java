package week1.day4;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=153 ;
int calculate,remainder,original=0;
calculate=number;
while (calculate<=0)
{
	 
	remainder=calculate%10;
	original=original+remainder*remainder*remainder;
	calculate/=10;
}
if(original==number)
	System.out.println(number+"is a Amstrong number.");
else
	System.out.println(number+"is not a Amstrongnumber.");
	}
	
}
