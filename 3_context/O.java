class O{
     int y = 45;

     public static void main(String[] args){
          O a = new O();
          a.y = 99;

          O b = new O();
          b.y = 999;

          O c = new O();
          c.y = 9999;

          c.pro();
          b.pro();
          a.pro();

     }

     void pro(){
          System.out.println(y);
     }
}

// 9999
// 999
// 99