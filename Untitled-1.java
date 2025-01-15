// UserServiceTest.java
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserServiceTest {
    private UserService userService;
    private UserDAO userDAO;

    @BeforeEach
    public void setUp() {
        userDAO = mock(UserDAO.class);
        userService = new UserService(userDAO);
    }

    @Test
    public void testRegisterUser() {
        User user = new User("testUser", "password");
        when(userDAO.save(user)).thenReturn(true);

        boolean result = userService.registerUser("testUser", "password");
        assertEquals(true, result);

        verify(userDAO, times(1)).save(user);
    }
}
