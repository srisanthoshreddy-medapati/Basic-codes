import java.util.*;
class phone 
{
	static Scanner sc=new Scanner(System.in);
	double width,height;
	String os,brand,price;
	phone(double w,double h,String o,String b,String p)
	{
		this.width=w;
		this.height=h;
		this.os=o;
		this.brand=b;
		this.price=p;
	}
	void call()
	{
        System.out.println("Enter the contact you want to call:");
        String call=sc.nextLine();
        System.out.println("Calling "+call);
	}
	void sendMessage()
	{ 
        System.out.println("Sending message...");
	}
	void browser()
	{
        System.out.println("Opening the browser...");
	}
	void share()
	{
        System.out.println("Started Sharing....");
	}
	void about()
	{
		System.out.println("Width :"+width+'\n'+"Height :"+height+'\n'+"OS :"+os+'\n'+"Brand :"+brand+'\n'+"Price :"+price);
	}
    
}
class mobile
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		phone Samsunggalaxys4=new phone(6.98,13.6,"Android","Samsung","1000$");
		phone iphone=new phone(5.86,12.3,"IOS","Apple","1200$");
        System.out.println("Select the phone you want to use :"+
        	'\n'+"1.Samsung galaxy S4"+
        	'\n'+"2.Iphone");
        int select=sc.nextInt();
        int option1,option2;
        if(select==1)
        {
        	while(true)
        	{
        		System.out.println("Select the function you want to use: "+
        			'\n'+"1.call"+
        			'\n'+"2.Sendmessage"+
        			'\n'+"3.Browser"+
        			'\n'+"4.share"+
        			'\n'+"5.About device"+
        			'\n'+"6.Exit");
        		option1=sc.nextInt();
        		switch(option1)
        		{
        			case 1:
        			    Samsunggalaxys4.call();
        			    break;
        			case 2:
        			    Samsunggalaxys4.sendMessage();
        			    break;
        			case 3:
        			    Samsunggalaxys4.browser();
        			    break;
        			case 4:
        			    Samsunggalaxys4.share();
        			    break;
        			case 5:
        			     Samsunggalaxys4.about();
        			     break;
        			case 6:
        			     System.exit(0);
        			default :
        			     System.out.println("Wrong input try again");
        			     break;
        		}

        	}
        }
        else if(select==2)
        {
             while(true)
        	{
        		System.out.println("Select the function you want to use: "+
        			'\n'+"1.call"+
        			'\n'+"2.Sendmessage"+
        			'\n'+"3.Browser"+
        			'\n'+"4.share"+
        			'\n'+"5.About device"+
        			'\n'+"6.Exit");
        		option2=sc.nextInt();
        		switch(option2)
        		{
        			case 1:
        			    iphone.call();
        			    break;
        			case 2:
        			    iphone.sendMessage();
        			    break;
        			case 3:
        			    iphone.browser();
        			    break;
        			case 4:
        			    iphone.share();
        			    break;
        			case 5:
        			     iphone.about();
        			     break;
        			case 6:
        			     System.exit(0);
        			default :
        			     System.out.println("Wrong input try again");
        			     break;
        		}

        	}	
        }
	}
}