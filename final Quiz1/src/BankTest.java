public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b1= new HSBC(null);
		System.out.println("HSBC Interest : "+b1.getRateOfInterest());

Bank b2=new BRAC(null);
System.out.println("BRAC Interest: "+b2.getRateOfInterest());

}
}