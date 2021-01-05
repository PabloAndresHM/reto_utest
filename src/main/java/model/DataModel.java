package model;

public class DataModel {
   String name,last_name,email,birth_day,birth_month,birth_year,city,zip_code,password,text_successful;

    public DataModel(String name, String last_name, String email, String birth_day, String birth_month,
                     String birth_year, String city, String zip_code, String password, String text_successful) {
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.birth_day = birth_day;
        this.birth_month = birth_month;
        this.birth_year = birth_year;
        this.city = city;
        this.zip_code = zip_code;
        this.password = password;
        this.text_successful = text_successful;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(String birth_day) {
        this.birth_day = birth_day;
    }

    public String getBirth_month() {
        return birth_month;
    }

    public void setBirth_month(String birth_month) {
        this.birth_month = birth_month;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getText_successful() {
        return text_successful;
    }

    public void setText_successful(String text_successful) {
        this.text_successful = text_successful;
    }
}
