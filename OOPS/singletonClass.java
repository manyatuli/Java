package OOPS;

public class singletonClass {
        private singletonClass(){
            System.out.println("Constructor called:  object created!");
        }

        private static singletonClass instanceVar;

        public static singletonClass getInstance(){
            if (instanceVar == null){
                instanceVar = new singletonClass();
            }
            System.out.println("Referencing existing object: "+instanceVar);
            return instanceVar;
        }
}
