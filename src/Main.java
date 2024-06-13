import Entities.Comment;
import Entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment commentOne = new Comment("have a nice trip!");
        Comment commentTwo = new Comment("Wow that's awesome!");
        Post postOne = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand","I'm going to visit this wonderful country!" , 12);

        postOne.addCommentList(commentOne);
        postOne.addCommentList(commentTwo);

        System.out.println(postOne);
    }
}