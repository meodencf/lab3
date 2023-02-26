
package bai2lab3;
import java.util.Scanner;
public class Student{ 
    //thuoc tinh
    public String stID;
    public String stName;
    public String stClass;
    //phuong thuc khong co tham so
    public Student(){
        
    }
    //phuong thuc co tham so
    public Student(String stID,String stName,String stClass){
        this.stID=stID;
        this.stName=stName;
        this.stClass=stClass;
        
    }
    //phuong thuc Studen
    public Student(Scanner sc){
        int st;
        System.out.println("nhap st");
        st=sc.nextInt();
    }
    //phuong thuc get tra ve gia tri cho thuoc tinh
    public String getstID(String stID){
        this.stID=stID;
        return this.stID;
    }
    public String getstName(String stName){
        this.stName=stName;
        return this.stName;
    }
    public String getstClass(String stClass){
        this.stClass=stClass;
        return this.stClass;
    }
    // phuong thuc set thay doi gia thi thuoc tinh
    public void setstID(){
        this.stID=stID;
    }
    public void setstName(){
        this.stName=stName;
    }
    public void setstClass(){
        this.stClass=stClass;
    }
    //phuong thuc hien thi
    @Override
    public String toString(){
        return "("+"stID="+stID+",stName="+stName+",stClass="+stClass+")";

    }
    public class LibraryCard {
        //thuoc tinh
        public long lbCode;
        public String owner;
        public int borrowCount;
        //phuong thuc khong tham so
        public LibraryCard(){
            
        }
        //phuong thuc co tham so
        public LibraryCard(long lbCode,String owner,int borrowCount){
            this.lbCode=lbCode;
            this.owner=owner;
            this.borrowCount=borrowCount;
        }
        //phuong thuc get tra ve gia tri
        public long getLbCode(){
            this.lbCode=lbCode;
            return this.lbCode;
        }
        public String Owner(){
            this.owner=owner;
            return this.owner;
        }
        public int getBorrowCount(){
            this.borrowCount=borrowCount;
            return this.borrowCount;
        }
        // phuong thuc set thay doi gia tri
        public void setLbCode(){
            this.lbCode=lbCode;
        }
        public void setOwner(){
            this.owner=owner;
        }
        public void checkOut(Scanner sc){
            int num=sc.nextInt();
        }
        @Override
        public String toString(){
            return "("+"ibCode="+lbCode+",owner"+owner+")";
        }
    }
    public class Book {
        //thuoc tinh
        public String boCode;
        public String boTitle;
        public String boAuthor;
        //phuong thuc khong tham so
        public Book(){
            
        }
        //phuong thuc co tham so
        public Book(String boCode,String boTitle,String boAuthor){
            this.boCode=boCode;
            this.boTitle=boTitle;
            this.boAuthor=boAuthor;        
        }
        //phuong thuc book
        public Book(Scanner sc){
            String bo=sc.nextLine();        
        }
        //phuong thuc get tra ve gia tri
        public String getboCode(){
            this.boCode=boCode;
            return this.boCode;
        }
        public String getboTitle(){
            this.boTitle=boTitle;
            return this.boTitle;
        }
        public String getboAuthor(){
            this.boAuthor=boAuthor;
            return this.boAuthor;
        }
        //phuong thuc set thay doi gia tri
        public void settboCode(){
            this.boCode=boCode;        
        }
        public void setboCode(){
            this.boTitle=boTitle;
        }
        public void setboAuthor(){
            this.boAuthor=boAuthor;
        }
        //phuong thuc hien thi
        @Override
        public String toString(){
            return"("+"boCode="+ boCode+", boTitle="+boTitle+",boAuthor="+boAuthor+")";
        }
}
}
