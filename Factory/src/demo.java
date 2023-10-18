public class demo {
    public static void main(String[] args) {
        ShapeFactory sF=new ShapeFactory();

        Shape s=sF.getShape("triangle");
        s.draw();

        //Shape s=new circle();
    }
}
