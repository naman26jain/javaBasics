class Parentclass
{
   Parentclass(){
	System.out.println("Constructor of parent class");
   }
}
class Subclass extends Parentclass
{
   Subclass(){
	 System.out.println("Constructor of child class");
   }
   Subclass(int num){
	 System.out.println("arg constructor of child class");
   }
   void display(){
	System.out.println("Hello!");
   }
   public static void main(String args[]){
	 Subclass obj= new Subclass();
 	obj.display();
                 Subclass obj2= new Subclass(10);
	obj2.display();
   }
}
