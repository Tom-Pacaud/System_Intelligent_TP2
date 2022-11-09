public class Individu {

    private int taille;
    private Cellule[] individu;
    private int fitness;

    public Individu(int taille){

        this.taille = taille;
        individu = new Cellule[taille];
        initialiserIndividu();

    }

    public void initialiserIndividu(){
        for (int x = 0; x < taille; x++){
            double a = Math.random();
            int value = 0;
            if (a < (0.5)){
                value = 0;
            }
            else {
                value = 1;
            }
            individu[x] = new Cellule(x,value);
        }
        int c = 0;
        for (int x = 0; x < taille; x++){
            if (individu[x].getValue() == 1) {
                int bit = (int)Math.pow(2, taille - 1 - x);
                c = c + bit;
            }
        }
        fitness = c;
    }

    public int getFitness() {
        return fitness;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < taille; i++){
            s = s + individu[i].getValue();
        }
        return s;
    }
}
