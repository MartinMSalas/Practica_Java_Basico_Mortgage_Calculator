public class UIControl {
    private boolean isEnabled= true;

    public UIControl() {
        System.out.println("UIControl created ");
    }



    public  void render() {

    }
    public void enable(){
        isEnabled=true;
    }
    public void disable(){
        isEnabled=false;
    }
    public boolean isEnabled(){
        return isEnabled;
    }
}
