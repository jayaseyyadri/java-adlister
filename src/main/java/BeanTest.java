import model.Album;
import model.Author;
import model.Quote;

import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {

        Album newAlbum = new Album();

            newAlbum.setId(2);
            newAlbum.setArtist("Micheal jackson");
            newAlbum.setName("BAD");

//            System.out.println(newAlbum.getId());
//            System.out.println(newAlbum.getArtist());
//            System.out.println(newAlbum.getName());

        Author newAuthor = new Author();

            newAuthor.setId(1);
            newAuthor.setFirstName("mrinal");
            newAuthor.setLastName("k");

        Author genius = new Author();
        genius.setId(2);
        genius.setFirstName("Albert");
        genius.setLastName("einstein");


        Quote inspiringQuotes = new Quote();
        Quote motivationalQuotes = new Quote();
        Quote interestingQuotes = new Quote();

        inspiringQuotes.setId(22);
        inspiringQuotes.setAuthor(newAuthor);
        inspiringQuotes.setContent("It always seems impossible until its done  ");

//            System.out.println(inspiringQuotes.getAuthor().getFirstName());
//            System.out.println(inspiringQuotes.getAuthor().getLastName());

        interestingQuotes.setContent("Everyone is a genius but if you judge a fish on its ability to climb a tree it will live its wholel ife thinkihng it is stupid");
        interestingQuotes.setAuthor(genius);
//             System.out.println(interestingQuotes.getAuthor().getFirstName());
//             System.out.println(interestingQuotes.getAuthor().getLastName());

        motivationalQuotes.setContent("Do what you have to do until you can do what you to do  ");

        ArrayList<Quote> Quotations = new ArrayList<>();
                Quotations.add(inspiringQuotes);
//                Quotations.add(motivationalQuotes);
                Quotations.add(interestingQuotes);

                for(Quote q:Quotations){
                    System.out.println(q.getContent());
                    System.out.println(q.getAuthor().getFirstName());
                    System.out.println(q.getAuthor().getLastName());


                }



    }
}
