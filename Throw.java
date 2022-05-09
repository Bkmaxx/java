class Throw{
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Person not allowed to vote");
        }
        else{
            System.out.println("Person allowed to vote");
        }
    }
    public static void main(String[] args) {
        validate(13);
        System.out.println("sdfdsf");
    }
}