import java.security.spec.RSAOtherPrimeInfo;

public class BussinesCard {
    public static void main(String[] args) {
        String name = "Janek";
        String surname = "Budynek";
        String tel = "123456789";
        String city = "Warszawa";
        String firstLine = "*  " + name + " " + surname;
        String secondLine = "*  Telefon: " + tel;
        String thirdLine = "*  Adres: " + city;
        StringBuilder stars = new StringBuilder();
        int longestLine;
        longestLine=Math.max(firstLine.length(),secondLine.length());

        for (int i = 0; i < longestLine; i++)
            stars.append("*");


        System.out.println(stars);
        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(thirdLine);
        System.out.println(stars);


    }
}
