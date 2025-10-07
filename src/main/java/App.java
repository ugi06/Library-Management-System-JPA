import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library_management");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();


//        transaction.begin();
//
//        Author author = new Author();
//        author.setName("Trevanian(Rodney William Whitaker)");
//        author.setBirthDate(LocalDate.parse("1931-06-12"));
//        author.setCountry("ABD");
//        entityManager.persist(author);
//
//        Book book = new Book();
//        book.setName("Shibumi");
//        book.setPublicationYear(1979);
//        book.setStock(100);
//        entityManager.persist(book);
//
//
//        Publisher publisher = new Publisher();
//        publisher.setEstablishmentYear(2025);
//        publisher.setAddress("Ankara-Çankaya");
//        publisher.setName("Tükkan :D");
//        entityManager.persist(publisher);
//
//        Category category = new Category();
//        category.setName("Kurgu");
//        category.setDescription("Kurgu, tamamen veya kısmen gerçeklere dayanmayan; yazar veya sanatçının hayal gücünün eseri olan kişi, yer ve olaylar içeren eser.");
//        entityManager.persist(category);
//
//
//        BookBorrowing borrowing = new BookBorrowing();
//        borrowing.setBorrowingDate(LocalDate.now());
//        borrowing.setBorrowerName("Uğur Taşdelen");
//        borrowing.setReturnDate(LocalDate.parse("2025-10-09"));
//        entityManager.persist(borrowing);
//
//
//        transaction.commit();
//
//        //Join yapılarına örnekler
//
//        transaction.begin();
//
//        book.setBookAuthor(author);
//
//        book.setPublisher(publisher);
//
//        book.setCategoryList(new ArrayList<>());
//        book.getCategoryList().add(category);
//
//        author.setBookList(new ArrayList<>());
//        author.getBookList().add(book);
//
//        publisher.setBookList(new ArrayList<>());
//        publisher.getBookList().add(book);
//
//        category.setBookList(new ArrayList<>());
//        category.getBookList().add(book);
//
//        borrowing.setBorrowingBook(book);
//
//        transaction.commit();
//
        transaction.begin();

        Book shibumi = entityManager.find(Book.class,1);

        System.out.println(shibumi.toString());

        System.out.println(shibumi.getCategoryList());

        transaction.commit();

        entityManager.close();
        entityManagerFactory.close();


    }
}
