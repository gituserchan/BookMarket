/**
 * 
 */
package dto;

import java.util.ArrayList;
import dto.Book;
/**
 * 
 */
public class BookRepository {
	
	private ArrayList<Book> listOfBooks = new ArrayList<Book>();
	
	public BookRepository() {
		Book book1 = new Book("ISBN1234","C# ���α׷���", 27000);
		book1.setAuthor("���糲");
		book1.setDescription("C#�� ó�� ���ϴ� ���ڸ� ������� �ϴ��� ����ó�� �ڼ��� ������ å�̴�. �� �˾ƾ� �� �ٽ� ������"
				+ "�⺻ ������ �ִ��� ���� ����������, �߿��� ������ ���� ����, ����, ���� ���͵�, ���� �������� �ѹ� ��"
				+ "������ �� �ִ�.");
		book1.setPublisher("�Ѻ���ī����");
		book1.setCategory("IT�����");
		book1.setUnitsInStock(1000);
		book1.setReleaseDate("2022/10/06");
		
		Book book2 = new Book("ISBN1235", "�ڹٸ�����", 30000);
		book2.setAuthor("�۹̿�");
		book2.setDescription("�ڹٸ� ó�� ���� �л��� ���� �ڹ��� �⺻ ����� �ǽ� ������ �׸��� �̿��Ͽ� ���� �����մϴ�. �ڹ��� �̷��� ����-�⺻ ����-������Ʈ ������ �ܰ躰 �н��� �����ϸ�, �� é���� ������Ʈ�� �ǽ��ϸ鼭 �¶��� ������ �ϼ��� �� �ֵ��� �����Ͽ����ϴ�.");
		book2.setPublisher("�Ѻ���ī����");
		book2.setCategory("IT������");
		book2.setUnitsInStock(1000);
		book2.setReleaseDate("2023/01/01");

		Book book3 = new Book("ISBN1236", "���̽� ���α׷���", 30000);
		book3.setAuthor("�ּ�ö");
		book3.setDescription("���̽����� ���α׷����� �����ϴ� �Թ��ڰ� ���� ������ �� �ֵ��� �⺻ ������ ���ϰ� �����ϸ�, �پ��� ������ �����մϴ�. ���� ���α׷����� ���� ������ �����ϸ鼭 ���̽����� �����͸� ó���ϴ� ����� ���ϴ�.");
		book3.setPublisher("�Ѻ���ī����");
		book3.setCategory("IT������");
		book3.setUnitsInStock(1000);
		book3.setReleaseDate("2023/01/01");

		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
	}
	public ArrayList<Book> getAllBooks(){
		return listOfBooks;
	}
	

}
