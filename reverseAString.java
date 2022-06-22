class reverseAString{
    public static void main(String args[]){
        String str = "hello java" , emstr="";
        char ch;
        for(int i=str.length()-1; i>=0; i--){
            ch=str.charAt(i);
            emstr+=ch;
        }  
     System.out.println(emstr);
  }
}