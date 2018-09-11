public class   calculatrice {


    public static int add (int a, int b)throws IndexOutOfBoundsException
        {
        //return 0;

            //la condition suite est pour créer une exeption (MAX+1 = MIN
            // cela veut dire la case binaire est pleine et ca cree une exception)
            //le code suivant est fait pour créer une erreur
        if(a > 0 && b > 0 && a + b <= 0 )
        {
            //Appel de la classe throw avec instance de IndexOutOfBoundsException
            throw new IndexOutOfBoundsException();
        }

        // resultat attendu sans erreur (Exception)
        return a + b;
        }

    public static int soustract (int a, int b){
        //resultat attendu sans erreur (Exception)
        return 0;
    }
}

