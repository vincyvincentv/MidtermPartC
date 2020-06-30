package arithmetic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * date 30/20
 */
public class ArithmeticBase 
{

 
 public double x,y;
 private VINCYVINCENT_OPERATIONTYPE type;
 public enum VINCYVINCENT_OPERATIONTYPE {PLUS,MINUS,TIMES,DIVIDE};
 
    void calculate(double x, double y){ 
       
        
           System.out.println(x +" + "+y+" = "+(x + y));
            System.out.println(x +" - "+y+" = "+(x - y));
            System.out.println(x +" * "+y+" = "+(x * y));
            System.out.println(x +" / "+y+" = "+(x / y));
            
             
    }

    
      /**
     * @return the type
     */
    public VINCYVINCENT_OPERATIONTYPE getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(VINCYVINCENT_OPERATIONTYPE type) {
        this.type = type;
    }
   
}

