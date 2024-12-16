package jp.ac.uryukyu.ie.e245715;

class Report5 {

    public static void main(String[] args){

        /*条件１ String型変数 strを宣言し初期値としてnullを代入
        String str = null;

        //条件２ str.lengh()の内容を表示しようとする
        System.out.println(str.length()); */

        try{
            //処理したいコード
            String str = null;
            System.out.println(str.length());

        }catch(NullPointerException e){
            //NullPointerExceptionが起きた時の処理
            System.out.println(e.getMessage());


        }

    }

    
}
