class firstAssigment{
    public static void main(String[] args){
        final float e = 2.71828182846F;
        double a = -0.5;
        double b = 1.7;
        double t = 0.44;

        double y = Math.pow(e,-b*t) * Math.sin(a*t+b) - Math.sqrt(Math.abs(b*t+a));
        System.out.println(y);

        double s = b * Math.sin(Math.pow(a*t,2)*Math.cos(2*t)) - 1;
        System.out.println(s);

    }
}