//This is my first program

/*

file name should be saved  with .java extention

in one file you can have multiple classess
but... you can have only one public class.. 
*/
class sam
{
public void sing()
{
System.out.println(" Sam is good singer");
}
public void play(){

System.out.println("Play vollyball");
}

}

public class jp extends sam
{
public static void main(String [] str){
System.out.println("JP's class");

jp j = new jp(); //  creating an instance of the class jp.. the instance name is j
j.greeting();
j.display();
j.sing();// coming through inheritence
j.play();// coming through inheritence

//sam s = new sam();
//s.sing();

}

public  void greeting()
{
System.out.println("Namaste");
}

public void display()
{
System.out.println("Hello Sam.. let us have breakfast");
}

/*public void play() // overriding the method.. my father sam has a different defintion
{
System.out.println("My dad's play is ... ");
super.play();
System.out.println("I am a lazy fellow.. playing youtube videos");
}*/


}


