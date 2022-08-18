class ReverseString2{
public static void main(String args[]){
String s="My name is abhay kumar";
char ch;
 String nstr="";
 for(int i=0;i<s.length();i++){
    ch=s.charAt(i);
nstr=ch+nstr;
}
System.out.println("reverse string is :"+nstr);
}
}