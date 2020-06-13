
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


class SILab2Test2 {

    private final SILab2 lala = new SILab2();
    private static User user1;
    private static User user2;
    private static User user3;
    private static User user4;
    private static User user5;
    private static User user6;
    private static User user7;
    private static User user8;
    private static List<String> allUsers1;
    private static List<String> allUsers2;

    @BeforeAll
    static void init(){
        System.out.println("Initializing the expected paramethars ");
        user1 = null;
        user2 = new User("Damjan", "Ajdecurice", "damjan999@gmail.com);
        user3 = new User("Damjan2", "Misejade", "damjanbezmajmunche.com");
        user4 = new User("Damjan", "Mnogumisejade", "damjan.999@gmail,com");
        user5 = new User(null, "haos", "damjan@gmail.com");
        user6 = new User(null, "majkami", "mozhdakjebidamkreativen@gmail.com");
        user7 = new User("Damjannn", "foodiwant", "damjan.ilic999@gmail.com");
        user8 = new User("hurdadurp123", "solomon", null);
        allUsers1 = new ArrayList<>(5);
        allUsers2 = new ArrayList<>(2);
        allUsers2.add("Damjan");
        allUsers2.add("Damjan2");
    }

    @AfterAll
    static void destroy(){
        System.out.println("The tests are done");
    }

    @Test
    void EachStatementTests(){
        assertAll(
                () -> assertFalse(SILab2.function(user1, allUsers1)),
                () -> assertTrue(SILab2.function(user2, allUsers1)),
                () -> assertFalse(SILab2.function(user3, allUsers1)),
                () -> assertFalse(SILab2.function(user4, allUsers1)),
                () -> assertFalse(SILab2.function(user5, allUsers1))
        );