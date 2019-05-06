# Ecoli20GUI
Genetic algorithms are methods for representing optimization based upon natural selection. 
Genetic algorithms reach optimizations by modifying populations through trait mutation.
Evolution occurs in genetic programs as children are created and generations are tested against “environmental standards”. 
This program aims to model E coli genetic evolution with the environmental pressure of ampicillin.
This specific case of evolution has been shown in medical testing systems to have horizontal gene transfer rather than typical vertical transfer based on cloning. This project is based on a class of colonies in a specialized plasmid carrying population, and a driver in which a simple arraylist serves to hold the entire population.


## The colony and BugsDriver files hold the current biologically relevent code. The instance data of the colony class is mutated by the randomized conditions of the BugsDriver interface. These files work together to create a biologically relevent (not entirely accurate) representation of Ecoli's response to ampicilin. 

        * The goal of BugsDriver is to create a program which populates and dispays a JFrame based GUI
        * The goal of colony is to create a program that defines and provides the functionality for an ecoli colony
        * The goal of GUIPrototype is to allow the user some liberty in defining the bounds of the experiment. This provides the user options for the numbers of colonies and antibiotics that will be present in the system. This file sets up the options and layout of the UI
        * The FitnessCalc tests the overall fitness of a colony. This calc is now fairly abritrary and wieghless but when the following uncompleted files are included this will carry more prevelence in the calculation. 
        * (beta)The Algorithm class sets up a binary based crossover method for a tournament and based on competition sets up a solution for fitness tested on byte based genetic material 
        * (beta) The GA class is the implementation class in which the whole genetic material can be tested against a random byte solution 
        * (beta) the population class is only relevant the the algorith in its current state and would be adjusted/deleted when the arraylist format used in BugsDriver can be written 




## Randomization
this program utilizes java's pseudorandom functions in order to create randomizations of bug classes. Theroretically, this could cause problems when the program is run for extended periods of time. However, this was ruled out as a concern for the current bugs limit the functional runtime of the program. Also, the randomization of the location of offspring and the plasmid transfer (which I wrote) would be the first things to fix if randomization is an actual issue. 

## Unimplemented Features
The current system evolves only on plasmid transfer. This is unlike actual biology in which whole DNA sets also provide for mutations. The unused GA and population classes in addition to the FitnessCalc class which is currently not being used to its full functionality are the beggining of solving this issue. These classes set up the larger genetic material of a bug and allow it to have prevelence over the plasmid resistance as well. Also, the field is drawn in such a manner where resource dependence could be used but it is not currently implemented. This feature is already written into the UI question form but loops and tests on prevelence and reproduction need to be written to complete this feature. 

### Getting Started 
This code can be downloaded and run in any java compatable system. The code was written in IntelleJ but other formats could also be appropriate. 
for infomation on how to download and run intelleJ
the community version is availible here: https://www.jetbrains.com/help/idea/installation-guide.html
reference this video if you need help:
https://www.youtube.com/watch?v=upQu_brz7OI
