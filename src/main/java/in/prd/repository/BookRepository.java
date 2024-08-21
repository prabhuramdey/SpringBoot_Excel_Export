package in.prd.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.prd.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable>{

}
