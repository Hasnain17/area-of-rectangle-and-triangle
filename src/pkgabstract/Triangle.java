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
public class Triangle extends Figure
{
    Triangle(double a,double b)
    {
    super(a,b);
    
    }
    @Override
    double area()
    {
    System.out.println("Inside the area of Triangle.");
    return dim1*dim2/2;
    }
}
