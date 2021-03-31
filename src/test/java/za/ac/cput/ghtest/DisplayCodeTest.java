/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.ghtest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kevin Mombo 
 Student branch
 * ENTER CODE BELOW!
 */
public class DisplayCodeTest {
    
    public DisplayCodeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    @Test // Kevin Mombo
    public void Failingtest() {
        fail("Hello Everyone ");
    }
    @Test //kevin Mombo
    public void testEquality(){
        String obj1 = "Junit";
        String obj2 = "Junit";
        assertEquals(obj1, obj2);
    }
    @Test //Kevin Mombo
    public void testIdentity(){
        String obj3 = "Kevin";
        String obj4 = "Kevin";
        assertSame(obj3, obj4);
    }
    @Test //Kevin Mombo
    @Disabled
    public void disabledTest(){
     int a = 12;
     int b = 10;
     int sum = a + b;
        System.out.println("The Sum of a + b = " +sum);
    }
}
