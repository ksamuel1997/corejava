//abstract class

abstract class parent
{
public  abstract void add(); // this is an abstract class
}


class child extends parent
{
public void add(){}
}

public class main
{

public static void main(String [] ar)
{

parent p =  new parent();
p.add();
child c = new child();
c.add();
}

}

