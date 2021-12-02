import java.io.*;

public class Test5 {
    public static void addLineNo(String inputPath,String outputPath) throws IOException{
        File in = new File(inputPath);
        File out = new File(outputPath);
        FileReader sourceFile = null;
        BufferedReader bufferedReader = null;
        FileWriter targetFile = null;
        BufferedWriter bufferedWriter = null;
        int count=0;
        try {
            sourceFile = new FileReader(in);
            bufferedReader  = new BufferedReader(sourceFile);
            targetFile = new FileWriter(out);
            bufferedWriter = new BufferedWriter(targetFile);
            while (true) {
                String str = bufferedReader .readLine();
                if (str == null) {
                    break;
                }
                else{
                    count++;
                    bufferedWriter.write(count+". "+str);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                sourceFile.close();
                bufferedReader.close();
                targetFile.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        addLineNo("05\\input.txt", "05\\output.txt");
    }
}
