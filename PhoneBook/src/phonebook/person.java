package phonebook;


public class person { 
    String person; 
    String workNum; 
    String homNum; 
    String cellNum; 
    
    person next; 
    public person(String person,String workNum,String homNum,String cellNum)
    { 
    this.person=person;
    this.workNum=workNum;
    this.homNum=homNum;
    this.cellNum=cellNum;
    next=null; 
    }
    
}
