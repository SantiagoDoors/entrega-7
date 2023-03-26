// parte a)

public class C7_Ej_1_Rectangulo{ 

    public float base;
    private float altura;
    protected String color;

    public C7_Ej_1_Rectangulo(){ }

    public C7_Ej_1_Rectangulo(float base, float altura, String color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public void MostrarTodos(){
        System.out.println("base: "+base+"\n altura: "+altura+"\n color: "+color);
    }

    // parte d) 
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getAltura(){
        return altura;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}    
