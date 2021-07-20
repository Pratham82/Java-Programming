package Learn_OOP_in_Java.Data_Hiding;

class Assessment
{
    static int marks=0;
    public void increment()
    {
        marks++;
    }
    public static void main(String args[])
    {
        Assessment a1 = new Assessment();
        Assessment a2 = new Assessment();
        a1.increment();
        a2.increment();
        a2.increment();
        System.out.println("A1: marks are = " + a1.marks);
        System.out.println("A2: marks are = " + a2.marks);
    }
}

