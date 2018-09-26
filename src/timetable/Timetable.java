
package timetable;

import java.util.Arrays;


public class Timetable {

    public static void main(String[] args) {
     
       int q=0,z=0; 
       population populations2=new population(genetic_algorithm.population_size).intialisePopulation(q,z);
     
       System.out.println("---------------------------B.E   TIMETABLE-----------------------------------------------");
        printPopulation(populations2);
       
        
         population populations=new population(genetic_algorithm.population_size).intialisePopulation();
       System.out.println("---------------------------T.E   TIMETABLE-----------------------------------------------");
       printPopulation(populations);
   
      population populations1=new population(genetic_algorithm.population_size).intialisePopulation(q);
       System.out.println("---------------------------S.E   TIMETABLE-----------------------------------------------");
      printPopulation(populations1);
       
    }
  
   
    public static void printPopulation(population populations){
    
        System.out.println("-----------------------------------------------------------------------------------------");
        String[] days = new String[] {"MONDAY","TUESDAY","WENSDAY","THURSDAY","FRIDAY","SATURDAY"};
        for(int i=0;i<populations.getChromosome().length;i++)
            System.out.println(days[i]+"            "+Arrays.toString(populations.getChromosome()[i].getGenes()));
         System.out.println("/n/n");
        
    }

   
    
}

