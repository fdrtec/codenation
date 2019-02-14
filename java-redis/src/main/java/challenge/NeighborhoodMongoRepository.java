package challenge;


import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.geo.GeoJsonPolygon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NeighborhoodMongoRepository extends MongoRepository<NeighborhoodMongo, String> {

    @Query("{ 'geometry' : ?0 }")
//    NeighborhoodMongo findOneNeighborhoodByGeometry(double x, double y);
//
//    NeighborhoodMongo findByGeometryWithin(Polygon polygon);
//
//    NeighborhoodMongo findOneByGeometryWithin(GeoJsonPolygon points);
//
//    List<NeighborhoodMongo> findByGeometryWithin(GeoJsonPolygon polygon);



   NeighborhoodMongo findByGeometryWithin(GeoJsonPoint point);
}
