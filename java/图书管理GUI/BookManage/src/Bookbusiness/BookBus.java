package Bookbusiness;

import java.util.ArrayList;
import java.util.List;

import BookDao.BookException;
import BookDao.Bookdao;
import BookDomain.Book;

public class BookBus {
	private Bookdao bd = new Bookdao();

	public void add(Book b){ //����ͼ��
		bd.add(b);
	}
	public void update(Book b){ //����ͼ��
		bd.update(b);
	}
	public void delete(Book b){ //ɾ��ͼ��
		bd.delete(b);
	}
	public void lend(Book b){	//����
		bd.lend(b);
	}
	public void returnBook(Book b){ //����
		bd.returnBook(b);
	}
	
	public List<Book> queryAll() {
		return bd.queryAll();
		
	}
	public void lend(String str1, String str2) throws BookException {
		bd.lend(str1,str2);
		
	}
	public void returnBook(String str1, String str2) {
		bd.returnBook(str1,str2);
		
	}
}
