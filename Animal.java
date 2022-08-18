class Main{
public void eat(){
System.out.println("bark");
}
}
class Dog extends Main{
public void eat(){
System.out.println("eating");
}
}
class Animal{
public static void main(String args[]){
Main an=new Dog();
an.eat();
//System.out.println("result"+an);
}
}