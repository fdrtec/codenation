package challenge;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Integer> {

   Quote getQuote(Integer random);
   Quote getQuoteByActor(String actor);
}
