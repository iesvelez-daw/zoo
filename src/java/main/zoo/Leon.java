package zoo;

public class Leon extends Mamifero {
 
    private String rugido = "GRRRRR";
    
    public Leon () {}
    
    public Leon (Habitat habitat, String comida, int longevidad, int periodoLactancia) {
        super(habitat, comida, longevidad, periodoLactancia);
    }
    
    public void setRugido (String rugido) { this.rugido = rugido; }
    
    public String getRugido () { return rugido; }
    
    public void rugir () { System.out.println(rugido); }
    
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    public void desplazar () { System.out.println("Estoy en busca de " + comida); }
}
