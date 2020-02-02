package kr.han.toy.reservation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() throws Exception {
        // ensure the passwords are encoded proØperly
        UserDetails users = User
                                .withUsername("test")
                                .passwordEncoder(PasswordEncoderFactories.createDelegatingPasswordEncoder()::encode)
                                .password("test")
                                .roles("USER")
                                .build();
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(users);
        return manager;
    }
}
