
// No-Argument constructor

// This is an example of getting a default constructor from Java 

class Student1 {

      // A normal method called learn()
      void learning() { 
      	System.out.println("I am an object of Student1 class and am learning......!");
        System.out.println("");
        System.out.println("");
        }

 }

//...................................................................................................................//

class Student2 {

	Student2(){
  		System.out.println("Student2 objected is created using user defined No-Argument constructor");
        }

        // A normal method called learn()
	void learning() {
		System.out.println("Yes, I am an object of Student2 class and am learning......!");
        	System.out.println("");
        	System.out.println("");
        }

 }

//...................................................................................................................//

class Student3 {

        String myName = "";
        int    myMarks= 0;

	Student3(String name, int marks){
        	System.out.println("Student3 objected is created using parameterized constructor");
		this.myName = name;
		this.myMarks = marks;
                System.out.println("I am an object of Student3 class, My name is " + myName + " and my mark is " + myMarks);
	        }


        // A normal method called learn()
	void learning() {
		System.out.println("Yes, I am an object of Student3 class and am learning......!");
        	System.out.println("");
        	System.out.println("");
        	}

 }  // class ends 

//...................................................................................................................//

// Testing class for different constructors.

public class ConstructorTesting {

	public static void main(String args[]) {

		Student1 st1 = new Student1();	//This is the default constructor provided by Java for you as YOU don't created !
                st1.learning();

                System.out.println("");
        	System.out.println("");

                Student2 st2 = new Student2();	//This is No-Argument constructor created by YOU in your class!
                st2.learning();

                System.out.println("");
                System.out.println("");
		
                //This is parameterized constructor created by YOU in your class!, Objects are initialized with name and marks
                Student3 st3 = new Student3("Gopinathan", 100);	
                st3.learning();

                System.out.println("");
                System.out.println("");

		// You are calling the default constructor provided by Java, Will never compile as You have already created a constructor in this class
                // Student3 st4 = new Student3();	
                // st4.learning();
                 
	} // main ends

 }  // class ends