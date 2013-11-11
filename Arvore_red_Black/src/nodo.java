public class nodo {
    
    public String chave;
    public int valor;
    public nodo esq, dir,pai;
    public int n;
    boolean cor;
	public Object pai; 
    
    
    public nodo(String chave,int valor,boolean cor){
        this.chave                  =   chave;
        this.valor                  =   valor; 
        this.cor                    =   cor; 
    }
    
    
}