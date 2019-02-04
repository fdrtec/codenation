package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository repository;

	@Override
	public Quote getQuote() {
        return repository.getQuote(retornaRandom());

	}

	@Override
	public Quote getQuoteByActor(String actor) {
		return repository.getQuoteByActor(actor);
	}

    private Integer retornaRandom() {
        Random random = new Random();
        return random.nextInt(10000);
    }

}
