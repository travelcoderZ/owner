package com.travelcoder.owner.repository;

import com.travelcoder.owner.domain.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File,Integer> {
}
