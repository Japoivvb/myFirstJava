package worldcup;


/**
 *  Class for Defender player. Extends Player Class.
 *
 */
public class Defender extends Player{

    /** indicates whether a defender is currently marking another player */
    boolean mark;

    /**
     * Sends the defender to steal the ball
     *
     * @param ball
     */
    public void steal(Ball ball){
        System.out.println("steal ball");
    }


}
