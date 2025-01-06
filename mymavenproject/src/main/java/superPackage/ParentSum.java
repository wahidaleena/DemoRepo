package superPackage;
import java.util.*;

public class ParentSum {


int c;
public int sum() {
Scanner num1=new Scanner(System.in);
System.out.println("Enter the first number");
int n1=num1.nextInt();
Scanner num2=new Scanner(System.in);
System.out.println("Enter the second number");
int n2=num2.nextInt();
int a=10,b=20;
c=n1+n2;
System.out.println("Sum is "+c);
return c;
}

}
