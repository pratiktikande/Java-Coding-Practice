package New_folder;

public class StarPattern {
    public static void main(String[] args) {
        //outerloop For lines
        for(int i=1; i<5; i++){
            //Innner loop
            for(int j=1; j<=i; j++){
                System.out.print("*"); //Printing
            }
            System.out.println();//next line
        }
    }
}
