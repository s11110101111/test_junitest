package org.example.test_junitest.sobes.tasks_solution;

public  class RecursiveTasks {
    //recursive sum
    static int sum(int a,int b){
      if (b>0){
           a= a+1;
           b= b-1;
         return  sum(a,b);
      }
    return a;
    }


    public static void main(String[] args) {
        System.out.println(sum(2,7));
    }
}
