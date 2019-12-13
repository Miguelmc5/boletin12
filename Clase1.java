package boletin12_2;

/**
 *
 * @author mmartinezcosta
 */
public class Clase1 {
int p1,p2; 
    
    public Clase1 (int i, int j){ 
        p1=i; //5 //5 //9
        p2=j; //4 //4 //8
    } 
 
    public int modificar(int i){ 
        p1=p1+i; //5+4=9 //5+5=10 //9+5=14
        p2=p2+i; //4+4=8 //4+5=9  //8+5=13
        System.out.print(p2+" "); //8 //9 //13  
        return p1; //9 //10 //14
    }
}
