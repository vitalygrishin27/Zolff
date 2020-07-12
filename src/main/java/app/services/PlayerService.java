package app.services;

import app.Models.Player;
import app.Models.PlayerRole;
import app.Models.Team;

import java.util.List;

public interface PlayerService {
    void save(Player player);

    Player findPlayerById(long id);

    Player getPlayerByIdCard(String id);

    List<Player> findAllPlayers();

    List<Player> findAllPlayersInTeam(Team team);

    List<Player> findAllInactivePlayers();

    List<Player> findAllActivePlayersInTeam(Team team);

    List<Player> findAllActivePlayersInTeamByRole(Team team, PlayerRole playerRole);

    List<Player> findAllActivePlayersInTeamByRoleUndefined(Team team);

    Player findPlayerByRegistration(String registration);

    void update(Player player);

    void delete(Player player);
}
