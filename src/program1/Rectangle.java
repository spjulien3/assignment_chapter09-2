package program1;

import java.text.DecimalFormat;

public class Rectangle {
    private double width=1;
    private double height=1;
    //used to format answers to 2 decimal places
    //static to be called once and used anywhere
    private static DecimalFormat dec = new DecimalFormat(".##");

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        //calculates area with variables height and width
        return width*height;
    }
    public double getPerimeter(){
        //perimeter is calculated by taking totals of each side
        return (2*height)+(2*width);
    }
    @Override //simple toString override to give concise and relevant feed back while testing
    public String toString(){
        return "The width of the rectangle: "+width+"\nThe height of the rectangle: "+height
                +"\nThe area of the rectangle: "+dec.format(getArea())+"\nThe perimeter of the rectangle: "+dec.format(getPerimeter())
                +"\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * *";
    }
}
