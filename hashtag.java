public class hashtag{
  public static void main(String[] args){
      String input = new Scanner(System.in);
      System.out.println("Enter your comment");
      String comment = input.nextLine();
      int  count = 0;
      for(String cmt: comment.split("")){
        if(cmt.contains("#")){
          count+=1;
          System.out.println(cmt+", ");
       }
     }
     System.out.println("The occurence of the "+count+" hashtags in the user comment are printed above");
   }
 }
