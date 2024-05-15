package excercise.first;

public class CibiPreferiti {
    public static void main(String[] args) {
        String[] cibi = {"Pizza", "Pasta", "Gelato", "Tiramisù", "Lasagna", "Risotto"};
        System.out.println(cibi.length);
        System.out.println(cibi[0]);
        System.out.println(cibi[cibi.length - 1 ]);
        System.out.println(cibi[(cibi.length - 1 ) / 2 ]);
    }
}
