class Dog{
    String name;
    public static void main(String[] args) {
        B b = new B();
         
    }

    private void bark() {
        /**
        Author: Deepak Singh
        Time: 2023-05-01T15:11:28
        Comment: 'Local variables must be initialized else they will cause an error'
        */
        int a = 5;
        System.out.println(name + a + " says Ruff!");
    }
}

class A{
    A(){
        System.out.println("A constr");;
    }
    A(int a){
        System.out.println("A overloaded constr");
    }
}

class B extends A{
    B(){
        super(5);
        System.out.println("B Constr");
    }
}