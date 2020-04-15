package trabalhopooo;

public class Gerente extends Funcionario{
    private int senhaEspecial;
    private int nDeFuncionariosGerenciados;
    boolean liberado = false;
    void autenticar(int senha){
        if(senha == this.senhaEspecial){
            
        }
    }
    public Gerente(int n){
        this.setSenhaEspecial(n);
    }
    
    @Override
    public double getBonificacao(){
        this.setSalario((this.getSalario() * 0.10) + 1000);
        return this.getSalario();
    }
    
    public void autentica(int s){
        if(s == this.getSenhaEspecial()){
            this.liberado = true;
            System.out.println("Acesso liberado!");
        }
        else{
            System.out.println("Acesso negado!");
        }
    }
    
    private int getSenhaEspecial() {
        return senhaEspecial;
    }

    private void setSenhaEspecial(int senhaEspecial) {
        this.senhaEspecial = senhaEspecial;
    }

    public int getnDeFuncionariosGerenciados() {
        return nDeFuncionariosGerenciados;
    }

    public void setnDeFuncionariosGerenciados(int nDeFuncionariosGerenciados) {
        this.nDeFuncionariosGerenciados = nDeFuncionariosGerenciados;
    }
    
}
