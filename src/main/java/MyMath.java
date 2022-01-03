public class MyMath {

        private static int a;
        private static int b;
        private static int count = 0;

        public MyMath(int a, int b){
                this.a = a;
                this.b = b;
        }


        public static int getA() {
                return a;
        }

        public static int getB() {
                return b;
        }

        public static void setA(int a) {
                MyMath.a = a;
        }

        public static void setB(int b) {
                MyMath.b = b;
        }

        public static int add(int a, int b) {
        count++;
        return a+b;

}

public static int div(int a, int b) {
        count++;
        return a/b;

}

public static int sub(int a, int b){
        count++;
        return a-b;
}

public static int mult(int a, int b) {
        count++;
        return a*b;
}

public static int getCount(){
        return count;
}


}
