import java.io.*;
public class WorkWithNodes {

        public static void main(String args []) {
            try(
                    InputStreamReader ins = new InputStreamReader(System.in);
                    BufferedReader buffered = new BufferedReader(ins);
            ) {


                while (true) {
                    System.out.println("Enter the comand: ");
                    String b = buffered.readLine();
                    String[] a = b.split("\\s+");
                    switch (a[0]){
                        case "exit":
                            System.out.println("The program closed");
                            return;
                        case "cd":
                            File folder = new File(a[1]);
                            folder.mkdir();
                            System.out.println("Add a folder");
                            break;
                        case "cf" :
                            File file = new File(a[1]);
                            file.createNewFile();
                            System.out.println("add a file");
                            break;
                        case "delete" :
                            File d = new File(a[1]);
                            d.delete();
                            System.out.println("delete");
                            break;
                        case "list" :
                            File lis = new File(a[1]);
                            String [] s = lis.list();
                            for(String f:s){
                                System.out.println("display list: " + f);}
                            break;
                        default:
                            System.out.println("doesn't exist");
                    }

                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }


