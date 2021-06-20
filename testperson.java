import java.util.*;
class person
{
  String haircolour,eyecolour,skincolour,height,weight;
  person(String h,String e,String s,String he,String w)
  {
        this.haircolour=h;
        this.eyecolour=e;
        this.skincolour=s;
        this.height=he;
        this.weight=w;
  }
  void read()
  {
     System.out.println("Performing read");
  }
  void play()
  {
     System.out.println("Performing play");
  }
  void sleep()
  {
     System.out.println("Performing sleep");
  }
  void walk()
  {
     System.out.println("Performing walk");
  }
  void about()
  {
     System.out.println("Haircolour :"+haircolour+'\n'+"Eyecolour :"+eyecolour+'\n'+"Height :"+height+'\n'+"Weight :"+weight);
  }
}
class testperson
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		person boy=new person("black","black","Fair","5.10 inch","65kg");
		person girl=new person("brown","brown","Milky white","5.4 inch","50 kg");
		System.out.println("Select the person:"+
        	'\n'+"1.Boy"+
        	'\n'+"2.Girl");
        int select=sc.nextInt();
        int option1,option2;
        if(select==1)
        {
        	while(true)
        	{
        		System.out.println("Select the action to be done: "+
        			'\n'+"1.read"+
        			'\n'+"2.play"+
        			'\n'+"3.sleep"+
        			'\n'+"4.walk"+
        			'\n'+"5.About"+
        			'\n'+"6.Exit");
        		option1=sc.nextInt();
        		switch(option1)
        		{
        			case 1:
        			    boy.read();
        			    break;
        			case 2:
        			    boy.play();
        			    break;
        			case 3:
        			    boy.sleep();
        			    break;
        			case 4:
        			    boy.walk();
        			    break;
        			case 5:
        			     boy.about();
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
        		System.out.println("Select the action to be done: "+
        			'\n'+"1.read"+
        			'\n'+"2.play"+
        			'\n'+"3.sleep"+
        			'\n'+"4.walk"+
        			'\n'+"5.About"+
        			'\n'+"6.Exit");
        		option2=sc.nextInt();
        		switch(option2)
        		{
        			case 1:
        			    girl.read();
        			    break;
        			case 2:
        			    girl.play();
        			    break;
        			case 3:
        			    girl.sleep();
        			    break;
        			case 4:
        			    girl.walk();
        			    break;
        			case 5:
        			     girl.about();
        			     break;
        			case 6:
        			     System.exit(0);
        			default :
        			     System.out.println("Wrong input try again");
        			     break;
        		}

        	}	
        }
        else
        {
        	System.out.println("Invalid input");
        }
		
	}
}