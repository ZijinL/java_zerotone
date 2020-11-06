import java.io.File;

public class file_dfs {
    public static void dfs(String path) {
        File dir = new File(path);
        File[] fs = dir.listFiles();
        for(int i = 0; i < fs.length; i++) {
            System.out.println("file " + fs[i].getName());
        if(fs[i].isDirectory()) {
            System.out.println("directory " + fs[i].getName());
            dfs(path + File.separator + fs[i].getName());
        }
        }
    }

}
