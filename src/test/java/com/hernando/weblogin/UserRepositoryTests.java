package com.hernando.weblogin;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
 
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private UserRepository repo;
     
    @Test
    public void testCreateUser() {
        Customer customer = new Customer();
        customer.setEmail("hernandogm73@gmail.com");
        customer.setPassword("password");
        customer.setFirstName("Hernan");
        customer.setLastName("Garcia");    
        Customer savedUser = repo.save(customer);       
        Customer existUser = entityManager.find(Customer.class, savedUser.getId());        
        assertThat(customer.getEmail()).isEqualTo(existUser.getEmail());
         
    }
}
