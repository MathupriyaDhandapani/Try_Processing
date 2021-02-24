import processing.core.PApplet;
public class TryProcessing extends PApplet{

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 1000;
    public static final int DIAMETER = 40;
    int one=0;
    int two=1;
    int three=1;
    int four=1;
    private void getEllipseOne() {
        ellipse(one, (float) (HEIGHT / 1.25), DIAMETER, DIAMETER);
        one+=4;

    }

    private void getEllipseTwo() {
        ellipse(two, (float) (HEIGHT / 1.66), DIAMETER, DIAMETER);
        two+=3;

    }
    private void getEllipseThree() {
        ellipse(three, (float) (HEIGHT / 2.5), DIAMETER, DIAMETER);
        three+=2;
    }


    private void getEllipseFour() {
        ellipse(four, HEIGHT / 5, DIAMETER, DIAMETER);
        four+=1;

    }



    public static void main(String args[]){
        PApplet.main("TryProcessing", args);
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {

        getEllipseFour();
        getEllipseThree();
        getEllipseTwo();
        getEllipseOne();

    }




}
