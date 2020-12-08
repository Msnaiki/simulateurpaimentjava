package premierbrief;
import java.util.Scanner;
public class Lamain {

	public static void main(String[] args) {
		String nom, prenom;
		double ht,tarrif,tarrif2,resultat;
		boolean menu = true;
		Scanner scan = new Scanner(System.in);
		while(menu) {
		System.out.println("marhba" );
		System.out.println("veuillez introduire le nom et le prenom" );
		nom = scan.next();
		prenom = scan.next();
		System.out.println("mrhba b: "+ nom+" "+prenom  );
		System.out.println("veuillez introduire le nombre d'heurs travaillé et le tarif par heur en dh" );
		ht=scan.nextDouble();
		tarrif=scan.nextDouble();
		if (ht<=60 && ht>0) {
			if (ht<=40) {
				
				ht=ht*tarrif;
				System.out.println(" le tarif est :"+ht );
			}
			else {
				tarrif2=tarrif+tarrif*0.5;
				resultat=(40*tarrif)+((ht-40)*tarrif2);
				System.out.println(" le tarif est :"+resultat );
				/*tarif = 40*tarif + heurssup*/
			}
		}
		else {
			if (ht>60 && ht<=70) {
				System.out.println("votre cas n'est pas spécifié dans l'exercice" );
			}
			if (ht>70) {
				System.out.println(" informations errones !" );
			}
		}
		
		}
	}
		

}
