class student{
 		int id;
 		String name;
 			 student(int n,String s){
 				id=n;
 				name=s;

  }

}


class myfirstjavacode{

 	public static void main(String args[]){
	System.out.println("your first argument is:");
  	student s1=new student(10,"ravi");
  	s1.id=100;
  	s1.name="Shekhar";


	System.out.println("roll no student is : "+ s1.id);
	System.out.println("name of the student is : "+ s1.name);
	System.out.println("name of the student is : "+ s1.name);
	System.out.println("name of the student is : "+ s1.name);

	} 
}  
