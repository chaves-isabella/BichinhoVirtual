public class BichinhoVirtual {
    private String nome;
    private int fome;
    private int energia;
    private int humor;

    public BichinhoVirtual (String nome, int fome, int energia, int humor){
        this.nome = nome;
        this.fome = fome;
        this.energia = energia;
        this.humor = humor;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getFome(){
        return fome;
    }
    public void setFome(int fome){
        this.fome = fome;
    }

    public int getEnergia(){
        return energia;
    }
    public void setEnergia(int energia){
        this.energia = energia;
    }

    public int getHumor(){
        return humor;
    }
    public void setHumor(int humor){
        this.humor = humor;
    }

}