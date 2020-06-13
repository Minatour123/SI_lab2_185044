import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class SILab2Test {

    SILab2 obj = new SILab2();
    List<String> list = new ArrayList<String>();
    User user = new User("damjan2","moraneshtodastoi","damjan@gmail.com");

    @Test
    void everyBranch(){
        //user == null
        assertFalse(obj.function(null,list));

        //user.getUsername()=="damjan2" && user.getEmail()=="damjan@gmail.com" && !allUsers.contains(user.getUsername())
        assertTrue(obj.function(user, list));

        //user.getUsername() == null
        assertFalse(obj.function(new User(null, "moraneshtodastoi", "damjan@gmail.com"),list));

        //user.getEmail()=="damjan.999@gmail,com"
        assertFalse(obj.function(new User("damjan", "moraneshtodastoi", "damjan.999@gmail,com"), list));

    }
}