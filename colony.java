import java.awt.*;
import java.util.Random;

/**
 * Name: Izzy Hurley
 * Lab Name: colony
 * Lab Purpose: The goal of colony is to create a program that defines and provides the functionality for an ecoli colony
 * Date: 4/19/19
 * Collaborators: None
 * ON MY HONOR: IH
 */

public class colony {
    Random r = new Random();
    static int defaultGeneLength = 64;
    //location
    public int x;
    public int y;
    public Point location = new Point(x,y);
    //copy number for the COE plasmids
    public int copyNum;
    //calculation of fitness stored
        //created off an arbitrary solution constant
    private int fitness;
    //genes represented in a byte array so comparison and swap is easy
    private byte [] genes = new byte[defaultGeneLength];

    public byte getGene(int index) {
        return genes[index];
    }

    public void setGene(int index, byte value) {
        genes[index] = value;
        fitness = 0;
    }

    /* Public methods */
    public int size() {
        return genes.length;
    }


    //return the fitness of a colony
    public int getFitness() {
        if (fitness == 0) {
            fitness = FitnessCalc.getFitness(this);
        }
        return fitness;
    }

//empty constructor
// colony at the
    public colony(){
        x =354;
        y = 354;
        copyNum = 0;
    }

    public colony(int x, int y, int cn){
        setX(x);
        setY(y);
        setCopyNum(cn);

    }

    public void setCopyNum(int copyNum) {
        this.copyNum = copyNum;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getCopyNum() {
        return copyNum;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


//reproduce at a uniform rate in a random direction
    public colony reproduce(){
        boolean up = r.nextBoolean();
        boolean right = r.nextBoolean();
        int lr =0;
        int ud =0;
        if (up) ud = 7;
        else ud = -7;

        if (right) lr = 7;
        else lr = -7;
       return new colony(this.getX()+lr,this.getY() +ud,this.getCopyNum());
   }
// this is the transfer of plasmids
   public boolean htransfer(colony c){
       if (c.getCopyNum() > 2){
           if (r.nextInt(100)<=50)this.copyNum+=(c.getCopyNum()/2);  return true;}//will truncate
       //the 5% rate is derived from this article https://www.sciencedirect.com/topics/neuroscience/horizontal-gene-transfer
    return false;
   }



}
