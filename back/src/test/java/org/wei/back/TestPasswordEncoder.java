package org.wei.back;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Author Liuchuwei
 * @Date 2024-04-22 19:11
 * @Description: Testing password encoder
 */

@SpringBootTest
public class TestPasswordEncoder {

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * testing password decoding
     */
    @Test
    public void testPasswordEncoder() {
        String encode = passwordEncoder.encode("123456");
        System.out.println(encode);
    }

    //$2a$10$ZkmOnzXjDVi7.xUXfkn.Eu8bZRnstDDZ2MPzFrYOWCBnUkiVxsJOG

    /**
     * Testing matching
     */
    @Test
    public void testPasswordEncoder2() {
        String pwd = "123456";
        String encode = "$2a$10$ZkmOnzXjDVi7.xUXfkn.Eu8bZRnstDDZ2MPzFrYOWCBnUkiVxsJOG";
        boolean isMatch = passwordEncoder.matches(pwd, encode);
        System.out.println(isMatch);

    }
}
