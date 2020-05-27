package lab1;

public class Lab1 {

 public Lab1() { }
 
 static class Test1 {
  public int a;
  public float b;
  
  public Test1() {
   a = 0;
   b = (float) 0.1;
  }
  
        @Override
        public Test1 clone() throws CloneNotSupportedException {
            return new Test1();
        }
        
        @Override
        public String toString() {
         return "Test1(a = " + a + ", b = " + b +")";
        }
        
 }
 
 public static void testObjFun(Test1 a) {
  a.a++;
  a.b = 3.14f;
 }

 public static void testPrimitiveFun(int a) {
   
 }
 
 public static void test1(int time) {
  if (time < 18) {
   System.out.println("Good day.");
  } else {
   System.out.println("Good evening.");
  }  
 }
 
 public static void test2() {
  Integer i1=Integer.valueOf(5);
  Integer i2=5;
  Integer i3= new Integer(5);
  
  System.out.println(i1==i2);
  System.out.println(i1.equals(i2));
  System.out.println(i1==i3);
  System.out.println(i1.equals(i3));
 }
 
 public static void main(String[] args) {
  Test1 t1 = new Test1();
  int myNum = 5;               // integer (whole number)
     float myFloatNum = 5.99f;    // floating point number
     char myLetter = 'D';         // character
     boolean myBool = true;       // boolean
     String myText = "Hello";     // String    
     
     System.out.println(myNum);
     System.out.println(myFloatNum);
     System.out.println(myLetter);
     System.out.println(myBool);
     System.out.println(myText);
     
  System.out.println(t1);
  testObjFun(t1);
  System.out.println(t1);
  
  System.out.println("-------------------------");
  test1(20);
  test1(10);
  
  System.out.println("-------------------------");
  test2();
