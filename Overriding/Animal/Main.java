 abstract class Animal{
    public  abstract void makesound();
}

class dog extends Animal{
    @Override public void makesound(){
        System.out.println("BHOW BOW"); 
    }
    
}

class cat extends Animal{
    @Override public void makesound(){
        System.out.println("Meaw Meaw");
    }
}


public abstract class Main {
    public static void main(String[] args) {
        Animal an = new dog();
        an.makesound();

        Animal c = new cat();
        c.makesound();
    }
}
