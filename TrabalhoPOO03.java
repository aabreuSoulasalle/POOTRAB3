
package trabalhopooo;

public class TrabalhoPOO03 {

    public static void main(String[] args) {
        System.out.println("NomeAluno: Abner Daniel matricula: 0050014445");
        Funcionario fun = new Funcionario();
        fun.setNome("Abner");
        fun.setCpf("130");
        fun.setSalario(2500);
        System.out.println("Nome: "+ fun.getNome());
        System.out.println("Cpf: "+fun.getCpf());
        System.out.println("Salario: " +(fun.getSalario()+fun.getBonificacao()));        
        System.out.println("");
        System.out.println("");        
        Gerente ger = new Gerente(123456);
        ger.setNome("Abner");
        ger.setCpf("130");
        ger.setSalario(2500);
        ger.autentica(123456);
        ger.autentica(654132);
        System.out.println("Nome: "+ ger.getNome());
        System.out.println("Cpf: "+ger.getCpf());
        System.out.println("Salario: " +(ger.getSalario()+ger.getBonificacao()));        
        
        
    }
    
}
