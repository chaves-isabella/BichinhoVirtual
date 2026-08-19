public class BichinhoVirtual {
    private String nome;
    private int fome;
    private int energia;
    private String humor;


    public BichinhoVirtual (String nome){
        this.nome = nome;
        energia = 50;
        fome = 50;
        humor = "Normal";
    }

    @Override
    public String toString() {
        return "BichinhoVirtual{" +
                "nome='" + nome + '\'' +
                ", fome=" + fome + getHumor() +
                ", energia=" + energia +
                ", humor='" + humor + '\'' +
                '}';
    }

    public BichinhoVirtual(String nome, int fome, int energia, String humor) {
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
    if(fome >= 0 && fome <= 100) {
        this.fome = fome;
    }else {
        IO.println("Digite um valor válido: ");
    }

    }

    public int getEnergia(){
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia >= 0 && energia <= 100){
            this.energia = energia;
        }else{
            IO.println("Digite um valor válido: ");
        }
    }


    public String getHumor(){
        int x = energia - fome;
        if (x > 75){
            return humor = "Muito feliz";
        } else if (x >= 50) {
            return humor = "Feliz";
        } else if (x >= 0) {
            return humor = "Normal";
        } else if (x > -30) {
            return humor = "Cansado";
        }else {
            return humor = "Triste";
        }
    }


}