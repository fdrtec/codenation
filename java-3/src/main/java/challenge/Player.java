package challenge;

import java.math.BigDecimal;

public class Player {

    private Integer id;
    private String name;
    private String fullName;
    private String club;
    private Integer age;
    private String nationality;
    private BigDecimal eurReleaseClause;


    public Player(Integer id, String name, String fullName, String club, Integer age,String nationality, String eurReleaseClause) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.club = club;
        this.age = age;
        this.nationality = nationality;
        this.eurReleaseClause = convertBigData(eurReleaseClause);
    }

    private BigDecimal convertBigData(String urReleaseClause) {
        if(urReleaseClause.equals("")){
            return BigDecimal.valueOf(0);
        }else {
            return new BigDecimal(urReleaseClause);
        }
    }

    public String getFullName() {
        return fullName;
    }

    public String getNationality() {
        return nationality;
    }

    public Integer getAge() {
        return age;
    }

    public String getClub() {
        return club;
    }

    public BigDecimal getEurReleaseClause() {
        return eurReleaseClause;
    }
}
