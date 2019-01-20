package challenge;

import java.math.BigDecimal;

public class Player implements Comparable{

    private Integer id;
    private String name;
    private String fullName;
    private String club;
    private String nationality;
    private BigDecimal eurReleaseClasse;


    public Player(Integer id, String name, String fullName, String club, String nationality, BigDecimal eurReleaseClasse) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.club = club;
        this.nationality = nationality;
        this.eurReleaseClasse = eurReleaseClasse;
    }

    public String getFullName() {
        return fullName;
    }

    public String getNationality() {
        return nationality;
    }

    public String getClub() {
        return club;
    }

    public BigDecimal getEurReleaseClasse() {
        return eurReleaseClasse;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
