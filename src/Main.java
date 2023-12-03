import org.w3c.dom.ls.LSOutput;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Function function = new Function() {
            @Override
            public boolean method(int number, int number2) {
                if ((number * number2) == (number + number2)) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        function.method(2, 2);

      /*  Equal<Boolean, Integer,Integer> t=new Equal<Boolean, Integer, Integer>() {
            @Override
            public Boolean monday(Integer integer, Integer integer2) {
                if((integer * integer2)== (integer+integer2) {
                    return true;

                //}else{
                    return false;
                }
            }
        };

        System.out.println(t.monday(2,3));*/

        System.out.println(getInterface().method(" Айгерим"));
    }

    public static InterfaceGeneric<String> getInterface() {
        InterfaceGeneric<String> interfaceGeneric = new InterfaceGeneric<String>() {
            @Override
            public String method(String s) {
                return "Сиздин атыныз" + s;
            }
        };
        return interfaceGeneric;
    }

    Palindrom<String> palindrom = new Palindrom<String>() {
        @Override
        public void method(String s) {
            int counter = 0;
            if (s instanceof String) {
                String[] array = s.split("");
                for (int i = 0; i < array.length; i++) {
                    for (int j = array.length - 1; j > 0; j--) {
                        if (array[i].equals(array[j])) {
                            counter++;
                        }
                    }
                }
                if (counter == array.length / 2) {
                    System.out.println("Palindrom");
                } else {
                    System.out.println("Not palindrom");
                }
            }
        }
    };



}








