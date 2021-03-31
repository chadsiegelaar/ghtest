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
 * @author
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
    /**
 *
 * @author Levi Williams Student Number 218250142

 */
public class AnimalTest {
    
    private Animal animal1;
    private Animal animal2;
    private Animal animal3;
    
    public AnimalTest() {
    }
    
    
    
    @BeforeEach
    public void setUp() {
        animal1 = new Animal();
        animal2 = new Animal();
        animal3 = animal1;
    }
    
    @Test
    public void testEquality(){
    assertEquals(animal1,animal3);
    }
    
    @Test
    public void testIdentity(){
    assertSame(animal1,animal3);
    }
    
    @Test
    @Disabled
    public void testSetAnimal(){
    System.out.println("Ignore Test");
    }
    
    @Test
    public void testGetAnimal(){
        fail("This will fail");
    assertEquals(animal1,animal3);
    }
    
   
    
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
}
