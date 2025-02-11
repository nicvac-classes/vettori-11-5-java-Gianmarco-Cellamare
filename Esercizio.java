
import java.util.Scanner;
import java.util.Random;

public int eliminazione(int [] V=new int []) {
    int i,N2;
    N2=N-1;
    i=ie;
    while (i <= N-2){
        V[i]=V[i+1];
        i=i+1;
    }
return N2;

}

class Esercizio {

    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );

        int N,i,j,ie;
        int [] V=new int [N];
        System.out.print("Inserisci il numero dei listelli");
        N = in.nextLine();
        i=ie;
        i=0;
        while (i<N){
            V[i]=random(4+10-14)+1;
            i=i+1;
            System.out.println("Lunghezza" +i+ "listello: " +V[i]);
        }
        int contCoppie,cornicirettangolari;
        bool Coppietrovate;
        while (i<N-1){
            while (j<N){
                if(V[i] == V[j]){
                    N2=eliminazione(V,N,ie);
                    Coppietrovate=true;
                    contCoppie++;
                }else{
                    Coppiatrovata=false;
                }
                j=i+1;
            }
            i=i+1;
        }
        cornicirettangolari=contCoppie/2;
        System.out.println("Le cornici rettangolari che possono essere prodotte sono" +cornicirettangolari);


    }
}

