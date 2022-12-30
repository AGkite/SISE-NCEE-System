package beans;
//文科类
public class Liberal extends Student{
    private int history;
    private int geography;
    public Liberal(){
        super();
    }
    public Liberal(int history,int geography){
        super();
        this.history=history;
        this.geography=geography;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getGeography() {
        return geography;
    }

    public void setGeography(int geography) {
        this.geography = geography;
    }
}
