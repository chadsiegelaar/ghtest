/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.ghtest;
 /*
 * @author Lihle Langa
 */


public class CattleBarron {
private String cattlename, breed;

public String getCattleName(){
return cattlename;
}
public void setCattleName(String CattleName){
this.cattlename = CattleName;
}
public String getBreed(){
return breed;
}
public void setBreed(String Breed){
this.breed = Breed;
}

public String toString(){
return "CattleBarron {" + "Cattle Name: " + cattlename + " Breed: " + breed "}";
}


}
