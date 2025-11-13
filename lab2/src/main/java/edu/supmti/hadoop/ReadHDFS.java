package main.java.edu.supmti.hadoop;

import java.io.*;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;

public class ReadHDFS {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: ReadHDFS <path_to_file>");
            System.exit(1);
        }

        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(conf);
        Path filePath = new Path(args[0]);

        if (!fs.exists(filePath)) {
            System.out.println("File not found: " + filePath);
            System.exit(1);
        }

        FSDataInputStream in = fs.open(filePath);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
        fs.close();
    }
}
