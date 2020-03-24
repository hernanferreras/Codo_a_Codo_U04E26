
package u04e26;

import java.util.Scanner;
public class U04E26 {
    public static void main(String args[]) {
        Scanner entrada=new Scanner(System.in);
        int num=1, max=0, min=0, suma=0, contador=0;
        float promedio;
        while(num!=0){
            System.out.print("Ingrese un numero: ");
            num=entrada.nextInt();
            if (contador==0){
                max=num;
                min=num;
            }else
            {
                if((num>max)&&(num!=0)){
                    max=num;
                }else
                    if((num<min)&&(num!=0)){
                    min=num;
                    }else
                        {
                        min=min;
                    }
            }
        suma=suma+num;
        contador++;
        }
        promedio=(suma/(contador-1));
        System.out.print("El numero maximo ingresado es "+max+"\nEl numero minimo ingresado es: "+min+"\nEl promedio de los numeros ingresados es "+promedio);
    }
}