
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    static ArrayList<String> task = new ArrayList<>();

    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in); 
      boolean RUN = true;
      while (RUN) {
        System.out.println("Welcome to ToDoList"); 
        System.out.println("1. Show task list");
        System.out.println("2. Add task");
        System.out.println("3. Delete task");
        System.out.println("4. Exit");
        System.out.println("Make your choise :");
        
        String choise = sc.nextLine();

        switch(choise){
            case "1" -> showTask();
            case "2" -> addTask(sc);
            case "3" -> deletTask(sc);
            case "4" -> {
                RUN = false;
                System.out.println("Bye!!!");
              }
            default -> System.out.println("Error");
        }


      } 
    }

    private static void addTask(Scanner sc){
        System.out.println("Add a task");
        String t = sc.nextLine();
        task.add(t);
        System.out.println("Successful))");

    }

    private static void showTask(){
        if(task.isEmpty()){
            System.out.println("Empty");
        }else{
            for(int i=0; i<task.size();i++){
                System.out.println((i+1) +"." + task.get(i));
            }
        }

    }
    public static void deletTask(Scanner sc){
        showTask();
        if(!task.isEmpty()){
            try {
                System.out.println("Your delet choise");
                int index = Integer.parseInt(sc.nextLine()); 
                if( index >  0 && index<= task.size() ){
                    task.remove(index-1);
                    System.out.println("Task deleted");
                }else{
                    System.out.println("Invalid task number");

                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number");
            }
        }

    }
}


