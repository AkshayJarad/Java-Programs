import java.util.*;

class Program272
{
    public static boolean CheckBit(int iNo)
    {
        int iMask = 0x00010000;
        int iResult = 0;
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        bRet = CheckBit(iNo);
    
        if(bRet == true)
        {
            System.out.println("17th bit is ON");
        }
        else
        {
            System.out.println("17th bit is OFF");
        }
    }
}

/*

    Bit position 17

    0000    0000    0000    0001    0000    0000    0000    0000
    0       0       0       1       0       0       0       0

    0x00010000
*/