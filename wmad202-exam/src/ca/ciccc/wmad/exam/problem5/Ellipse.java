package ca.ciccc.wmad.exam.problem5;

public class Ellipse {

    private int major;
    private int minor;

    public Ellipse(int major, int minor) {
        this.major = major;
        this.minor = minor;
    }

    public void defineEllipse(){
        if(major < 0 || minor < 0){
            System.out.println("Error");
        }


    }
}
