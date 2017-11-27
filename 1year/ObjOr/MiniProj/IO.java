import java.io.*;

public class IO {
    public static boolean isThereFile(String fname) {
        File f = new File( fname+".txt");
        if( f.exists() && !f.isDirectory() ) {
            return true;
        }
        return false;
    }
    public static void outFile( String fname, String content) {
        try {
            BufferedWriter bw = new BufferedWriter( new FileWriter( fname+".txt" ));
            
            bw.write(content);
            bw.close();
        }catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}