package kr.han.toy.reservation.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {

    @Autowired
    private DataSource dataSource;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        // ensure the passwords are encoded properly
        User.UserBuilder users = User.withUsername()
            auth
                .jdbcAuthentication()
                .dataSource(dataSource)
                .withDefaultSchema()
                .withUser(users.username("user").password("password").roles("USER"))
                .withUser(users.username("admin").password("password").roles("USER","ADMIN"));
    }

    /**
     * In-memory Configuration
     * @return
     * @throws Exception
     */
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
