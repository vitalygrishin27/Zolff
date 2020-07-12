package app.Models;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "id", nullable = false, unique = true)
    private long id;

    @Column(name = "name", nullable = false, unique = true)
    private String teamName;

    @Column(name = "date")
    private Date date;

    @Column(name = "boss")
    private String boss;

    @Column(name = "village")
    private String village;

    @Column(name = "phone")
    private String phone;

    @Lob
    @Column(name = "symbolString")
    private String symbolString;

    @Lob
    @Column(name = "symbol")
    private byte[] symbol;

    @OneToMany(mappedBy = "team", fetch = FetchType.LAZY)
    private Collection<Player> players;

    @ManyToOne (optional = true)
    @JoinColumn(name = "id_season")
    private Season season;

 /*     @ManyToOne(optional = false)
    @JoinColumn(name = "id_region")
    private Region region;

  @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "competition_team",
            joinColumns = @JoinColumn(name = "team_id"),
            inverseJoinColumns = @JoinColumn(name = "competition_id"))
    @Fetch(FetchMode.SUBSELECT)
    private List<Competition> competitions = new ArrayList<>();

    @ManyToOne (optional = false)
    @JoinColumn(name = "id_competition")
    private Competition competition;
*/

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                '}';
    }

}
