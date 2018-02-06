package clientewscalcu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClienteWSCalcu{
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
        System.out.println("Por favor ingrese primer parámetro");
        String n1 = br.readLine();
        int a = Integer.parseInt(n1);
        System.out.println("Por favor ingrese segundo parámetro");
        String n2 = br.readLine();
        int b = Integer.parseInt(n2);
        
        int resu;
        resu = resta(b,a);
        System.out.println(b+"-"+a +" = "+ resu);
        resu = sumar(a,b);
        System.out.println(a+"+"+b +" = "+ resu);
        resu = multiplicar(a,b);
        System.out.println(a+"*"+b +" = "+ resu);
        resu = división(a,b);
        System.out.println(a+"/"+b +" = "+ resu);         
    }

    private static int resta(int n1, int n2) {
        pack1.Calcular_Service service = new pack1.Calcular_Service();
        pack1.Calcular port = service.getCalcularPort();
        return port.resta(n1, n2);
    }

    private static int sumar(int n1, int n2) {
        pack1.Calcular_Service service = new pack1.Calcular_Service();
        pack1.Calcular port = service.getCalcularPort();
        return port.sumar(n1, n2);
    }

    private static int división(int n1, int n2) {
        pack1.Calcular_Service service = new pack1.Calcular_Service();
        pack1.Calcular port = service.getCalcularPort();
        return port.división(n1, n2);
    }

    private static int multiplicar(int n1, int n2) {
        pack1.Calcular_Service service = new pack1.Calcular_Service();
        pack1.Calcular port = service.getCalcularPort();
        return port.multiplicar(n1, n2);
    }
}
