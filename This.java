class New{
    int rollno;
    String name;
    int fees;
    New(int rollno,String name,int fees){
        this.rollno = rollno;
        this.name = name;
        this.fees = fees;}
        void display(){
            System.out.println(rollno+" "+name+" "+fees);
        }
    
}
class This{
    public static void main(String[] args) {
        New n1 = new New(100,"Shashank",4500);
        New n2 = new New(900,"XAEr",5500);
        n1.display();
        n2.display();
    }
}