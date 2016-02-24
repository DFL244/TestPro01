public class MyClass {

    private static MyClass myClass  = null;
    
    // Pertence a la clase y lo comparten todas las instancias
    private static int CLASS_INSTANCES_COUNT = 0;
    
    // Existe uno por cada instancia de la clase
    private int objectInstancesCount = 0;
    
    private MyClass(){
        
        MyClass.increaseClassInstances();
        objectInstancesCount += 1;
    }
    
    public static MyClass getInstance(){
        if (myClass == null){
            myClass = new MyClass();
        }
        return myClass;
    }
    
    public static void increaseClassInstances(){
        MyClass.CLASS_INSTANCES_COUNT += 1;
    }
    
    public static int getClassInstancesCount(){
        
        return MyClass.CLASS_INSTANCES_COUNT;
    }
    
    public int getObjectInstancesCount(){
        
        return this.objectInstancesCount;
    }
    
    public static void main(String[] args) {
        
        
        MyClass myClassA = MyClass.getInstance();
        MyClass myClassB = MyClass.getInstance();
        
        System.out.println("Total instances: " + MyClass.getClassInstancesCount());
        System.out.println("myClassA instances: " + myClassA.getObjectInstancesCount());
        System.out.println("myClassB instances: " + myClassB.getObjectInstancesCount());
    }
    
}