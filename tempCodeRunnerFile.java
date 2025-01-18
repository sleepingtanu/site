class pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing with a pen");
    }
}
public class OOPS{
    public static void main(string args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "ballpoint";
        pen1.write();
    }
}