import java.util.*;
public class Main2 {
public static int sumOfPrime(int input1[],int input2)
{
List<Integer> al=new ArrayList<Integer>();
List<Integer> ls=new ArrayList<Integer>();
int sum=0,count=0,c=0;
for(int i=0;i<input2;i++)
{
count=0;
for(int j=1;j<=input1[i];j++)
{
 if(input1[i]%j==0)
 {
 count++;
 }
}
if(count==2)
{
al.add(input1[i]);
c++;
}
}
if(c==0)
{
for(int a=0;a<input1.length;a++)
ls.add(input1[a]);
for(int z:ls)
sum=sum+z;
//sum=sum-Collections.min(ls);sum=sum-Collections.max(ls);
}
else
{
for(int k:al)
sum=sum+k;
//sum=sum-Collections.min(al);sum=sum-Collections.max(al);
}
return sum;
}
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int input2;
input2=sc.nextInt();
int input1[]=new int[input2];
for(int i=0;i<input2;i++)
input1[i]=sc.nextInt();
System.out.println(Main2.sumOfPrime(input1,input2));
}
}