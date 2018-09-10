import org.junit.Assert;
import org.junit.Test;

public class test_calculatrice {

    @Test //Ajoute avant la création de chaque methode
    public void test1plus1()
        {
            //Arrange
            int arg1 = 1;
            int arg2 = 1;
            int expectResult = 2;

            //Action
        int returnResult = calculatrice.add(arg1, arg2);

        //Assert - verifier
            //On passe la variable du resultat "returnResult"attendu
            Assert.assertEquals(expectResult, returnResult);
    }

    //.............. Methode test Max (pour simuller une erreur)

    //Dossier de test
    //Cas de dépassement de limite
    @Test(expected = IndexOutOfBoundsException.class)
    public void testMax()
    {
        //Arrange
        int arg1 = Integer.MAX_VALUE;
        int arg2 = 1;
        int expectResult = 2;

        //Action
        int returnResult = calculatrice.add(arg1, arg2);
    }



}


