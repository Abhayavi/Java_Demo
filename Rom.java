class Rom{
public static void main(String args[]){
String str="mohan.";
 String nstr="",mn="";
 String al="";

char ch;

for(int i=0;i<str.length()-1;i++)
{
ch=str.charAt(i);
nstr=ch+nstr;
}
for(int i=0;i<str.length();i++)
{
ch=str.charAt(5);
mn=ch+mn;
break;
}
al=nstr+mn;
System.out.println(""+al);
}
}