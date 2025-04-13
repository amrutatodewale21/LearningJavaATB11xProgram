package Encapsulation;


public class Lab001_encapsulation {
    public static void main(String[] args) {
        vwologin oj1 = new vwologin("Merigo");
        System.out.println(oj1.getUsername());
       oj1.setPassword(123456,true);
        System.out.println(oj1.getPassword());


    }


}

 class vwologin{

    private String username;
    private long password;
    vwologin(String Username){


        this.username=Username;


    }

     public String getUsername() {
         return username;
     }

     public void setUsername(String username) {
         this.username = username;
     }

     public long getPassword() {
         return password;
     }

     public void setPassword(long Password, boolean isadmin) {
        if (isadmin)
        {
          this.password=Password;

        }

     }
 }
