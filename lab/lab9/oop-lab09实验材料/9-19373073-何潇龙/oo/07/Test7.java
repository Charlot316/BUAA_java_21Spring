import java.io.*;

public class Test7 {
    public static void copyFile(String inputPath,String outputPath) throws IOException{
        File in = new File(inputPath);
        File out = new File(outputPath);
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
                else{
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
    public static void copyDirectory(String sourceDir, String targetDir) throws IOException{
        File sourceDirectory = new File(sourceDir);
        File targetDirectory = new File(targetDir);
        if (!targetDirectory.exists()) {
            targetDirectory.mkdirs();
        }
        for(File i: sourceDirectory.listFiles()){
            if(i.isDirectory()){
                String newFileName = i.getPath().substring(i.getPath().lastIndexOf("\\")+1);
                String desPathStr = targetDir + File.separator + newFileName;
                copyDirectory(i.getPath(),desPathStr);
            }
            else{
                String newFileName = i.getPath().substring(i.getPath().lastIndexOf("\\")+1);
                String desPathStr = targetDir + File.separator + newFileName;
                copyFile(i.getPath(),desPathStr);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        copyDirectory("07\\sourceDir", "07\\targetDir");
    }
}
