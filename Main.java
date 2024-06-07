import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("SAT DATA!!!!");

    // create data structure to store all total scores
    ArrayList<Integer> totalScore = new ArrayList<Integer>();
    
    try{
      Scanner s = new Scanner(new File("total.txt"));

      while(s.hasNext()){
        int score = Integer.parseInt(s.nextLine());
        totalScore.add(score);
      }
      s.close();
    }

    catch(Exception e){
      System.out.println("file not found");
    }

    // make sure all data entered the ArrayList
    //System.out.println(totalScore);
    System.out.println(totalScore.size() + " took the test");

    //calculate avg
    double sum=0;
    for(int x: totalScore){
      sum+=x;
    }
    System.out.println(sum/totalScore.size() + " is the average score");

    //amt above 1000 scores
    int above1000=0;
    for(int x: totalScore){
      if(x>=1000){
        above1000++;
      }
    }
    System.out.println(above1000 + " got above 1000");

    //max score
    int max=Integer.MIN_VALUE;
    for(int x: totalScore){
      if (x>max){
        max=x;
      }
    }
    System.out.println(max + " is the highest score");
  }

}
