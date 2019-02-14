package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.stereotype.Service;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	NeighborhoodMongoRepository neighborhoodMongoRepository;

	private final RedisOperations<String, NeighborhoodRedis> redisRedisOperations;
	private final MongoOperations mongoOperations;

	@Autowired
	public RestaurantServiceImpl(RedisOperations<String, NeighborhoodRedis> redisRedisOperations, MongoOperations mongoOperations) {
		this.redisRedisOperations = redisRedisOperations;
		this.mongoOperations = mongoOperations;
	}

	@Override
	public NeighborhoodRedis findInNeighborhood(double x, double y) {
		NeighborhoodMongo neighborhoodMongo = findNeighborhood(x, y);



		System.out.println(neighborhoodMongo.toString());
		return null;
	}

	private NeighborhoodMongo findNeighborhood(double x, double y) {
		return mongoOperations.findOne(
				query(where("geometry").intersects(new GeoJsonPoint(new Point(x, y)))),
				NeighborhoodMongo.class);
	}

}
