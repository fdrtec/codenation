package challenge;

import java.util.List;
import java.util.Objects;

/**
 * Classe para mapear o bairro no Redis
 *
 */
public class NeighborhoodRedis {

    private String id;
    private String name;
    private List<RestaurantRedis> restaurants;

    public NeighborhoodRedis() {
    }

    public NeighborhoodRedis(String id, String name, List<RestaurantRedis> restaurants) {
        this.id = id;
        this.name = name;
        this.restaurants = restaurants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NeighborhoodRedis that = (NeighborhoodRedis) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
