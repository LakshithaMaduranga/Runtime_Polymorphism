public class AppInitializer {
    public static void main(String[] args) {
        Sport mySport;

        mySport= new Football();
        mySport.play();
        mySport= new Basketball();
        mySport.play();

        mySport= new Rugby();
        mySport.play();
    }
}
