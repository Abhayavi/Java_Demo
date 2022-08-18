class Bike{
void run(){
System.out.println("running");
}
}
class Honda extends Bike{
void run(){

System.out.println("speed is 60km");
}
}
class Poly{
public static void main(String args[]){
Bike st=new Honda();
st.run();
}
}