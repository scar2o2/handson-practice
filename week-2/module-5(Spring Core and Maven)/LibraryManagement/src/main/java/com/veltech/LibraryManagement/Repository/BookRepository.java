package com.veltech.LibraryManagement.Repository;

public class BookRepository {
	 private String[] books = {
	       "Java Programming",
	       "Spring Framework",
	       "Data Structures",
           "Database Systems",
	       "Operating Systems"
	 };

	 public String[] getBooks() {
	      return books;
	 }
}
