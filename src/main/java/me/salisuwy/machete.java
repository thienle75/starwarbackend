package me.salisuwy;

import javax.persistence.*;

@Entity
public class machete {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private String content;

    public machete() {  }

    public machete(String ip, String movieid, int order) {
        this.setIp(ip);
        this.setMovieId(movieid);
        this.setOrder(order);
    }

    public machete(int id, String ip, String movieid, int order) {
        this.setId(id);
        this.setMovieId(movieid);
        this.setIp(ip);
        this.setOrder(order);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMovieId() {
        return movieid;
    }

    public void setMovieId(String movieid) {
        this.movieid = movieid;
    }

    public int getOrder() {
        return movieid;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "machete{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", movieid='" + movieid + '\'' +
                ", order='" + order + '\'' +
                '}';
    }
}
