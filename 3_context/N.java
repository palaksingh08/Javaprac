class N{
     float x = 89.5f;

     public static void main(String[] args){
          N n = new N();

          n.pro(n);
     }

     void pro(N n){
          System.out.println(n.x);
     }
}

// 89.5