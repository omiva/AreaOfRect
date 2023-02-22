package com.company;

class rectangle
{
    int length,breadth;
    rectangle(int len,int br)
    {
        length=len;
        breadth=br;
    }
    public int Area()
    {
        return length*breadth;
    }
}
class Main
{
    public static void main(String[] args)
    {
        rectangle a= new rectangle(4,5);
        rectangle b= new rectangle(5,8);
        System.out.println("AREA OF RECTANGLE A = "+a.Area()+" OF LENGTH "+a.length+" AND BREADTH "+a.breadth+" UNITS RESPECTIVELY");
        System.out.println("\nAREA OF RECTANGLE B = "+b.Area()+" OF LENGTH "+b.length+" AND BREADTH "+b.breadth+" UNITS RESPECTIVELY");
    }
}