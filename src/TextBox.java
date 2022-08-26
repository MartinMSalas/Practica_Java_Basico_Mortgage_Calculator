public class TextBox extends UIControl  {
    private String text=""; // Campo Field

    public TextBox() {

        System.out.println("TextBox Created");
    }

    @Override
    public void render() {
        System.out.println("Render TextBox ");
    }

    @Override
    public String toString(){

        return text;
    }
    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        this.text = "";
    }
}
