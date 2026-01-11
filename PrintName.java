
package mypackage;

public class Myclass {
    public void getNames(String s) {
        System.out.println(s);
    }
}


import mypackage.Myclass;

public class printName {]'
    public static void main(String[] args) {
        String name = "welcome"; 
        Myclass obj = new Myclass();
        obj.getNames(name); 
    }
}

