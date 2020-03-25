package basic.helloworld;

public class Array {
    public static void main(String[] args) {
        // 动态初始化
        int[] myNum = new int[10];
        String[] saying = new String[10];

        // 静态初始化
        int[] yourNum = new int[]{
                2,3,5,6
        };
        String[] shit = new String[]{"'hello'", "world"};
        array_test("dongtai");
        array_test("jingtai");
    }

    public static void array_test(String str){
        switch(str){
            case "dongtai":
                int[] dongtai=new int[10];
                for(int i=0; i<10; i++){
                System.out.print(dongtai[i]);
            }
                System.out.println();
                break;
            case "jingtai":
                int[] jingtai={1, 2, 3};
                int[] jingtai2= new int[]{3, 4, 5};
                for(int i=0; i<3; i++){
                    System.out.print(jingtai[i]);
                    System.out.print(jingtai2[i]);
                }
                System.out.println();
                break;
        }
    }
}
