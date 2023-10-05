class student{
int age;
String Name;

student1(int age, String name) 
{
this.age=age;
this.name=name;
}
public static void main(String args) {
student s = new student(22, PeterParker);
System.out.println("Age: "+s.age);
System.out.println("Name: "+s.Name);
}
}
