class Book{
    String title;
    String author;
    boolean availability;
    String ISBN;
    Book(String title,String author){
        this.title=title;
        this.author=author;
  
        this.availability=true;
    }
    public void borrowbook(){
        if(availability==true){
            availability=false;
            System.out.println(" title:"+this.title+"book is issued");
        }
        else{
            System.out.println("the book is not available");
        }
    }
    public void displayBook(){
        System.out.println(this.title);
        System.out.println(this.author);
      
    }
    public void returnbook(){
        if (availability==false){
            availability=true;
            System.out.println("the book is  return");

        }else{
            System.out.println("the book is not returned");
        }
    }
    public boolean availability(){
        return this.availability;
    }


}
class User{
    String name;
    int userId;

    User(String name,int userId){
        this.name=name;
        this.userId=userId;
    }


}
class Student extends User{
     int age;
    Student(int age,String name, int userId){
        super(name,userId);
        this.age=age;
    }
    void display(){
        System.out.println("name:"+this.name);
        System.out.println("age:"+this.age);
        System.out.println("userId:"+this.userId);
    }
    void borrowBook(Book book){
        if(book.availability==true){
            book.borrowbook();
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }
    void returnbook(Book book){
        book.returnbook();
    }
}

class Staff extends User{
    int age;
   Staff(int age,String name, int userId){
       super(name,userId);
       this.age=age;
   }
   void display(){
       System.out.println("name:"+this.name);
       System.out.println("age:"+this.age);
       System.out.println("userId:"+this.userId);
   }
   void borrowBook(Book book){
       if(book.availability=true){
           book.borrowbook();
       } else {
        System.out.println("Sorry, the book is not available.");
       }
   }
   void returnbook(Book book){
       book.returnbook();
   }
}


public class Library_Management {
    public static void main(String[] args) {
        Book b1=new Book("achievements","livingston");
        b1.displayBook();
        Student s1=new Student(12,"athi",120);
        s1.borrowBook(b1);
        System.out.println("Book availability after borrowing: " + b1.availability());
        s1.returnbook(b1);
        System.out.println("Book availability after returning: " + b1.availability());
    }
}
