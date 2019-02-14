package challenge;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.geo.GeoJsonPolygon;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexType;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//@Document(collection = "neighborhood")
//public class Neighborhood {
//    @Id
//    private String id;
//
//    @Field("geometry")
//    @GeoSpatialIndexed(type = GeoSpatialIndexType.GEO_2DSPHERE)
//    private GeoJsonPolygon geometry;
//
//    @Field("name")
//   private String name;
//
//    public Neighborhood() {
//    }
//
//    public Neighborhood(String id, GeoJsonPolygon geometry, String name) {
//        this.id = id;
//        this.geometry = geometry;
//        this.name = name;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public GeoJsonPolygon getGeometry() {
//        return geometry;
//    }
//
//    public void setGeometry(GeoJsonPolygon geometry) {
//        this.geometry = geometry;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
