/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author Hasnain Gakhar
 */
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     //Figure F=new Figure(10,10); // it is illegal because abstract class have no object
     Rectangle r=new Rectangle(10,10);
     Triangle t=new Triangle(5,5);
     Figure Figref;//this is ok because we can create a refrence variable of abstract class.
     Figref=r;
     System.out.println("Area of Rectangle is:"+Figref.area());
     Figref=t;
     System.out.println("Area of trinagle is:"+Figref.area());
     
     
     
    }
    
}
