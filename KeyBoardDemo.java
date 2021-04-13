package BrickBreaker;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author SADIQ SHAIKH
 */
public class KeyBoardDemo 
{
    public static int Value;
    public static void main(String[] args)
    {
        JFrame f= new CenteredFrame("Brick Breaker Game By Sadiq Shaikh", 1, 1);
        f.setResizable(false);
        f.add(new GamePanel(Value));
        f.setVisible(true);
    }
}
