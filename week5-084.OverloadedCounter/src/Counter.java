/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Computer
 */
public class Counter {
    
   private int value;
   private boolean check;
   
   public Counter(int startingValue, boolean check){
       this.value=startingValue;
       this.check=check;
   }
   public Counter(int startingValue){   
       this.value=startingValue;
   }
   public Counter(boolean check){   
       this.check=check;
       this.value=0;
   }
   public Counter(){    
       this.value=0;
   }
   public int value(){
       return this.value;
   }
   public void increase(){
       value++;
   }
   public void decrease(){
       if (check==true){    
           if(value>0){ 
               value--;
           }
       }else{
           value --;
       }
   }
   public void increase(int increaseAmount){    
       if(increaseAmount>0){    
           value+=increaseAmount;
       }
   }
   public void decrease(int decreaseAmount){
       if(decreaseAmount>0){    
           if(check==true){  
               if(value>decreaseAmount){    
                   value-=decreaseAmount;
                   
               }else{   
                   value=0;
               }
           }else{
               value-=decreaseAmount;
           }
       }
   }
    
}
