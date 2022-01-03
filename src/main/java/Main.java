public class Main {


    public static void main(String[] args) {



       User user3 = new User();
        user3.setId(5);
        user3.setLogin("Barmaley");
        user3.setPassword("pirat111");


        UserSocial usS1 = new UserSocial();
        usS1.setId(111);
        usS1.setLogin("Petroviun");
        usS1.setPassword("preees1");
        usS1.setUserAge(25);
        usS1.setUserName("arkadiy");


        WebMaster wm1 = new WebMaster();
        wm1.setId(44);
        wm1.setLogin("googleman");
        wm1.setPassword("googy");
        wm1.setWebsite("google.com");


        MyMath math = new MyMath(1,1);
        int result = MyMath.mult(5, 5);
       // System.out.println("Результат операции равен: "+ result + ", количество операций:  " + MyMath.getCount());

        System.out.println(user3.getTextInfo() + "\n" + usS1.getTextInfo() +"\n" +  wm1.getTextInfo());
    }
}
