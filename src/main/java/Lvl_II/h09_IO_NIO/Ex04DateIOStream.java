package Lvl_II.h09_IO_NIO;

import java.io.*;

public class Ex04DateIOStream {
    public static void main(String[] args) {
        String pathD = "C:\\Users\\union\\IdeaProjects\\L01EastE\\src\\main\\java\\Lvl_II\\h09_IO_NIO\\";
        try (DataInputStream dIS = new DataInputStream(new FileInputStream(pathD+"test01.b2"));
             DataOutputStream dOS = new DataOutputStream(new FileOutputStream(pathD+"test01.b2"))){
            dOS.writeBoolean(true);
            dOS.writeByte(5);
            dOS.writeShort(200);
            dOS.writeInt(50000);
            dOS.writeLong(7_000_000_000_000L);
            dOS.writeFloat(3.14F);
            dOS.writeDouble(9_000_000_000_000.6349640987654321D);
            System.out.println(dIS.readBoolean());
            System.out.println(dIS.readByte());
            System.out.println(dIS.readShort());
            System.out.println(dIS.readInt());
            System.out.println(dIS.readLong());
            System.out.println(dIS.readFloat());
            System.out.println(dIS.readDouble());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
