public class hollowjava{
    public static void main(String args[]){
        hollow_rectangle(4,5 );
    }
    public static void hollow_rectangle(int totalrows,int totalcolumns){
      //outer loop
      for(int i=1;i<=totalrows;i++){
        //inner loop
        for(int j=1;j<=totalcolumns;j++){
            if(i==1 || i==totalrows || j ==1 ||j== totalcolumns){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
           
        }
        System.out.println();
      }
    }
    
}