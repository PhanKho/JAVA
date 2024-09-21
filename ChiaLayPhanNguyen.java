import java.util.InputMismatchException;
import java.util.Scanner;
public class ChiaLayPhanNguyen {
    public static void main(String[] args)
    {

        try
        {
            // nhap 2 so tu ban phim
            System.out.println("nhap so thu nhat: ");
            double a = new Scanner(System.in).nextDouble();

            System.out.println("nhap so thu hai: ");
            double b = new Scanner(System.in).nextDouble();


            if (b == 0)
            {
                throw new ArithmeticException("loi chia cho 0");  // neu b = 0 thi se nem ra ngoai le
            }

            else  // neu khong thi se thuc hien tiep

            {
                int c = ((int)(a/b));  // chuyen ket qua cua phep chia sang so nguyen

                System.out.println("phan nguyen cua phep chia: " + c ); // hien thi ket qua
            }
        }

        catch(ArithmeticException e)// bat ngoai le b = 0
        {
            System.out.println(e.getMessage());  // xy ly ngoai le ( thong bao loi)
        }

        catch(InputMismatchException e)// bat ngoai le khi nhap sai du lieu
        {

            System.out.println("nhap sai du lieu");  // xu ly ngoai le ( thong bao loi)
        }
    }
}