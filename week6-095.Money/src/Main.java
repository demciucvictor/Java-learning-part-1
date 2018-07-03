
public class Main {

    public static void main(String[] args) {
      Money a = new Money(7,50);
Money b = new Money(1,60);

Money c = a.plus(b);

System.out.println(a);  // 10.00e
System.out.println(b);  // 5.00e
System.out.println(c);  // 15.00e

a = a.plus(c);          // NOTE: new Money-object is created and reference to that
                        //           is assigned to variable a.
                        //       The Money object 10.00e that variable a used to hold
                        //           is not referenced anymore

System.out.println(a);  // 25.00e
System.out.println(b);  // 5.00e
System.out.println(c);  // 15.00e
    }
}
