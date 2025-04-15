package Methods;

public class Methods {

    public static void main(String[] args) {
        String steps = brushTeeth("Reach out with hand and grab toothbrush", "Place toothbrush on sink", "Reach out and grab toothpaste");
        String favorite = favoriteShow("Favorite Show: One Piece");
        int sum = total(9,10);
        System.out.printf("The sum is %d.\n", sum);
    }

    public static String brushTeeth(String step1, String step2, String step3) {
        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);

        return step1;
    }


    public static String favoriteShow(String favshow1){

        System.out.println(favshow1);
        return favshow1;
    }

    public static int total(int x, int y){
        int result = (9 + 10);
        return result;
    }



}

