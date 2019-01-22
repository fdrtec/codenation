package challenge;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Player {

    private String fullName;
    private String club;
    private Integer age;
    private Date birthDate;
    private String nationality;
    private Double eurWage;
    private BigDecimal eurReleaseClause;


    public Player(String fullName, String club, Integer age, String birthDate, String nationality, Double eurWage, String eurReleaseClause) throws ParseException {
        this.fullName = fullName;
        this.club = club;
        this.age = age;
        this.nationality = nationality;
        this.birthDate = convertDate(birthDate);
        this.eurWage = eurWage;
        this.eurReleaseClause = convertBigData(eurReleaseClause);
    }

    private BigDecimal convertBigData(String urReleaseClause) {
        if(urReleaseClause.equals("")){
            return BigDecimal.valueOf(0);
        }else {
            return new BigDecimal(urReleaseClause);
        }
    }

    private Date convertDate (String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateFormated = format.parse(date);
        return dateFormated;
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

    public Date getBirthDate() { return birthDate; }

    public Double getEurWage() { return eurWage; }
}
