import java.util.Scanner;

class ebill{
	private String cno;
	private String cname;
	private double prev;
	private double cur;
	private String type;

	//Constructor
	public ebill(String cno, String cname, String type, double prev, double cur){
		this.cno=cno;
		this.cname=cname;
		this.prev=prev;
		this.cur=cur;
		this.type=type;
	}

	public void getdata(){
		Scanner scanner = new Scanner(System.in);
		Scanner ins = new Scanner(System.in);
		System.out.println("Enter Consumer No: ");
		this.cno = ins.nextLine();

		System.out.println("Enter Consumer Name: ");
		this.cname = ins.nextLine();

		System.out.println("Enter Previous month reading: ");
		this.prev = scanner.nextDouble();

		System.out.println("Enter Current month reading: ");
		this.cur = scanner.nextDouble();

		System.out.println("Enter Connection type: ");
		this.type = ins.nextLine();

		scanner.close();
		ins.close();
	}

	public double calc(){
		double units = cur-prev;
		double amount=0;

		if(type.equalsIgnoreCase("domestic")){
			if(units<=100){
				amount = units;
			}
			else{
				amount = 100;
			}
			units=units-100;
			if(units>100 && units<=200){
				amount += (units*2.5);
			}
			else if(units>200 && units<=500){
				amount += (units*4);
			}
			else if(units>500){
				amount += (units*6);
			}
		}
		else if(type.equalsIgnoreCase("commercial")){
			if(units<=100){
				amount = (2*units);
			}
			else{
				amount = 200;
			}
			units = units-100;
			if(units>100 && units<=200){
				amount += (units*4.5);
			}
			else if(units>200 && units<=500){
				amount += (units*6);
			}
			else if(units>500){
				amount += (units*7);
			}
		}
		return amount;
	}

	public void display(){
		System.out.println("\n\tConsumer No: " + cno);
		System.out.println("\n\tConsumer Name: " + cname);
		System.out.println("\n\tConnection Type: " + type);
		System.out.println("\n\tPrevious Month's Reading: " + prev);
		System.out.println("\n\tCurrent Month's Reading: " + cur);
		System.out.println("\n\tTotal Amount: " + calc());
	}
}

class eb{
	public static void main(String []args){
		ebill bill = new ebill("","","",0,0);
		bill.getdata();
		bill.display();
	}
}
