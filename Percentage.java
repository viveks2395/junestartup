package automat;

public  class Percentage {
	public static void main(String[] args) {
	double sub1= 35;
	double sub2= 34;
	double sub3= 35;
	double per= (sub1+sub2+sub3)*100/(3*100);

	
		if (per>=60)
		{
			System.out.println("first class");
		}
		else if(per>=50) {
			System.out.println("second class");	
		}
		else if(per>=35) {
			System.out.println("third class");
		}
		else {
			System.out.println("fail");
		}
	}

}
