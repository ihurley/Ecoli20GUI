/**
 * Name: Izzy Hurley
 * Lab Name: GA
 * Lab Purpose: The goal of GA is to create a program
 * Date: 4/19/19
 * Collaborators: None
 * ON MY HONOR: IH


public class GA {

    public static void main(String[] args) {

        // Set a candidate solution
        FitnessCalc.setSolution("1111000001000000000001100000000001001010000001000000100000001111");

        // Create an initial population
        colony myPop = new colony(50, true);

        // Evolve our population until we reach an optimum solution
        int generationCount = 0;
        while (myPop.getFittest().getFitness() < FitnessCalc.getMaxFitness()) {
            generationCount++;
            System.out.println("Generation: " + generationCount + " Fittest: " + myPop.getFittest().getFitness());
            myPop = Algorithm.evolvePopulation(myPop);
        }
        System.out.println("Solution found!");
        System.out.println("Generation: " + generationCount);
        System.out.println("Genes:");
        System.out.println(myPop.getFittest());

    }
}

 */