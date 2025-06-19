class Logger {
    private static Logger instance;
    private Logger(){
    }
    public static Logger getInstance(){
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
public class Main{
    public static void main(String[] args){
        Logger obj1 = Logger.getInstance();
        Logger obj2 = Logger.getInstance();
        if(obj1 == obj2) System.out.println("Successful !");
        else System.out.println("Rejected!");
    }
}
