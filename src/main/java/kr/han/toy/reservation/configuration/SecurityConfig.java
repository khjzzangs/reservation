package kr.han.toy.reservation.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private DataSource dataSource;


    @Autowired
    public void configureGlobal( AuthenticationManagerBuilder auth )  throws Exception {
        User.UserBuilder user = User.withUsername("test");
            auth.jdbcAuthentication()
                .dataSource(dataSource)
//                .withDefaultSchema()   // HSQLDB의 DB스키마를 실행함 (MariaDB에는 안맞음)
                .withUser(passwordEncoder().encode("test"))
                .roles("USER");
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
                        .password(passwordEncoder().encode("test"))
                        .roles("USER")
                        .build();
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(users);
        return manager;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
