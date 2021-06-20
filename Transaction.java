public class Transaction
{
public static void main(String arg[])
{
final Customer c = new Customer();
Thread t1=new Thread()
{
public void run()
{
c.withdraw(15000);
}
};
Thread t2=new Thread()
{
public void run()
{
c.deposit(10000);
}
};
Thread t3=new Thread()
{
public void run()
{
c.withdraw(15000);
}
};
Thread t4=new Thread()
{
public void run()
{
c.deposit(10000);
}
};
t1.start();
t2.start();
t3.start();
t4.start();
}
}
class Customer
{
int amount = 10000;
synchronized void withdraw(int amount)
{

if (this.amount < amount)
{
System.out.println("Available Balance " + this.amount);
System.out.println("About to withdraw " + amount);
System.out.println("Insufficient Balance - Need to deposit.");
try
{
wait();
} catch (Exception e)
{
System.out.println("Interruption Occured");
}
}
this.amount -= amount;
System.out.println("Detected amaount: " + amount);
System.out.println("Balance amount : " + this.amount); }
synchronized void deposit(int amount)
{
System.out.println("About to deposit " + amount);
this.amount += amount;
System.out.println("Available Balance " + this.amount);
System.out.println("Transaction completed.\n");
notify();
}
}