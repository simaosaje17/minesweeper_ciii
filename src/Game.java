import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;   // a resizable array.  elements can be added and removed from an ArrayList whenever you want.
import java.util.logging.Level;

public class Game{
    int tilesize ;
    int numRow ;
    int numCol = numRow;
    int boardwidth = numCol * this.tilesize;
    int boardheight = numRow * this.tilesize;


    // making a window for the application
    JFrame frame = new JFrame("Minesweeper");
    JLabel textLable = new JLabel();
    JPanel textPanel = new JPanel();



    public Game(String level) {

        // different size for different level

        if (level.equals("e")) {
            this.tilesize = 70;
            this.numRow = 8;
        }

        // something

        //to avoid multiple checks using else if
        else if (level.equals("m")) {
            this.tilesize = 35;
            this.numRow = 16;
        } else if (level.equals("d")) {
            this.tilesize = 17;
            this.numRow = 20;
        } else System.out.println("unknown");


        // initialization
        //initialized numCol, boardwidth, and boardheight after difficulty is chosen because
        // if i had not done that then column, boardwidth adn board height would always be 0.
        this.numCol = this.numRow; // square board
        this.boardwidth = this.numCol * this.tilesize;
        this.boardheight = this.numRow * this.tilesize;

        frame.setSize(boardwidth, boardheight);
        //frame.setLocation();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
    }
    TEST

}

