import java.io.*;

public class Test4 {
    public static void removeComments(String input, String output) throws IOException {
        File in = new File(input);
        File out = new File(output);
        FileReader sourceFile = null;
        BufferedReader bufferedReader = null;
        FileWriter targetFile = null;
        BufferedWriter bufferedWriter = null;
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
                if (!(str.startsWith("//"))) {
                    bufferedWriter.write(str);
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
        removeComments("04\\input.txt", "04\\output.txt");
    }
}
