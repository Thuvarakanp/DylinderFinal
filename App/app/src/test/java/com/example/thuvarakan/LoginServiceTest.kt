package com.example.thuvarakan

import com.example.thuvarakan.auth.LoginFragment
import org.junit.Assert.assertEquals
import org.junit.Test


class LoginServiceTest {

    @Test
    fun `test login with correct credentials`() {
        val loginService = LoginFragment()

        val result = LoginFragment("user@example.com", "password")

        assertEquals(LoginResult.SUCCESS, result)
    }

    @Test
    fun `test login with incorrect credentials`() {
        val loginService = LoginFragment()

        val result = LoginFragment("user@example.com", "wrongpassword")

        assertEquals(LoginResult.INVALID_CREDENTIALS, result)
    }
}

class LoginResult {

}
