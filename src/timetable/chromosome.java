
package timetable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class chromosome {
    private String[] genes;
    public chromosome(int length){
    genes=new String[length];
    
    }
     chromosome intialiseChromosome(int k){
         switch(k){
            case 0:
                            //System.out.println(k);
                            genes= new String[] {"DBMS","CN","SEPM","PRACTICAL1","SDL TUT(RT)","SDL TUT(DJP)","SDL","prac1"};
                           List<String> strList = Arrays.asList(genes);
                           Collections.shuffle(strList);
                           genes = strList.toArray(new String[strList.size()]);
                           break;
            case 1:    
                           // System.out.println(k);
                        genes= new String[] {"TOC","SEPM","CN","PRA","PRACT1","PRACT2"};
                        List<String> strList1 = Arrays.asList(genes);
                        Collections.shuffle(strList1);
                        genes = strList1.toArray(new String[strList1.size()]);
                        break;
            case 2:    
                           // System.out.println(k);
                        genes= new String[] {"TOC","DBMS","CN","CN","ISEE","PRACT1"};
                        List<String> strList2 = Arrays.asList(genes);
                        Collections.shuffle(strList2);
                        genes = strList2.toArray(new String[strList2.size()]);
                        break;
                        
            case 3:    
                           // System.out.println(k);
                        genes= new String[] {"ISEE","SEPM","DBMS","PRACT1","PRACT2"};
                        List<String> strList3 = Arrays.asList(genes);
                        Collections.shuffle(strList3);
                        genes = strList3.toArray(new String[strList3.size()]);
                        break;
            case 4:    
                           // System.out.println(k);
                        genes= new String[] {"TOC","ISEE","FREE","PRACT1","PRACT2"};
                        List<String> strList4 = Arrays.asList(genes);
                        Collections.shuffle(strList4);
                        genes = strList4.toArray(new String[strList4.size()]);
                        break;
            case 5:    
                          //System.out.println(k);
                        genes= new String[] {"                  SEMINAR         "};
                        List<String> strList5 = Arrays.asList(genes);
                        Collections.shuffle(strList5);
                        genes = strList5.toArray(new String[strList5.size()]);
                        break;
         }
        return this;
    }
      chromosome intialiseChromosome1(int k){
         switch(k){
            case 0:
                           // System.out.println(k);
                            genes= new String[] {"FREE","DM","DELD","COA","DSA","PRACT1"};
                           List<String> strList = Arrays.asList(genes);
                           Collections.shuffle(strList);
                           genes = strList.toArray(new String[strList.size()]);
                          // System.out.println("END");
                           break;
            case 1:    
                           // System.out.println(k);
                        genes= new String[] {"DSA","DM","DM","COA","DELD","PRACT1"};
                        List<String> strList1 = Arrays.asList(genes);
                        Collections.shuffle(strList1);
                        genes = strList1.toArray(new String[strList1.size()]);
                        break;
            case 2:    
                           // System.out.println(k);
                        genes= new String[] {"DELD","DSA","COA","PRACT1","PRACT2"};
                        List<String> strList2 = Arrays.asList(genes);
                        Collections.shuffle(strList2);
                        genes = strList2.toArray(new String[strList2.size()]);
                        break;
                        
            case 3:    
                           // System.out.println(k);
                        genes= new String[] {"DM","DELD","COA","PRACT1","PRACT2"};
                        List<String> strList3 = Arrays.asList(genes);
                        Collections.shuffle(strList3);
                        genes = strList3.toArray(new String[strList3.size()]);
                        break;
            case 4:    
                           // System.out.println(k);
                        genes= new String[] {"FREE","FREE","DSA","PRACT1","PRACT2"};
                        List<String> strList4 = Arrays.asList(genes);
                        Collections.shuffle(strList4);
                        genes = strList4.toArray(new String[strList4.size()]);
                        break;
            case 5:    
                          // System.out.println(k);
                        genes= new String[] {"OOPS","OOPS","OOPS","OOPS","FREE","FREE"};
                        List<String> strList5 = Arrays.asList(genes);
                        Collections.shuffle(strList5);
                        genes = strList5.toArray(new String[strList5.size()]);
                        break;
         }
       
        return this;
    }
      chromosome intialiseChromosome2(int k){
         switch(k){
            case 0:
                           // System.out.println(k);
                            genes= new String[] {"HPS","PRACT1","AIR","DA","HPC","E-1"};
                           List<String> strList = Arrays.asList(genes);
                           Collections.shuffle(strList);
                           genes = strList.toArray(new String[strList.size()]);
                          // System.out.println("END");
                           break;
            case 1:    
                           // System.out.println(k);
                        genes= new String[] {"AIR","PRACT1","EL-1","EL-2","DA","FREE"};
                        List<String> strList1 = Arrays.asList(genes);
                        Collections.shuffle(strList1);
                        genes = strList1.toArray(new String[strList1.size()]);
                        break;
            case 2:    
                           // System.out.println(k);
                        genes= new String[] {"DA","PRACT1","EL-1","HPC","AIR","FREE"};
                        List<String> strList2 = Arrays.asList(genes);
                        Collections.shuffle(strList2);
                        genes = strList2.toArray(new String[strList2.size()]);
                        break;
                        
            case 3:    
                           // System.out.println(k);
                        genes= new String[] {"EL-2","PRACT1","EL-2","HPC","PROJECT"};
                        List<String> strList3 = Arrays.asList(genes);
                        Collections.shuffle(strList3);
                        genes = strList3.toArray(new String[strList3.size()]);
                        break;
            case 4:    
                           // System.out.println(k);
                        genes= new String[] {"--------------------off------------------------"};
                        List<String> strList4 = Arrays.asList(genes);
                        Collections.shuffle(strList4);
                        genes = strList4.toArray(new String[strList4.size()]);
                        break;
            case 5:    
                          // System.out.println(k);
                        genes= new String[] {"-------------------off-------------------------"};
                        List<String> strList5 = Arrays.asList(genes);
                        Collections.shuffle(strList5);
                        genes = strList5.toArray(new String[strList5.size()]);
                        break; 
         }
        return this;
    }
    public String[] getGenes(){
        
     return genes;
    
    }
    public String toString(){
    return Arrays.toString(this.genes);
    }    
}
