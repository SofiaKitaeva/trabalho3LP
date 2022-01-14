import java.util.ArrayList;
import java.util.List;

class MinhaData {
    //  a) Crie uma classe chamada MinhaData, a qual deverá
    //  conter 3 campos inteiros que representam o dia, mês e ano desta data.
    int dia;
    int mes;
    int ano;
    
    //  b) Defina um construtor que receba 3 valores e inicialize os 3 campos de um
    //  objeto.
    public MinhaData(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }
    
    //  c) Defina um 2o. construtor que inicialize um objeto a partir de uma string
    //  contendo uma data (p. ex., “1/4/2013”).
    public MinhaData(String data){
        String[] partes = data.split("/");
        String d = partes[0];
        String m = partes[1];
        String a = partes[2];
        this.dia = Integer.parseInt(d);
        this.mes = Integer.parseInt(m);
        this.ano = Integer.parseInt(a);
    }
    
    //  d) Crie um método toString() para esta classe que retorna uma string representando
    //  o objeto data.
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }
    
    //  e) Crie métodos para adicionar, ou diminuir, dias, meses e anos de uma data.
    public void mudaDia(int dif){
        if(this.dia + dif > 0 && this.dia + dif < 32){
            this.dia = this.dia + dif;
        }
        else{
            System.out.println("Dia inválido");
        }
    }
    public void mudaMes(int dif){
        if(this.mes + dif > 0 && this.mes + dif < 13){
            this.mes = this.mes + dif;
        }
        else{
            System.out.println("Mês inválido");
        }
    }
    public void mudaAno(int dif){
        if(this.ano+ dif > 0){
            this.ano = this.ano + dif;
        }
        else{
            System.out.println("Ano inválido");
        }
    }
    
    //  f) Crie um método chamado compara, que compara a data representada pelo objeto
    //  alvo da chamada com uma data passada como argumento para o método; o valor
    //  retornado deve ser 0 se essas datas são iguais, -1 se a primeira data é anterior à
    //  última, ou +1 se a primeira é posterior à última.
    public int compara(MinhaData data){
        if(this.ano - data.ano < 0){
            return -1;
        }
        else if(this.ano - data.ano > 0){
            return 1;
        }
        else if(this.mes - data.mes < 0){
            return -1;
        }
        else if(this.mes - data.mes > 0){
            return 1;
        }
        else if(this.dia - data.dia < 0){
            return -1;
        }
        else if(this.dia - data.dia > 0){
            return 1;
        }
        else{
            return 0;
        }
    }
}

//  g) Crie uma segunda classe, chamada DataComemorativa, a qual representará as
//  diferentes datas comemorativas. Uma data comemorativa normalmente contém
//  um nome, se é feriado ou não, se este feriado é mundial e o dia associado.
class DataComemorativa extends MinhaData {
    String nome;
    char feriado;
    char mundial;
    
    // Construtores
    public DataComemorativa(int d, int m, int a, String nm, char fer, char mun){
        super(d, m, a);
        this.nome = nm;
        this.feriado = fer;
        this.mundial = mun;
    }
    
    public DataComemorativa(String data, String nm, char fer, char mun){
        super(data);
        this.nome = nm;
        this.feriado = fer;
        this.mundial = mun;
    }
}

//  h) Crie uma terceira classe chamada DatasComemorativas, a qual deverá conter
//  uma coleção que armazenará todas as datas comemorativas existentes.
class DatasComemorativas extends DataComemorativa{
    List<DataComemorativa> colecao = new ArrayList();
    
    public DatasComemorativas(){
    }

    //  i) Implemente nesta terceira classe o método adiciona(), que insere uma data
    //  comemorativa na lista.
    public void adiciona(DataComemorativa nova) {
        colecao.add(nova);
    }
       
    //  j) Implemente nesta mesma classe o método remove(nome), que remove da lista a
    //  data comemorativa que possui o parâmetro nome fornecido.
    public void remove(String data){
        colecao.remove(colecao.indexOf(data));
    }
        
    //  k) Implemente um método chamado horasNaoTrabalhadas(), o qual deve retornar a
    //  quantidade de horas não trabalhadas. Para tal, deve-se contar a quantidade de
    //  datas comemorativas que são feriados e multiplicá-la por 8 (oito) que é a carga
    //  horária diária usual de trabalho.
    public int horasNaoTrabalhadas(){
        int nTrab = 0;
        for(DataComemorativa aux : colecao){
            if(aux.feriado == 's' || aux.feriado == 'S'){
                 nTrab = nTrab + 8;
            }
        }
        return nTrab;
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
        System.out.println(data2.compara(data));
        DataComemorativa natal = new DataComemorativa(25, 12, 2022, "Natal", 'S', 'S' );
        System.out.println(natal.mundial);
    }
}
