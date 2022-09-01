interface Main_Account{
  public void AC_NO(); // interface method
}

interface SAVING {
  public void ac_no(); // interface method
}

// DemoClass "implements" FirstInterface and SecondInterface
class LOAN implements Main_Account,SAVING {
  public void AC_NO() {
    System.out.println("87450045");
  }
  public void ac_no() {
    System.out.println("62798900");
  }
}

class Main_1 {
  public static void main(String[] args) {
    LOAN l = new LOAN();
    l.AC_NO();
    l.ac_no();
  }
}