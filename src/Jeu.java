import java.util.Scanner;
public class Jeu {
    public static void lancerJeu(){
        char commenceJeux = 'o';
        char saisiUsers;
        int result;
        System.out.println("Quel est le nom du joueur 1 ");
        Scanner scanner = new Scanner(System.in);
        Joueur joueur1 = new Joueur(scanner.nextLine());
        System.out.println("Quel est le nom du joueur 2 ");
        Joueur joueur2 = new Joueur(scanner.nextLine());
        debut();
        do{
            start(joueur1, joueur2);
            System.out.println("joueur " + joueur1.getNom() +", son score " + joueur1.getScore());
            System.out.println("joueur " + joueur2.getNom() +", son score " + joueur2.getScore());
            System.out.println("Voulez continuer de jouer ou voulez-vous arrêter la partie?");
            System.out.println("o pour oui, n pour non!");
            saisiUsers = scanner.next().charAt(0);
            result = Character.compare(commenceJeux, saisiUsers);
        }while(result == 0);

        if (joueur1.getScore() > joueur2.getScore()){
            System.out.println("Bravo "+ joueur1.getNom() +", vous avez gagné!");
        } else if (joueur2.getScore() > joueur1.getScore()) {
            System.out.println("Bravo "+ joueur2.getNom() +", vous avez gagné!");
        }else {
            System.out.println("match nul, vous avez tous les deux le même nombre de points!");
        }
    }
    public static void start(Joueur joueur1, Joueur joueur2){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est votre choix ? le tour est pour " + joueur1.getNom() +", pile ou face?");
        String choix = sc.nextLine();
        joueur1.setChoix(choix);
        System.out.println("Maintenant le tour est pour " + joueur2.getNom());
        choix = sc.nextLine();
        joueur2.setChoix(choix);
        System.out.println("Y a-t il un joueur favorisé ? o = oui, n = non");
        String fav= sc.nextLine();
        if (fav.equals("n")){
            String lancePileFace = lancerPiece();
            if (joueur1.getChoix().equals(lancePileFace) ){
                joueur1.setScore(joueur1.getScore() +1);
            }
            if (joueur2.getChoix().equals(lancePileFace)){
                joueur2.setScore(joueur2.getScore() +1);
            }
        }else{
            System.out.println("Voulez-vous favoriser le joueur 1 " + joueur1.getNom() +
                    ", ou le joueur 2 "+joueur2.getNom() +"?  1 pour joueur 1 et 2 pour joueur 2");
            String r = sc.nextLine();

            String choixFavorisant;
            if(r.equals("1")){
                choixFavorisant = joueur1.getChoix();
            }else{
                choixFavorisant = joueur2.getChoix();
            }
//            String lancePileFace = lancerPiece();
            if (joueur1.getChoix().equals(choixFavorisant) ){
                joueur1.setScore(joueur1.getScore() +1);
            }
            if (joueur2.getChoix().equals(choixFavorisant)){
                joueur2.setScore(joueur2.getScore() +1);
            }
        }
    }
    public static String lancerPiece(){
        Piece p = new Piece();
        return p.getPiece();
    }
    public static void debut(){
        System.out.println("---------------------------------*------------------------------");
        System.out.print("----------------");
        System.out.print("Commencement du jeu pile ou face");
        System.out.println("----------------");
    }
}
