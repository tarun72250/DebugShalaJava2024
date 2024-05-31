package day_18_multithreadingAssignment;
//5. Create a thread for copying contents from a source file to a destination file.

import java.io.*;

public class B_05_FileCopyThread implements Runnable 
{
    private String sourceFile;
    private String destinationFile; 

    public B_05_FileCopyThread(String sourceFile, String destinationFile) 
    {
        this.sourceFile = sourceFile;
        this.destinationFile = destinationFile;
    }

    public void run() 
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully.");
        } 
        catch (IOException e) 
        {
            System.err.println("An error occurred during file copy: " + e.getMessage());
        }
    }

}
