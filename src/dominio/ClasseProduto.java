package dominio;
import java.time.LocalDate;


public class ClasseProduto extends BaseParametro{
    public ClasseProduto(){
        //deve apontar pro construtor vazio do pai
        super(); //chama o construtor vazio pai
    }

    public ClasseProduto(int codigo, String descricao, LocalDate dataDeInclusao){
        super(codigo, descricao, dataDeInclusao);
    }
} //ClasseProduta herda BaseParametro
