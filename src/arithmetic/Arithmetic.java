/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * date 02/19
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) 
//    {
       public enum Value{Plus, Minus, Times, Divide};//USING ENUM AVOIDING STRING TO MAKE LOOSE COUPLING 
    //IF USING STRING IT IS TIGHT COUPLING MEANS MORE DEPENDANCY
       //IT PROVIDES HIGH COHESION AND LOOSE COUPLING

       private Value value;
       public Arithmetic(Value v)
       {
       this.value=v;
       
}
        ArithmeticBase r= new ArithmeticBase();
        double result = r.calculate(1,2);
        System.out.println("result :" +result); 
    
    }





}

