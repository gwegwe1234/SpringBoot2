package com.gwegwe.boot2.reactiveprogramming.vo;

import com.gwegwe.boot2.reactiveprogramming.vo.Chapter;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {

}
