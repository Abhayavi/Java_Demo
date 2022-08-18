


  
class StringReverse1 {
    public static void main (String[] args) {
        
        String str= "Geks.";
     String nstr="";
String dm="";
String pf="";
        char ch;
       

        
      System.out.print("Original word ");
      System.out.println("Geeks"); //Example word
        
     
      for (int i=0; i<(str.length()); i++)
      {
        ch= str.charAt(4); //extracts each character
        nstr=ch+nstr;
break;
}


 for (int i=0; i<(str.length()-1); i++)
      {
        ch= str.charAt(i); //extracts each character
        dm=ch+dm;
       pf=dm+nstr;
        
}
      System.out.println("Reversed word: "+ pf);
    }
}