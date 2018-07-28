public class Enumeration {

    enum Power{
        Strong(3),Moderate(2),Weak(1);


        int var;
        private Power(int i){
            var = i;
        }

        public int getPower(){
            return var;
        }
    }

    public static void main(String[] args) {
        Power p1 = Power.Strong;
        Power p2 = Power.Moderate;
        Power p3 = Power.Weak;

//        for (Power temp : Power.values()){
//            System.out.println("Power of Players : "+temp);
//        }
//        System.out.println(Power.Moderate);
        System.out.println(p1.getPower());

    }
}
