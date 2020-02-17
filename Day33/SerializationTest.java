package Day33;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        //Creating object of Employee DB
        EmployeeDB ed = new EmployeeDB(54,"Prathamesh","Pass@2019");

        //-----------------Serialization-------------------
        //Converting object type to bytes

        //throws FileNotFoundException
        FileOutputStream fos = new FileOutputStream("Emp1.ser");

        //throws IOException
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //Writing Data on ed object to fos(Emp1.ser)
        // Passing an object of EmployeeDB in writeObject method
        oos.writeObject(ed);

        //----------------De-serialization-------------------
        //Converting bytes to object type

        FileInputStream fis = new FileInputStream("Emp1.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        //throws ClassNotFoundException
        //The object which is read from Emp1.ser will be converted object type and stored in EmployeeDE type
        //As we know the class type is Non primitive datatype
        EmployeeDB ed2 = (EmployeeDB) ois.readObject();
        //Printing data in ed2
        System.out.println(ed2);

    }
}
