package coreJava.multithreading;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.locks.Lock;

class FileChannelTest {
    //reverses content of a specified file using memory-mapped i/o

        public static void main(String[] args) throws Exception {
            var doc = Path.of(args[0]);
            try(FileChannel channel = FileChannel.open(doc, StandardOpenOption.READ, StandardOpenOption.WRITE)){
                FileLock lock = channel.lock(); //other processes will not be allowed to access this file image
                int n = (int)channel.size();
                MappedByteBuffer image = channel.map(FileChannel.MapMode.READ_WRITE, 0, n);
                for(int i = 0, j = n - 1; i < j; ++i, j--){
                    byte ib = image.get(i);
                    byte jb = image.get(j);
                    image.put(i, jb);
                    image.put(j, ib);
                }
                System.out.println(image.toString());
                lock.release();
            }
        }
    }

