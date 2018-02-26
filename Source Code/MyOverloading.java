public class MyOverloading {
     
    public MyOverloading(){
        System.out.println("Inside default constructor");
    }
    public MyOverloading(int i){
        System.out.println("Inside single parameter constructor with int value");
    }
    public MyOverloading(String str){
        System.out.println("Inside single parameter constructor with String object, Hi from  " + str);
    }
    public MyOverloading(int i, int j){
        System.out.println("Inside double parameter constructor");
    }
     
    public static void main(String a[]){
        MyOverloading obj1 = new MyOverloading();
        MyOverloading obj2 = new MyOverloading(10);
        MyOverloading obj3 = new MyOverloading(10,20);
        MyOverloading obj4 = new MyOverloading("Gopinathan");
    }
}