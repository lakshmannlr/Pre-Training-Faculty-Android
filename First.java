class Person
{
   public String name;
   public String address;
   public Person(String n,String a)
   {
     name=n;
     address=a;
   }
   public String getAddress( )
   {
     return address;
   }

public String getName( )
   {
     return name;
   }
public void setAddress(String a)
{
  address=a;
}
public String toString()
{
  String n="hi"+this.getName()+"\t"+this.getAddress();
  return n;
}
}


class Student extends Person
{
String program;
int year;
double fee;
public Student(String s,String a,String p,int y,double f)
{
  super(s,a);
  program=p;
  year=y;
  fee=f;
}
public String getProgram()
{
return program;
}
public void setProgram(String p)
{
   
 program=p;
}
public int getYear()
{
return year;
}
public void setYear(int y)
{year=y;}
public double getFee()
{
return fee;
}
public void setFee(double f)
{
  fee=f;
}
public String toString()
{
  String n=this.getName()+"\t "+this.getAddress()+"\t"+this.getProgram()+"\t"+this.getYear()+"\t"+this.getFee();
  return n;
}


}

class Staff extends Person
{
  String school;
  double pay;
  public Staff( String n, String a,String s,double p)
{ 
  super(n,a);
  school=s;
  pay=p;
}
public String getSchool()
{
   return school;
}
public void setSchool(String s)
{
  school=s;
}
 public double getPay()
{
  return pay;
}
public void setPay(double p)
{
  pay=p;
}
public String toString()
{
  String n=this.getName()+"\t"+this.getAddress()+"\t"+this.getSchool()+"\t"+this.getPay();
  return n;
}

}

class First
{
  public static void main(String args[])
  {

    Person p=new Person("Ramesh","nbkrist");
    Staff s1=new Staff("Mahesh","nbkrist","cse",49000);
    Student s2=new Student("Sachin","Nbkrist","cse",2014,69000);
    System.out.println(p.toString());
    System.out.println(s1.toString());
    System.out.println(s2.toString());
 }
}
