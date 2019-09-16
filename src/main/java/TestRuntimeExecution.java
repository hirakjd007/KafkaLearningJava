public class TestRuntimeExecution {
    public static void main(String[] args) {
        try{
            // print a message
            System.out.println("Executing notepad.exe");

            // create a process and execute notepad.exe
            Process process = Runtime.getRuntime().exec("notepad.exe");

            // print another message
            System.out.println("Notepad should now open.");
            System.out.println(System.getenv("JAVA_HOME"));
        }catch (Exception e){
            System.out.println("Exception occurred "+e.getStackTrace());
        }
    }
}
