package New_folder;

public class InvertedStar {
    public static void main(String[] args) {
        //OutLoop
        for(int line=1; line<=4; line++){
            //Inner Loop
            for(int star=4; star>=line; star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

