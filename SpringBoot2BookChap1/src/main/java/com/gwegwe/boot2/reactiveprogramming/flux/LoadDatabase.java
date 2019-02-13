package com.gwegwe.boot2.reactiveprogramming.flux;

import com.gwegwe.boot2.reactiveprogramming.vo.Chapter;
import com.gwegwe.boot2.reactiveprogramming.vo.ChapterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

  @Bean
  CommandLineRunner init(ChapterRepository repository) {
    return args -> {
      Flux.just(
          new Chapter("Quick Start with Java"),
          new Chapter("Reactive Web with Spring Boot"),
          new Chapter("...and More!"))
          .flatMap(repository::save)
          .subscribe(System.out::println);
    };
  }
}
