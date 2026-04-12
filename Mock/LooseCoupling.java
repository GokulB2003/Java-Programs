import java.util.*;
class Charger//parent class madhe method declare karavi laagtech
{
	public void charge()
	{
		System.out.println("charger parent class:");
	}
}
class Vivo extends Charger
{
	public void charge()
	{
		System.out.println("vivo");
	}
}
class Samsung extends Charger
{
	public void charge()
	{
		System.out.println("Samsung");
	}

}
class Mobile
{
	public void scharge(Charger c)
	{
		c.charge();
	}
}
public class LooseCoupling
{
	public static void main(String argsp[])
	{
		Charger c=new Charger();
		Charger s=new Samsung();
		Mobile m=new Mobile();
		m.scharge(s);
		

	}
}
	