
import java.util.ArrayList;
import java.util.Arrays;
public class ProjectTest {
  public static void main(String[] args){
    Portfolio portfolio = new Portfolio();
    Project p = new Project();
    Project p2 = new Project("Java");
    Project p3 = new Project("Mern", "Black Belt", 200);
    Project p4 = new Project("Python", "Coding Dojo", 100);
    ArrayList<Portfolio> projects = new ArrayList<Portfolio>();
    p.setName("CSharp");
    p.setDesc("Starts from Feb");
    p.setCost(300);
    p2.setDesc("Java is fun");
    p2.setCost(100000.0);
    portfolio.setProject(p);
    portfolio.setProject(p2);
    portfolio.setProject(p3);
    portfolio.setProject(p4);
    portfolio.showPortfolio();
    
    String name = "Mern";
    String result1 = portfolio.getPortoliobyName(name);
    System.out.println(result1);
    String desc = "Coding Dojo";
    String result2 = portfolio.getPortoliobyDesc(desc);
    System.out.println(result2);
    String name2 = "Python";
    String result3 = portfolio.getPortoliobyName(name2);
    System.out.println(result3);

    double totalcost = portfolio.getPortfolioCost();
    System.out.println("Total cost is: " + totalcost);

  }
}