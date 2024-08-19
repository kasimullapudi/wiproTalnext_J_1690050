package pbl_app_Oops;
import java.util.*;
 
class Author{
    private String name;
    private String email;
    private char gender;
    public Author(String name,String email,char gender){
        setName(name);
        setEmail(email);
        setGender(gender);
    }
    public void setName(String name){
        this.name=name;
    }
    public  void setEmail(String email){
        this.email=email;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public  void getName(){
        System.out.println("Name: "+this.name);
    }
    public  void getEmail(){
        System.out.println("Email: "+this.email);
        
    }
    public  void getGender(){
        System.out.println("Gender: "+this.gender);
        
    }
    public void getAuthorDetails(){
        getName();
        getEmail();
        getGender();
    }
    
}
class Book extends Author{
    private String name;
    private double price;
    private int qntyInStock;
    
    public Book(String name,String email,char gender, String bookname,double price,int qnty){
        super(name,email,gender);
        setName(bookname);
        setPrice(price);
        setQnty(qnty);
    }
    public  void setName(String name){
        this.name=name;
    }
    public  void setPrice(double price){
        this.price=price;
    }
    public  void setQnty(int qnty){
        this.qntyInStock=qnty;
    }
    public  void getName(){
        System.out.println("Book name: "+this.name);
    }
    public  void getPrice(){
        System.out.println("Price: "+this.price);
        
    }
    public  void getQnty(){
        System.out.println("Quantity: "+this.qntyInStock);
        
    }
    public void getBookDetails(){
        getAuthorDetails();
        getName();
        getPrice();
        getQnty();
    }
}

public class EncapAbstract
{
	public static void main(String[] args) {
	    Book book=new Book("Stan lee","stanlee@.com",'M',"The avengers Comic",32.5,100);
	    book.getBookDetails();
	}
}
