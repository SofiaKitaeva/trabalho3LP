package trab3;

class MinhaData {
    int dia;
    int mes;
    int ano;
    
    public MinhaData(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }

    public MinhaData(String data){
        if(data.length() == 8){
           String[] partes = data.split("/");
           String d = partes[0];
           String m = partes[1];
           String a = partes[2];
           dia = Integer.parseInt(d);
           mes = Integer.parseInt(m);
           ano = Integer.parseInt(a);
        }
        else{
            System.out.println("Formato de data inválido");
        }
    }
}


public class Trab3 {
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
