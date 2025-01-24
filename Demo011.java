class parent{
    String a = "hello";
    String b = "Hi";
}
class child extends parent{
    String c = super.a;
    String d = super.b;
}

class Demo11{
    public static void main(String[] args) {
        child obj = new child();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}