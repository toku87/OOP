package BookAndAuthor;

import org.junit.Assert;
import org.junit.Test;

public class BookAndAuthorTest {

    @Test

    public void authorDefaultGetNameGetEmailGetGender (){
        Author tolkien = new Author("Tolkien", "email", 'm' );
        Assert.assertEquals("Tolkien", tolkien.getName());
        Assert.assertEquals("email", tolkien.getEmail());
        Assert.assertEquals(new Character('m'), tolkien.getGender());
    }
    @Test
    public void authorDefaultSetEmail(){
        Author tolkien = new Author("Tolkien", "email", 'm' );
        tolkien.setEmail("tolkien@gmail.com");
        Assert.assertEquals("tolkien@gmail.com", tolkien.getEmail());
    }
    @Test
    public void bookDefaultGetNameGetAuthorGetPrice () {
        Author tolkien = new Author("Tolkien", "email", 'm' );
        Book book = new Book("LotR", tolkien, 23.99);
        Assert.assertEquals("LotR", book.getName());
        Assert.assertEquals(tolkien, book.getAuthor());
        Assert.assertEquals(23.99, book.getPrice(), 0.01);
        Assert.assertEquals(0, book.getQty(),0.1);
    }
    @Test
    public void bookDefaultGetNameGetAuthorGetPriceGetQty () {
        Author tolkien = new Author("Tolkien", "email", 'm');
        Book book2 = new Book("LotR", tolkien, 23.99, 50);
        Assert.assertEquals("LotR", book2.getName());
        Assert.assertEquals(tolkien, book2.getAuthor());
        Assert.assertEquals(23.99, book2.getPrice(), 0.01);
        Assert.assertEquals(50, book2.getQty());
    }
    @Test
    public void bookDefaultSetPrice() {
        Author tolkien = new Author("Tolkien", "email", 'm');
        Book book = new Book("LotR", tolkien, 23.99);
        book.setPrice(555.55);
        Assert.assertEquals(555.55, book.getPrice(),0.1);
    }
    @Test
    public void bookDefaultSetQty () {
        Author tolkien = new Author("Tolkien", "email", 'm');
        Book book2 = new Book("LotR", tolkien, 23.99, 50);
        book2.setQty(457);
        Assert.assertEquals(457, book2.getQty());
    }
}
