import java.util.*;
public class Stringop
{
public static void main(String args[])
{
	String sa="A";
	sa=sa.concat("B");
	String sb="c";
	sa=sa.concat(sb);
	sa.replace('c','D');
	sa=sa.concat(sb);
	System.out.println(sa);
}	
}