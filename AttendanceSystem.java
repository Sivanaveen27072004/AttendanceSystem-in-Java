import java.util.*;
class Student
{
void newattandance()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Roll.no");
int opt=sc.nextInt();
switch(opt)
{
case 132:
          System.out.println();
          System.out.println("****************************************");
          System.out.println();
          int count=0;
          System.out.println("Choose below Option");
          System.out.println("1.Enter Today Attantance");
          System.out.println("2.Check The Total Days Present");
          int choise=sc.nextInt();
          if(choise==1)
          {
           System.out.println(count);
           System.out.println("Put 1 to today Attanence ");
           int today=sc.nextInt();
           count=count+1;
           System.out.println(count);
          
           break;
           }
           else if(choise==2)
           {
            System.out.println(count);
            break;
            }
            else
           System.out.println("Enter the valid option");
           
case 117: 
          System.out.println();
          System.out.println("****************************************");
          System.out.println();
          int count1=0;
          System.out.println("Choose below Option");
          System.out.println("1.Enter Today Attantance");
          System.out.println("2.Check The Total Days Present");
          int choise1=sc.nextInt();
          if(choise1==1)
          {
           System.out.println("Put 1 to today Attanence ");
           int today1=sc.nextInt();
           count1++;
           break;
           }
           else if(choise1==2)
           {
            System.out.println(count1);
            break;
            }
            else
           System.out.println("Enter the valid option");
           
default:
          System.out.println("Enter your RollNo properly");
}
}
}
class Staff
{
void display(){
System.out.println("you are in Staff");
}
}
class Hod
{
void display(){
System.out.println("You are in Hod");
}
}
class Principal
{
void display(){
System.out.println("you are in Admin");
}
}
public class AttanenceDeriver
{
public static void main(String [] args)
{
Student s=new Student();
Staff t=new Staff();
Hod h=new Hod();
Principal p=new Principal();

while(true){
System.out.println();
System.out.println("****************************************");
System.out.println();
System.out.println("-------------Welcome to Attandance System-------------");
System.out.println("1.Principal");
System.out.println("2.HoD");
System.out.println("3.Staff");
System.out.println("4.Student");
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Option");
int Opt=sc.nextInt();
switch(Opt)
{
case 1:
p.display();
break;
case 2:
h.display();
break;
case 3:
t.display();
break;
case 4:
s.newattandance();
break;
default:
System.out.println("Enter the valid number");     
}
}
}
}
