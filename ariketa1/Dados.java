//Codificado por sAfOrAs
public class Dados{
    static int MAX=20;
    static int a1[]=new int[MAX];
    static int a2[]=new int[MAX];
    static int a3[]=new int[MAX];
    static int pares[]=new int[MAX];
     
    static void rellenaraleatorios(int x[], int y[], int z[]){
        for(int i=0;i<x.length;i++)
        {
            x[i]=(int)(Math.random()*6+1);
            y[i]=(int)(Math.random()*6+1);
            z[i]=(int)(Math.random()*6+1);
        }
    }
         
    static void imprimir(int x[],String dado1,int y[],String dado2,int z[],String dado3){
        for(int i=0;i<x.length;i++){
             
            System.out.print("Lanzamiento "+(i+1)+" : \t"); 
            System.out.print(dado1+"["+i+"]="+x[i]+"\t");
            System.out.print(dado2+"["+i+"]="+y[i]+"\t");
            System.out.println(dado3+"["+i+"]="+z[i]+"\t");
            revisarVector(x[i],y[i],z[i]);
        }
    }
     
    static void revisarVector(int dado1,int dado2,int dado3){
         
         
        //for(int i=0;i<m.length;i++){
            if(dado1==5 && dado2==3 && dado3==6)
            {
            System.out.println("100 veces la apuesta.");                
            }
//          else if(dado1==6 && dado2==6 && dado3==6)
 
        //}
        //return pos;
    }
     
    public static void main(String[] args){
        rellenaraleatorios(a1,a2,a3);
        int ultimo=0;
        imprimir(a1,"Dado 1",a2,"Dado 2",a3,"Dado 3");
//      rellenaraleatorios(a2);
//      imprimir(a2,"Dado 2");
//      rellenaraleatorios(a3);
//      imprimir(a3,"Dado 3");
        //ultimo=extraerpares(a1,pares,0);
        //imprimir(pares,"pares");
        //ultimo=extraerpares(a2,pares,ultimo);
        //imprimir(pares,"pares");
    }
}
