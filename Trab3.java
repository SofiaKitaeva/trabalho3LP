class MinhaData {
    //a) Crie uma classe chamada MinhaData, a qual deverá
    //conter 3 campos inteiros que representam o dia, mês e ano desta data.
    int dia;
    int mes;
    int ano;
    
    //b) Defina um construtor que receba 3 valores e inicialize os 3 campos de um
    //objeto.
    public MinhaData(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }
    
    //c) Defina um 2o. construtor que inicialize um objeto a partir de uma string
    //contendo uma data (p. ex., “1/4/2013”).
    public MinhaData(String data){
        String[] partes = data.split("/");
        String d = partes[0];
        String m = partes[1];
        String a = partes[2];
        this.dia = Integer.parseInt(d);
        this.mes = Integer.parseInt(m);
        this.ano = Integer.parseInt(a);
    }
    
    //d) Crie um método toString() para esta classe que retorna uma string representando
    //o objeto data.
    public String toString(){
        return dia + "/" + this.mes + "/" + this.ano;
    }
    
    //e) Crie métodos para adicionar, ou diminuir, dias, meses e anos de uma data.
    
    //    ***** CRIAR VERIFICAÇÃO PARA VALORE DE DATA *****
    public void mudaDia(int dif){
            dia = dia + dif;
    }
    public void mudaMes(int dif){
        mes = mes + dif;
    }
    public void mudaAno(int dif){
        ano = ano + dif;
    }
    
}

public class Trab3 {
    public static void main(String[] args) {
        MinhaData data = new MinhaData(07, 11, 2001);
        MinhaData data2 = new MinhaData("15/01/2022");
        System.out.println(data.ano);
        System.out.println(data2.dia);
        System.out.println(data.toString());
        System.out.println(data2.toString());
        data.mudaMes(-3);
        data2.mudaDia(-15);
    }
}
