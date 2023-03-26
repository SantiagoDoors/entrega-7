import javax.swing.JOptionPane;

public class C7_Ej_1_UsarRectangulo_v2 {
    public static void main(String[] args) {

        C7_Ej_1_Rectangulo array [] = new C7_Ej_1_Rectangulo[5];
        float base, altura; String color;

        for(int i = 0; i< array.length; i++ ){

            base = Float.parseFloat(JOptionPane.showInputDialog("ingrese base del Rectangulo "+(i+1)+":"));
            altura = Float.parseFloat(JOptionPane.showInputDialog("ingrese altura del Rectangulo "+(i+1)+":"));
            color = JOptionPane.showInputDialog("ingrese color del Rectangulo "+(i+1)+":");
            array[i] = new C7_Ej_1_Rectangulo(base, altura, color);

        }
        for(int i = 0; i< array.length; i++ ){
            array[i].MostrarTodos();
        }
    }
}