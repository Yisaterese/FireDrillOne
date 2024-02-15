import java.util.ArrayList;
public class Person {
  private ArrayList<Problem> problems = new ArrayList<>();


  public void addProblems(Problem pro1){
    problems.add(pro1);
  }
  public ArrayList recountedProblems() {
    return problems;
  }
  public void solvedProblems(Problem pro1){
    for(int index = 0; index < problems.size(); index++){
      if(problems.get(index).equals(pro1)){
         problems.remove(pro1);
      }

    }

    }




}
