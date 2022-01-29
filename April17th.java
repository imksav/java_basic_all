public class April17th{
    public static void main(String[] args) {
        int myNum = 6;
        String str1 = "sunway";
        int convertedAsciNew;        System.out.println("Given: " +str1);
        for(int i = 0; i <= str1.length()-1; i++){
            int convertedAsci = str1.charAt(i);
         
            convertedAsciNew = (int)(convertedAsci+myNum);
          
           if(convertedAsciNew >= 97 && convertedAsciNew <= 122){
            
            System.out.print((char)convertedAsciNew);
           }
           else{
            System.out.print((char)(convertedAsciNew-26));
           }
       }
       
    }
}