class Student6{
     String name;
     int age;

     static int maxAge = 21;

     public static void main(String[] args){
          Student6 a = new Student6();
          a.name = "abc";
          a.age = 12;
          a.maxAge = 23; 

          Student6 b = new Student6();
          b.name = "def";
          b.age = 19;
     
          b.showInfo();
          a.showInfo();

     }

     static void showInfo(){
          System.out.println(name);
          System.out.println(age);
          System.out.println(maxAge);

     }
}

//error: non-static variable name cannot be referenced from a static context