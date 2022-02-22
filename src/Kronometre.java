import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kronometre implements Runnable {

    private String theardingname;
    private Thread t;

    public Kronometre(String theardingname) {
        this.theardingname = theardingname;
        System.out.println("Thearding Created Nane  :  " + theardingname);
    }

    @Override
    public void run() {
        File file = new File("C:\\Users\\İbrahim\\files\\src\\data.txt");
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void start(){
        if(t !=null){
                t = new Thread(this,theardingname);
                t.start();
        }
    }

}