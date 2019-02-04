package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class QuoteController {

	@Autowired
	private QuoteService quoteService;

	@RequestMapping(value = "/quote", method = RequestMethod.GET)
	public Quote findQuote() {
		return quoteService.getQuote();
	}

	@RequestMapping(value = "/quote/{actor}", method = RequestMethod.GET)
	public Quote findQuoteByActor(@PathVariable String actor) {
		return quoteService.getQuoteByActor(actor);
	}

}
