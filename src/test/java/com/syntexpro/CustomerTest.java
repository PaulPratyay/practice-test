package com.syntexpro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing Customer Information")
public class CustomerTest {

    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer();
    }

    @DisplayName("Testing data for Customer Name")
    @Test
    void customerTest() {
        customer.setName("Pratyay Paul");

        assertEquals("Pratyay Paul", customer.getName());
    }
}
