import com.sun.tools.internal.xjc.reader.xmlschema.BindYellow;
import javafx.scene.shape.Circle;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Point;
import java.io.*;



/**
 * Name: Izzy Hurley
 * Lab Name: BugsDriver
 * Lab Purpose: The goal of BugsDriver is to create a program which populates and dispays a JFrame based GUI
 * Date: 1/8/19
 * Collaborators: None
 * ON MY HONOR: IH
 */

public class BugsDriver extends JPanel{
    //initial variables
    static int sAnti =0;
    ArrayList <Point> antiLoco = new ArrayList<>();
    static int sCol;
   static boolean rR;
   //keep track of number of runs
static int iterator = 0;
   static ArrayList<colony> colonies = new ArrayList<>();
   public ArrayList populate(int col){

Random r = new Random();

// create the colonies
ArrayList<colony> colonies = new ArrayList();
       for (int i = 0; i< col; i++){
           Point p = new Point();
           int x = (r.nextInt(700));
           int y = (r.nextInt(700));
           p.setLocation(x,y);

//insure the bugs are within the dish
           if(p.distance(new Point(354,354)) < 350) {

               colonies.add(new colony(x,y,r.nextInt(4)));}
//if the random does not intitial in  then run again
           else {i--;}

       }
       return colonies;
   }
        public static void main(String[] args) throws InterruptedException {

            ArrayList userData = GUIPrototype.runPopup();

            //process data type for the number of antibiotics
            if (userData.get(0).equals("One")) {
                sAnti = 1;
            } else if (userData.get(0).equals("Two")) {
                sAnti = 2;
            } else if (userData.get(0).equals("Three")) {
                sAnti = 3;
            } else if (userData.get(0).equals("Four")) {
                sAnti = 4;
            } else if (userData.get(0).equals("Five")) {
                sAnti = 5;
            }

//old code
            //because it is a textbox precautions must be taken
            // String t2n = (String)userData.get(1);

            //for (int i =0; i<t2n.length(); i++){
            //    sCol += sCol*10 + (int)t2n.charAt(i);
            //  }

            //Here is some bad syle but after the object declaration was giving incorrect numbers of bugs brute force will be used until further notice
//process data for the number of colonies
            if (userData.get(1).equals("10")) {
                sCol = 10;
            } else if (userData.get(1).equals("20")) {
                sCol = 20;
            } else if (userData.get(1).equals("30")) {
                sCol = 30;
            } else if (userData.get(1).equals("40")) {
                sCol = 40;
            } else if (userData.get(1).equals("50")) {
                sCol = 50;
            }
            if (userData.get(1).equals("60")) {
                sCol = 60;
            } else if (userData.get(1).equals("70")) {
                sCol = 70;
            } else if (userData.get(1).equals("80")) {
                sCol = 80;
            } else if (userData.get(1).equals("90")) {
                sCol = 90;
            } else if (userData.get(1).equals("100")) {
                sCol = 100;
            }

          //  System.out.println(sCol);
            boolean rR = (Boolean) userData.get(2);

            //create the jframe
            JFrame frame = new JFrame("Animals");
            BugsDriver jDriver = new BugsDriver();
            frame.add(jDriver);


            frame.setSize(1000, 1000);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            frame.setSize(1000, 1000);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




            int counter = 0;
            while (true) {

                //redraw so we can account for life and death
                jDriver.repaint();
                Thread.sleep(200); //waits a bit before re-running
               counter++;}
   }
                //populate bugs function
                //for (int i = 0; i< GUIPrototype.getNumber());}



    public void paint(Graphics g) {

        Random r = new Random();
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        //color the resource discs
        Color changeColor5 = new Color(166, 215, 227);
        //1
        g2d.setColor(new Color(34, 179, 227));
        g2d.fillOval(0, 0, 707, 707);
        //2
        g2d.setColor(new Color(69, 185, 227));
        g2d.fillOval(104, 104, 500, 500);
        //3
        g2d.setColor(new Color(105, 191, 227));
        g2d.fillOval(177, 177, 354, 354);
        //4
        g2d.setColor(new Color(132, 210, 227));
        g2d.fillOval(229, 229, 250, 250);

        g2d.setColor(new Color(166, 215, 227));
        g2d.fillOval(265, 265, 177, 177);

        g2d.setColor(Color.BLACK);
        for (int i = 0; i < sAnti +1; i++){
            if (i == 0|| i ==2 || i == 4) {g2d.fillRect(350 - (i*50), 350- (i*50), 10, 10);
            antiLoco.add(new Point(350 - (i*50), 350- (i*50)));}
            else {g2d.fillRect(350+((i-1)*50), ((i-1)*50)+350, 10, 10);
                antiLoco.add(new Point(350+((i-1)*50), ((i-1)*50)+350));}

        }
        //previous antibiotic (baseline 4)
        // g2d.fillRect(200, 200, 15, 15);
        //  g2d.fillRect(500, 200, 15, 15);
       // g2d.fillRect(200, 500, 15, 15);
       // g2d.fillRect(500, 500, 15, 15);
        if (iterator<1){ colonies = populate(sCol);
         }

        int a = colonies.size()-1;
        for (int i =0; i<a; i++){
            if (colonies.get(i).copyNum < 10) {g2d.setColor(Color.YELLOW);}
          else if (colonies.get(i).copyNum < 30) {g2d.setColor(Color.ORANGE);}
            else if (colonies.get(i).copyNum < 50) {g2d.setColor(Color.RED);}
           else  if (colonies.get(i).copyNum < 70) {g2d.setColor(Color.PINK);}
           else if (colonies.get(i).copyNum < 90 ) {g2d.setColor(Color.MAGENTA);}
            else {
               // System.out.println("copy number = "+ colonies.get(i).copyNum);
                g2d.setColor(Color.black);}




           int x =  colonies.get(i).getX();
           int y =  colonies.get(i).getY();
           if(new Point(x,y).distance(350,350)<350){ //restricted by the dish
           g2d.drawOval(x,y,5,5);


           //checking the antibiotic locations vs copy number futher away you need fewer resistant protiens

           for(int j = 0; j<sAnti; j++){
           if (new Point(x,y).distance(antiLoco.get(j))< 50){
               if (colonies.get(i).copyNum < 70){colonies.remove(i);i--;}
               else if (colonies.get(i).getFitness() < 50){colonies.remove(i);i--;}
           }
               if (new Point(x,y).distance(antiLoco.get(j))< 100){
                   if (colonies.get(i).copyNum < 50){colonies.remove(i); i--;}
                   else if (colonies.get(i).getFitness() < 50){colonies.remove(i);i--;}
               }

               if (new Point(x,y).distance(antiLoco.get(j))< 150){
                   if (i != colonies.size() && colonies.get(i).copyNum < 30 ){colonies.remove(i);}
                   else if (colonies.get(i).getFitness() < 50){colonies.remove(i); i--;}
               }

               if (new Point(x,y).distance(antiLoco.get(j))< 200){
                   if (colonies.get(i).copyNum < 20){colonies.remove(i); i--;}
                   else if (colonies.get(i).getFitness() < 50){colonies.remove(i);i--;}
               }

           }
           //if survive than reproduction is reasonable
           //within a certian distance plasmid transfer calc
           colonies.add(colonies.get(i).reproduce());}
           if ( i!= a && colonies.get(i).location.distance(colonies.get(i+1).location ) < 10 ){colonies.get(i).htransfer(colonies.get(i+1));}
        }
        //g2d.drawOval(354,354,1,1);
//sout num gens
        System.out.println(iterator);
        iterator++;

    }

}
