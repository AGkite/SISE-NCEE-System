package beans;
//艺术类
public class Arts extends Student {
    private int fine_arts;
    public Arts(){
        super();
    }
    public Arts(int fine_arts){
        super();
        this.fine_arts=fine_arts;
    }

    public int getFine_arts() {
        return fine_arts;
    }

    public void setFine_arts(int fine_arts) {
        this.fine_arts = fine_arts;
    }
}
