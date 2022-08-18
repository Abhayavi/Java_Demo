 class Vehicle{
void run(){
System.out.println("running");
}
}
class Honda extends Vehicle{
void run(){

System.out.println("speed is 60km");
}
}
class Bike{

public static void main(String args[]){
Vehicle st=new Honda();
st.run();
}
}