package mernisDemo;

public class KPSDemo {
    public boolean checkPerson(String name, String identity){
        if(!name.isEmpty() && identity.length()==11 ){
            return true;
        }else{
            return false;
        }
    }
}
