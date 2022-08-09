package ca.ciccc.wmad.exam.problem5;

public class Directory {

    private String txt;
    private String pdf;

    public Directory(String txt, String pdf) {
        this.txt = txt;
        this.pdf = pdf;
    }


    public String getTxt() {
        return txt;
    }

    public String getPdf() {
        return pdf;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }
}
