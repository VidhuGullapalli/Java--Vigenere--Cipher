
/*
/   Vigenere class
/    Implement the class to include the methods exactly
/    as described in the comments.
/   Do not add any additional instance variables
/
*/


class Vigenere
{
   // declare instance variables for text and keyword
   private String plainText;
   private String key;

   // default constructor
   public Vigenere ()
   {
	plainText="";
    key="";
   }
    
   // initialization constructor
   public Vigenere (String theMsg,String theKey)
   {
    plainText=theMsg;
     key=theKey;
   }
    
   // modifier method for plainText
   public void setPlainText(String t){
    plainText=t;
   }
    
   // modifier method for key
   public void setKey(String k){
     key=k;
   }
    
   // accessor method for plainText
    public String getPlainText(){
      return plainText;
    }
    
   // accessor method for key
   public String getKey(){
     return key;
   }
    
   // encrypt method
   //   return a String
   //   no parameters
   public String encrypt()
   {
       String w="";
       String q="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String r="";
       int i=0;
       while (w.length()<plainText.length()){
         w+=key.charAt(i%key.length());
         i++;
       }
      for(int u=0; u<plainText.length();u++){
        r+=(char)(((((plainText.charAt(u)-'A')+(w.charAt(u)-'A'))% 26))+'A');
      }
     return r;
   }
   
    
   // decrypt method
   //   return a String
   //   no parameters
   public String decrypt()
   {
       String w="";
       String q="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String r="";
       int i=0;
       while (w.length()<plainText.length()){
         w+=key.charAt(i%key.length());
         i++;
       }
      for(int j=0; j<plainText.length();j++){
        r+=(char)((((plainText.charAt(j)-'A')-(w.charAt(j)-'A'))+26)% 26);
      }
     return r;
   }   
   
   // equals method
   //   return a boolean
   //   Vigenere reference parameter
   public boolean equals(Vigenere vigen)
  {
 if((this.plainText).equals(vigen.getPlainText())&&(((this.key).equals((vigen.getKey()))))){
   return true;
 }
else{
  return false;
}

   }   
   
   // toString() method
   public String toString()
   {
        return("plain Text     = " + plainText + "\nkey            = " + key + "\nencrypted Text = " + encrypt());     
   }
    
}
