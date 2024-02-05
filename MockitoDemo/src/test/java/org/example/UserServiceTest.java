package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {


    @Test
    public void testGetUserById() {
        // Create a mock UserRepository
        UserRepository mockRepository = mock(UserRepository.class);

        // Configure the mock to return a specific User object when findById is called
        when(mockRepository.findById(1L)).thenReturn(new User(1L, "John Doe"));

        // Create an instance of UserService with the mocked UserRepository
        UserService userService = new UserService(mockRepository);

        // Call the method under test
        User result = userService.getUserById(1L);

        // Verify the result
        assertEquals("John Doe", result.getName());

        // Verify interaction with mock
        verify(mockRepository).findById(1L);
    }

}