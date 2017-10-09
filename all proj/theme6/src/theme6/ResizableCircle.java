package theme6;

public class ResizableCircle extends Circle implements Resizable{


    public ResizableCircle(Double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius *= (double) percent/100;
    }
}
