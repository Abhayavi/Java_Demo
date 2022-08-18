class Parent{

public  void print(){

System.out.println("I am in parent");

}

}

class Child extends Parent{

public  void print(){

System.out.println("I am in child");

}

}

class Main{

public static void main(String[] args){

Parent p=new Parent();

p.print();

}

}