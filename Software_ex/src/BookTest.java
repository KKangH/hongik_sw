import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @BeforeEach
    void setUp() {
        System.out.println("Test 시작");
    }

    @Test
    void testAddBook() {
        System.out.println("책 추가 테스트 시작");
        Book book4 = new Book(4, "알고리즘", "Pae", 2022);
        Book book5 = new Book(5, "전기회로이론", "Jeon", 2021);
        Book book6 = new Book(6, "비디오이미지프로세싱", "Kim", 2023);

        assertTrue(Book.addBook(book4));
        assertFalse(Book.addBook(book4)); // 중복 추가 시도
        assertTrue(Book.addBook(book5));
        assertTrue(Book.addBook(book6));
    }

    @Test
    void testSearchBook() {
        System.out.println("책 검색 테스트 시작");
        
        assertNotNull(Book.searchBook("알고리즘"));
        assertNotNull(Book.searchBook("전기회로이론"));
        assertNotNull(Book.searchBook("비디오이미지프로세싱"));
        assertNull(Book.searchBook("데이터베이스 시스템")); // 존재하지 않는 책 검색
        
        
    }

    @Test
    void testRemoveBook() {
        System.out.println("책 제거 테스트 시작");

        assertTrue(Book.removeBook_id(4));
        assertTrue(Book.removeBook_id(5));
        assertFalse(Book.removeBook_id(4)); // 존재하지 않는 책 제거 시도
        
        assertTrue(Book.removeBook_name("비디오이미지프로세싱"));
        assertFalse(Book.removeBook_name(null));
        assertFalse(Book.removeBook_name("데이터베이스 시스템"));
        
        
    }
}
