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
public class Rectangle extends Figure
{
Rectangle(double a,double b)
{
super(a,b);
}
@Override
double area()
{
    System.out.println("Inside area of rectangle.");
    return dim1*dim2;
}
}
