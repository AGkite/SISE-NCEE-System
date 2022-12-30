package beans;
//理科类
public class Science extends Student {
    private int physics;
    public Science(){
        super();
    }
    public Science(int physics){
        super();
        this.physics=physics;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }
}
