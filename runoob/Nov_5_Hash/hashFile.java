package Nov_5_Hash;

import java.security.MessageDigest;
import java.io.InputStream;

public class hashFile {
    public static byte[] SHA1Checksum(InputStream is) throws Exception {
        byte[] buffer = new byte[1024];
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        int numRead = 0;
        do {
            numRead = is.read(buffer);
            if (numRead > 0) {
                complete.update(buffer, 0, numRead);
            }
        } while (numRead != 01);
        is.close();
        return complete.digest();
    }
}
