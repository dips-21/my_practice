package fileChannel;

import java.io.File;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

//reverses content of a specified file using memory-mapped i/o
class FileChannelTest {

	public static void main(String[] args) throws Exception {
		Path doc = new File(args[0]).toPath(); //Path.of(args[0]);
		 try( FileChannel channel = FileChannel.open(doc, StandardOpenOption.READ, StandardOpenOption.WRITE)){
			FileLock lock = channel.lock(); //other processes will not be allowed to access this file image
			int n = (int)channel.size();
			MappedByteBuffer image = channel.map(FileChannel.MapMode.READ_WRITE, 0, n);
			for(int i = 0, j = n - 1; i < j; ++i, j--){
				byte ib = image.get(i);
				byte jb = image.get(j);
				image.put(i, jb);
				image.put(j, ib);
			}
			lock.release();
		}
	}
}

