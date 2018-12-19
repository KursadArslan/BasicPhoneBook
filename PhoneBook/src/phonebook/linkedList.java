package phonebook;

public class linkedList { 
    person first=null;
    person end=null;
   
    
    public void create(String person,String workNum,String homNum,String cellNum)
    {
    person k = new person(person,workNum,homNum,cellNum);
    if(first==null){
    first=k;
    end=k;
    }  
    else{
    end.next=k;
    end=k;
    }
    }
    public void delete(String name)
    {
     person tmp; 
     tmp=first;
     person previous=first;
     while(tmp!=null)
     {
     if(tmp.person.equals(name))
     {                          
         break;
     }
     previous=tmp;
     tmp=tmp.next;
     }
     if(tmp==null)
     {
         System.out.println("Person is not on the phone book!");
     }
     {
       if(first==end)
       {
       first=null;
       end=null;
       }
       if(tmp==first)
       {
       first=tmp.next;
       }
       if(tmp==end)
       {
       end=previous;
       previous.next=null;
       }
       else
       {
       previous.next=tmp.next;
       }
     }
    }
    public int numberofPerson()
    {
    person tmp;
    tmp=first;
    int counter=0;
    while(tmp!=null)
    {
    counter++;
    tmp=tmp.next;
    }
    return counter;
    }
    public void searchPerson(String name)
    {
    person tmp;
    tmp=first;
    int counter=0;
    int counter2=0;
    while(tmp!=null)
    {
    counter++;
    if(tmp.person.equals(name))
    {
    counter2++; 
    System.out.println("Person is in " +counter+". place."); 
    System.out.println("*********************");
    System.out.println("Person: "+tmp.person);//kisi adi
    System.out.println("Work Phone: "+tmp.workNum);
    System.out.println("Home Phone: "+tmp.homNum);
    System.out.println("Cell Phone: "+tmp.cellNum);
    System.out.println("*********************");
    }
    tmp=tmp.next;
    }
    if(counter2==0)
    { 
    System.out.println("Person is not on the phone book!");
    }
    }
    public void searchNumber(String number)
    {
   person tmp; 
    tmp=first;
    int counter=0;
    int counter2=0;
    while(tmp!=null)
    {
    counter++;
    if(tmp.workNum.equals(number))
    {
    counter2++;
    System.out.println("Work phone is found!");
    System.out.println("Person is in " +counter+". place.");
    System.out.println("*********************");
    System.out.println("Person: "+tmp.person);
    System.out.println("Work Phone: "+tmp.workNum);
    System.out.println("Home Phone: "+tmp.homNum);
    System.out.println("Cell Phone: "+tmp.cellNum);
    System.out.println("*********************");
    }
    else if(tmp.homNum.equals(number))
    {
    counter2++;
    System.out.println("Home phone is found!");
    System.out.println("Person is in " +counter+". place.");
    System.out.println("*********************");
    System.out.println("Person: "+tmp.person);
    System.out.println("Work Phone: "+tmp.workNum);
    System.out.println("Home Phone: "+tmp.homNum);
    System.out.println("Cell Phone: "+tmp.cellNum);
    System.out.println("*********************");
    }
    else if(tmp.cellNum.equals(number))
    {
    counter2++;
    System.out.println("Person is in " +counter+". place.");
    System.out.println("*********************");
    System.out.println("Person: "+tmp.person);
    System.out.println("Work Phone: "+tmp.workNum);
    System.out.println("Home Phone: "+tmp.homNum);
    System.out.println("Cell Phone: "+tmp.cellNum);
    System.out.println("*********************");
    }
    tmp=tmp.next;
    }
    if(counter2==0)
    {
    System.out.println("Person is not on the phone book!");
    }
  
    }
    public void listAll()
    {
    person tmp;
    tmp=first;
    int counter=0;
    while(tmp!=null) 
    {
    counter++;
    System.out.println("*********************");
    System.out.println("Name: "+tmp.person+"\n"+"Work Phone: "+tmp.workNum+"\n"+
            "Home Phone: "+tmp.homNum+"\n"+"Cell Phone: "+tmp.cellNum);
     System.out.println("*********************");
     tmp=tmp.next;
    
    }
    if(counter==0)
        System.out.println("Phone book is empty.");
    }
    
    
    
}
