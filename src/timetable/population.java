
package timetable;

import static java.lang.String.valueOf;
import java.util.Arrays;

public class population {
    private  chromosome[] chromosomes;
    public population(int length){
    chromosomes=new chromosome[length];
    
    }
 population intialisePopulation(){
        for(int x=0;x<chromosomes.length;x++){
            //System.out.println(chromosomes.length);
        
            chromosomes[x]=new chromosome(genetic_algorithm.TARGET_CHROMOSOME.length).intialiseChromosome(x);
        }
        //for(int x=0;x<chromosomes.length;x++){
        // System.out.println(chromosomes[x]);}
        return this; 
 }
 
 population intialisePopulation(int q){
      
        for(int x=0;x<chromosomes.length;x++){
            
             chromosomes[x]=new chromosome(genetic_algorithm.TARGET_CHROMOSOME.length).intialiseChromosome1(x);
           //System.out.println(chromosomes[x]);
            
        
        }
       //for(int x=0;x<chromosomes.length;x++){
       // System.out.println(chromosomes[x]);}
       return this;
 }
 population intialisePopulation(int q,int z){
      
        for(int x=0;x<chromosomes.length;x++){
            
             chromosomes[x]=new chromosome(genetic_algorithm.TARGET_CHROMOSOME.length).intialiseChromosome2(x);
           //System.out.println(chromosomes[x]);
            
        
        }
      // for(int x=0;x<chromosomes.length;x++){
        // System.out.println(chromosomes[x]);}
       return this;
 }
    
    public chromosome[] getChromosome(){
        return chromosomes;
    }
   
    
   
}
