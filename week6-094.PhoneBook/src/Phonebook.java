import java.util.ArrayList;
public class Phonebook {
    
    private ArrayList<Person> people = new ArrayList<Person>();
    
    
    public void add(String name, String number){
        Person temp = new Person( name, number);
        people.add(temp);
    }
    public void printAll(){
        for( Person temp : people){
            System.out.println(temp);
        }
    }
    public String searchNumber(String name){
        int i=0;
        while(i<people.size()){ 
            Person tempor = people.get(i);
            if(tempor.getName().equals(name)){
                return tempor.getNumber();
                
            }
            i++;
        }
        return "number not known";
    }
}
