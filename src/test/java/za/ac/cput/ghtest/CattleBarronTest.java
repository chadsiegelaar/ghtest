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
import static org.junit.jupiter.api.Assertions.*;
 
/**
 *
 * @author Lihle Langa 217181147
 */
public class CattleBarronTest {

private CattleBarron Cattle1;
private CattleBarron Cattle2;
private CattleBarron Cattle3;
private CattleBarron Cattle4;
    

    @BeforeEach
    public void setUp() {
    Cattle1 = new CattleBarron();
    Cattle2 = new CattleBarron();
    Cattle3 = new CattleBarron();
    Cattle4 = new CattleBarron();
Cattle1 = "Bonsmara";
Cattle2 ="Brahman";
Cattle3 = Cattle1;
Cattle4 == Cattle2;
    }

   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
@Test
public void testEquality(){
 assertEqual(Cattle1, Cattle3);
}
@
public void testIdentity(){
assertSame(Cattle3, Cattle2 );
}
@
public void failTest(){
try{
fail("test failed");
}catch(Exception e){
e.printStackTrace();
assertTrue(true);}

}

@Test(timeout = 20)
public void testTimeout() throws InturruptedException{

while (true){
Thread.currentThread().sleep(50)
}
  }


@Test
@Disabled
public void DisablingTest(){
//test will be skipped
}
 }
