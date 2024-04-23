package org.wei.back.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Author Liuchuwei
 * @Date 2024-04-22 19:05
 * @Description: defing common configuration bean
 */

@Configuration
public class CommonConfig {

    /**
     * define bean for password encoding and mapping
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
