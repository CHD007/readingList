package com.chernyshov777.readinglist.repositories;

import com.chernyshov777.readinglist.domain.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader, String> {
    Reader findByUsername(String username);
}
