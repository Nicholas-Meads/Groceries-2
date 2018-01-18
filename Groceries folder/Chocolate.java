public class Chocolate extends RectanglePrism {
  //Instance variables, assigned in Zero Argument Constructor
  private int numberOrdered;
  private double totalChocolateCost;

  //Zero Argument Constructor

  //Getters and Setters Methods
  //Getters: instance Variable cannot be changed by outside class or program
  public double getTotalCost () { //returning appleCost from Zero Argument Constructor
    return this.totalChocolateCost = Information.chocolateCost * this.numberOrdered; //
  }

  //Processor Methods

  //multi-argument Constructor
  public Chocolate (int userEntered, double length) {
    super( userEntered, length);
    this.numberOrdered = userEntered;
  }

  //toString() for Printing Results of Class to Console
  public String toString() { //For JOptionPane and Println
    return super.toString() + "\n";
  }


} //End of Chocolate Class
