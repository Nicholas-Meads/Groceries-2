public class RectangularPrism extends ShoppingCart {
  //Instance variables, assigned in Zero Argument Constructor
  private double length;
  private int numberOrdered;
  //Zero Argument Constructor
  //Getters and Setters Methods
    //Getters: instance Variable cannot be changed by outside class or program
  //Processor Methods
  //Multi-argument Constructor
  //toString() for Printing Results of Class to Console
  public String toString() {
    return "Boxing Guide: \nNumber Ordered: " + this.numberOrdered + "\n" +
           "Number of Boxes Needed: " + (numBoxes + 1) + "\n" +
           "\tNumber of Full Boxes: " + numBoxes + "\n" +
           "\tGuide for last partial box: " + numFlats + " full flats, " + numRows +
           " full row(s) on last flat, " + this.rectPrismLeftover + " apples in last row.";
  }


} //End of Rectangular Prism Class
