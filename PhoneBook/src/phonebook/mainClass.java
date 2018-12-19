package phonebook;
import java.util.Scanner; 

public class mainClass {
 public static void main(String[] args){
  Scanner input=new Scanner(System.in); 
  boolean i=true;
                 
  linkedList lL = new linkedList(); 
  do{
      System.out.println("Welcome to USER's Phone Book!");
      System.out.println("1. Create New Person\n" + "2. Delete\n" + "3. Number of People\n" + "4. Search a Person\n"
      + "5. Search a Phone Number\n" + "6. List All\n" + "7. Exit"); 
      int selection = input.nextInt(); 
      switch(selection){ 
          case 1: 
              System.out.println("Enter the name of the person:");
              String person=input.next();
              System.out.println("Enter the work phone of the person:");
              String workNum=input.next();
              System.out.println("Enter the home phone of the person:");
              String homNum=input.next();
              System.out.println("Enter the cell phone of the person");
              String cellNum=input.next();
              lL.create(person,workNum,homNum,cellNum); 
                                                      
              System.out.println("Person successfully created!");
              break; 
          case 2:
              System.out.println("Enter the name of the person to be deleted:");
              String name=input.next();
              lL.delete(name);
              System.out.println("Person successfully deleted!");
              break;
          case 3:
              System.out.println("There are " + lL.numberofPerson()+ " person in the phone book.");
              break;
          case 4:
              System.out.println("Enter the name of the person to be searched:");
              String name1=input.next();
              lL.searchPerson(name1);
              break;
          case 5:
              System.out.println("Enter the number of the person to be searched:");
              String number=input.next();
              lL.searchNumber(number);
              break;
          case 6:
              lL.listAll();
              break;
          case 7:
              i=false; 
              System.out.println("Exit successfully!");
              break;
          default:
              System.out.println("Error!!"
                      + "You entered an invalid number"
                      + "Enter 1-7:");
              break;
            }
       }
  while(i);
    }
}
