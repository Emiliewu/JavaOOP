import java.util.ArrayList;
import java.util.Arrays;
public class Portfolio {
  // private ArrayList<Object[]> projects = new ArrayList<Object[]>();
  ArrayList<Project> projects;


  public Portfolio() {
    projects = new ArrayList<Project>();
  }
  public void setProject(Project project){
    projects.add(project);
    // System.out.println("project added " + Arrays.toString(project));
    // for (Project p: projects) {
    //     System.out.println("portfolio added" + Arrays.toString(p));
    // }
  }
  public Project getProject(int index){
    return projects.get(index);
  }

  public Double getPortfolioCost(){
    Double cost = 0.0;
    for(Project project : projects){
        cost += project.getCost();
    }
    return cost;
  }

  public void showPortfolio(){
    for(Project project : projects){
        // System.out.println(project.elevatorPitch());
        project.elevatorPitch();
    }
  }
  public String getPortoliobyName(String name) {
    String res = "not found";
    for (Project p: projects) {
      if(p.getName() == name) {
        res = "The project is found => " + p.getName() + "(" + p.getCost() + ")" + " : " + p.getDesc();
      }
    }
    return res;
  }
  public String getPortoliobyDesc(String description) {
    String res = "not found";
    for (Project p: projects) {
      if(p.getDesc() == description) {
        res = "The project is found => " + p.getName() + "(" + p.getCost() + ")" + " : " + p.getDesc();
      }
    }
    return res;
  }
}