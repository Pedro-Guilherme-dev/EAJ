public class lampada {
    private String tipo;
    private String cor;
    private int potencia;
    private boolean estado;

    public String getTipo () {
        return tipo;
    }
    public void setTipo (String tipo) {
        this.tipo = tipo;
    }
    public String getCor () {
        return cor;
    }
    public void setCor (String cor) {
        this.cor = cor;
    }
    public int getPotencia () {
        return potencia;
    }
    public void setPotencia (int potencia) {
        this.potencia = potencia;
    }
    public boolean getEstado () {
        return estado;
    }
    public void setEstado (boolean estado) {
        this.estado = estado;
    }

    public void status () {
        System.out.println("Tipo - " + this.tipo); 
        System.out.println("Cor - " + this.cor); 
        System.out.println("Potência - " + this.potencia); 
        System.out.println("Estado - " + this.estado);
    }

    public void trocarLampada (int potencia) {
        if ((estado == false)&&(potencia >= this.potencia)) {
            System.out.println("Lampada pode ser trocada");
        }else{
            System.out.println("Imcompatível");
        }
    }
}
