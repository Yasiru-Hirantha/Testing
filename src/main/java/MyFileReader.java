import java.io.*;
import java.util.Scanner;

public class MyFileReader {
    public static void main(String[] args) {
        MyFileReader myFileReader = new MyFileReader();
        myFileReader.myMethod();

    }
    public void myMethod(){
        Scanner input = new Scanner(System.in);
        System.out.println("0.Create a role");
        System.out.println("1.Login");
        System.out.print("Please enter the choice : ");
        int choice = input.nextInt();
        switch (choice){
            case 0 : roleMethod();
            break;
            case 1 : if(validation()){
                saveData();
            };
                break;
            default:
                System.out.println("invalid choice");
                break;

        }
    }

    private String saveData() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the name : ");
            String name = input.nextLine();
            System.out.print("Enter the age : ");
            int age = input.nextInt();
            input.nextLine();
            System.out.print("Enter the team :");
            String team = input.nextLine();
            FileWriter fileWriterDetails = new FileWriter("details.txt",true);
            fileWriterDetails.write("{"+name+", "+age+" ,"+team+"}\n");
            System.out.println("player "+name+" added successfully");
            fileWriterDetails.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "new Player saved";

    }

    public String roleMethod(){
        Scanner input2 = new Scanner(System.in);
        System.out.println("1.admin");
        System.out.println("2.player");
        System.out.print("Enter the role : ");
        int role = input2.nextInt();
        input2.nextLine();

        try {
            FileWriter fileWriterAdmin = new FileWriter("admin.txt",true);
            FileWriter fileWriterPlayer= new FileWriter("player.txt",true);
            System.out.print("Enter the name : ");
            String name = input2.nextLine();
            System.out.print("Enter the password :");
            String password = input2.nextLine();
            if (role==1){
                fileWriterAdmin.write(name+password+"admin\n");
                fileWriterAdmin.close();
                System.out.println("new Admin role is created");
            } else if (role==2) {
                fileWriterPlayer.write(name + password + "player\n");
                fileWriterPlayer.close();
                System.out.println("new Player role is created");
            }else {
                System.out.println("Wrong input");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "new role created";
    }
    public boolean validation(){
        boolean flag =false;
        Scanner input = new Scanner(System.in);
        System.out.println("1.admin");
        System.out.println("2.player");
        System.out.print("Enter the role : ");
        int role = input.nextInt();
        input.nextLine();

        try {
            BufferedReader bufferedReaderAdmin = new BufferedReader(new FileReader("admin.txt"));
            BufferedReader bufferedReaderPlayer= new BufferedReader(new FileReader("player.txt"));
            if(role==1){
                System.out.print("Enter the name : ");
                String name = input.nextLine();

                System.out.print("Enter the password : ");
                String password = input.nextLine();
                String credentials;
                while((credentials = bufferedReaderAdmin.readLine())!=null){
                    if (credentials.equals(name+password+"admin")){
                        flag= true;
                        System.out.println("Credentials are correct");

                    }
                }

            } else if (role ==2) {
                System.out.print("Enter the name : ");
                String name = input.nextLine();

                System.out.println("Enter the password : ");
                String password = input.nextLine();
                String credentials;
                while((credentials = bufferedReaderPlayer.readLine())!=null){
                    if (credentials.equals(name+password+"player")){
                        flag=  true;
                        System.out.println("Credentials are correct");

                    }
                }

            }else System.out.println("invalid choice");
            bufferedReaderPlayer.close();
            bufferedReaderAdmin.close();
            return flag;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
