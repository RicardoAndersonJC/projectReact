package entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "tb_score")
public class Score {
    @EmbeddedId
    private ScorePk id = new ScorePk();
    private Double value;

    public void setMovie(Movies movies){
        id.setMovies(movies);
    }
    public void setUser(User user){
        id.setUser(user);
    }

    public ScorePk getId() {
        return id;
    }

    public Double getValue() {
        return value;
    }

    public void setId(ScorePk id) {
        this.id = id;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Score(ScorePk id, Double value) {
        this.id = id;
        this.value = value;
    }

    public Score() {
    }
}
