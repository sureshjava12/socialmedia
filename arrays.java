import java.util.Scanner;
class Example{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int size=s.nextInt();
//int a[]={30,60,90};
int a[]=new int[size];
a[0]=40;
a[1]=50;
a[2]=60;
a[3]=70;
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
//System.out.println(a[3]);
System.out.println("with Loop");
//with loops
//arrayname.length
for(int i=0;i<a.length;i++)
System.out.println(a[i]);

System.out.println("with foreach Loop");
for(int num:a){
System.out.println(num);
}


}


}