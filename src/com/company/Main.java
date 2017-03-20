package com.company;

public class Main {
    static String s="a";




    public static void main(String[] args) {
	// write your code here

       /* if(s.matches("[\\d]+"))System.out.print("0");
        else System.out.print("1");*/
        A cl=new A(5);
        B bl=new B(5);
        bl=(B)cl;
        bl.afficher();
    }
}
class A{
    protected int a;
    public A(int a)
    {
        this.a=a;
    }
}
class B extends A{
    protected int a=0;
    public B(int a){
        super(a);

    }
    public void afficher()
    {
        System.out.print(a);
    }

}