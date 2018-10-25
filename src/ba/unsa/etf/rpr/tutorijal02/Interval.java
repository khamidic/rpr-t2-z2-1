package ba.unsa.etf.rpr.tutorijal02;

public class Interval {

    private double intervalPoc;
    private double intervalKraj;
    private boolean ukljucenPoc;
    private boolean ukljucenKraj;

    public Interval(double intervalPoc, double intervalKraj, boolean ukljucenPoc, boolean ukljucenKraj) {
        this.intervalPoc = intervalPoc;
        this.intervalKraj = intervalKraj;
        this.ukljucenPoc = ukljucenPoc;
        this.ukljucenKraj = ukljucenKraj;
    }

    public Interval() {
        this(0,0,false, false);
    }

    public double getIntervalPoc() {
        return intervalPoc;
    }

    public void setIntervalPoc(double intervalPoc) {
        this.intervalPoc = intervalPoc;
    }

    public double getIntervalKraj() {
        return intervalKraj;
    }

    public void setIntervalKraj(double intervalKraj) {
        this.intervalKraj = intervalKraj;
    }

    public boolean isUkljucenPoc() {
        return ukljucenPoc;
    }

    public void setUkljucenPoc(boolean ukljucenPoc) {
        this.ukljucenPoc = ukljucenPoc;
    }

    public boolean isUkljucenKraj() {
        return ukljucenKraj;
    }

    public void setUkljucenKraj(boolean ukljucenKraj) {
        this.ukljucenKraj = ukljucenKraj;
    }

    public String toString() {
        String s = new String();
        if(ukljucenPoc) s += "[";
        else s += "(";
        s += this.intervalPoc; s += ","; s += " " + this.intervalKraj;
        if(ukljucenKraj) s += "]";
        else s += ")";
        return s;
    }

    public boolean isIn(double v) {
        if(ukljucenPoc && ukljucenKraj && v >= intervalPoc && v <= intervalKraj) return true;
        else if(ukljucenPoc && !ukljucenKraj && v >= intervalPoc && v < intervalKraj) return true;
        else if(!ukljucenPoc && ukljucenKraj && v > intervalPoc && v <= intervalKraj) return true;
        else if(!ukljucenPoc && !ukljucenKraj && v > intervalPoc && v < intervalKraj) return true;
        return false;
    }


}
