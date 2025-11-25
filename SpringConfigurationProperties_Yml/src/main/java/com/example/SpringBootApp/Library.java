package com.example.SpringBootApp;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "mylibrary")
public class Library {
	
	private String libraryName;
	
	private String address;
	
	
	private Librarian librarian;
	
	private List<Book> books;

	public Library() {
		super();
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Librarian getLibrarian() {
		return librarian;
	}

	public void setLibrarian(Librarian librarian) {
		this.librarian = librarian;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Library [libraryName=" + libraryName + ", address=" + address + ", librarian=" + librarian + ", books="
				+ books + "]";
	}
	

}
