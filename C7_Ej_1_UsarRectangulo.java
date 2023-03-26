import javax.swing.JOptionPane;

public class C7_Ej_1_UsarRectangulo {
    public static void main(String[] args) {
        // parte b)
        
        // C7_Ej_1_Rectangulo r1 = new C7_Ej_1_Rectangulo(4.1f, 12, "green"); r1.MostrarTodos();
        
        C7_Ej_1_Rectangulo array [] = new C7_Ej_1_Rectangulo[5];
        
        //parte c) y d)

        for(int i = 0; i< array.length; i++ ){
            array[i] = new C7_Ej_1_Rectangulo();
            array[i].base = Float.parseFloat(JOptionPane.showInputDialog("ingrese base del Rectangulo "+(i+1)+":"));
            array[i].setAltura(Float.parseFloat(JOptionPane.showInputDialog("ingrese altura del Rectangulo "+(i+1)+":")));
            array[i].setColor(JOptionPane.showInputDialog("ingrese color del Rectangulo "+(i+1)+":"));
        }
        for(int i = 0; i< array.length; i++ ){
            array[i].MostrarTodos();
        }
        // parte e)
        System.out.println("con la base aumentada en 1: ");
        for(int i = 0; i< array.length; i++ ){
            
            array[i].base +=1;
            array[i].MostrarTodos();
        }
        // parte f)
        System.out.println("cambiar de color los rectangulos: ");
        for(int i = 0; i< array.length; i++ ){
            array[i].color = JOptionPane.showInputDialog("ingrese un nuevo color del Rectangulo "+(i+1)+": ");
        
            // parte g)

            array[i].MostrarTodos();
        }
        System.out.println("mostrar altura y color con el metodo get");
        
        for(int i = 0; i< array.length; i++ ){
            System.out.println("getAltura: "+array[i].getAltura());;
            System.out.println("getColor: "+array[i].getColor());;
        }
    }
}
