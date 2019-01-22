package com.travelcoder.owner.repository;

import com.travelcoder.owner.domain.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic,Integer> {
}
