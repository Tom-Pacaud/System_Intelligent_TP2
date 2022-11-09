public class Tableau {

    private int taille;
    private int nbIndividu;
    private Individu[] tableau;

    public Tableau(int taille, int nbIndividu){

        this.taille = taille;
        this.nbIndividu = nbIndividu;
        tableau = new Individu[nbIndividu];
        initialiserTableau();

    }

    public int getTaille() {
        return taille;
    }

    public int getNbIndividu() {
        return nbIndividu;
    }

    public void initialiserTableau(){

        for (int i = 0; i < nbIndividu; i++){
            tableau[i] = new Individu(taille);
        }

    }

    public void roulette(){
        int[] listeFitness;
        listeFitness = new int[nbIndividu];
        int fitnessCumuler = 0;
        for (int x = 0; x < nbIndividu; x++){
            listeFitness[x] = tableau[x].getFitness();
            fitnessCumuler = fitnessCumuler + tableau[x].getFitness();
        }
        int aleatoire = (int)(Math.random()*fitnessCumuler);

    }

    public String toString(){
        String s = "";
        for (int i = 0; i < nbIndividu; i++){
            s = s + tableau[i].toString();
            s = s + " ---> fitness :" + tableau[i].getFitness() + "\n";
        }
        return s;
    }

}
