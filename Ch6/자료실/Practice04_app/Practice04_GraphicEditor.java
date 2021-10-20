package Ch6.자료실.Practice04_app;

import Ch6.자료실.Practice04_base.Practice04_Shape;
import Ch6.자료실.Practice04_derived.Practice04_Circle;

public class Practice04_GraphicEditor {
    public static void main(String[] args) {
        Practice04_Shape shape = new Practice04_Circle();
        shape.draw();
    }
}
