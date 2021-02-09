import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;

public class Project {
  private String name;
  private String description;
  private double initialCost;

  public Project() {
    this.name = null;
    this.description = null;
    this.initialCost = 0;
  }

  public Project(String name) {
    this.name = name;
    this.description = null;
    this.initialCost = 0;
  }

  public Project(String name, String description, double initialCost) {
    this.name = name;
    this.description = description;
    this.initialCost = initialCost;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDesc(String description) {
    this.description = description;
  }

  public void setCost(double initialCost) {
    this.initialCost = initialCost;
  }

  public double getCost() {
    return this.initialCost;
  }

  public String getName() {
    return this.name;
  }

  public String getDesc() {
    return this.description;
  }

  public String elevatorPitch() {

    System.out.println(this.name + "(" + this.initialCost + ")" + "," + this.description);
    return getName() + "(" + getCost() + ")" + " : " + getDesc();
  }
  
}